package com.example;

import com.example.bank.BankService;
import com.example.bank.BankServicePortType;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;

import javax.net.ssl.*;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class ClientFactory {
    static private BankServicePortType port;

    public static BankServicePortType getClient(){
        if (port == null){
            initOtaClient();
        }
        return port;
    }

    private static void initOtaClient() {
        String username = "test";
        String password = "test";
        String apiUrl = "http://url/sdp/ws?wsdl";
        URL url;

        try {
            url = new URL(apiUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        initSSLContext();

        var service = new BankService(url, new QName("http://bank.example.com/", "Bank")).getBankServicePort();

        ((BindingProvider) service)
                .getRequestContext()
                .put(MessageContext.HTTP_REQUEST_HEADERS, authorizationHeader(username, password));

        port = (BankServicePortType) service;
    }

    private static final TrustManager[] ALL_ACCEPTING_TRUST_MANAGER = new TrustManager[]{new X509TrustManager() {

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType)
                throws CertificateException {
        }

        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType)
                throws CertificateException {
        }
    }};

    private static void initSSLContext() {
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(null, ALL_ACCEPTING_TRUST_MANAGER, new SecureRandom());
            SSLSocketFactory sslSocketFactory = ctx.getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory(sslSocketFactory);
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, List<String>> authorizationHeader(String username, String password) {
        final var credentials = Base64
                .getEncoder()
                .encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8));

        return Map.of("Authorization", List.of("Basic " + credentials));
    }
}

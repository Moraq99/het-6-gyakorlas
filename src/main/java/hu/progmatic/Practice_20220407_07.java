package hu.progmatic;

import java.nio.charset.StandardCharsets;

public class Practice_20220407_07 {
    public static void main(String[] args) {
        String plaintext = "Sziasztok! Ez tök jó lesz. Ez nagyon érdekes.";
        String password = "Progmatic!";
        String cypher = encrypt(plaintext, password);
        System.out.println(cypher);
        String plain2 = encrypt(cypher, password);
        System.out.println(plain2);
    }

    public static String encrypt(String plaintext, String password) {
        byte[] plainBytes = plaintext.getBytes(StandardCharsets.UTF_8);
        byte[] passwordBytes = password.getBytes(StandardCharsets.UTF_8);
        byte[] cypherBytes = new byte[plainBytes.length];

        for (int i = 0; i < plainBytes.length; i++) {
            cypherBytes[i] = (byte) (plainBytes[i] ^ passwordBytes[i % passwordBytes.length]);
        }

        return new String(cypherBytes, StandardCharsets.UTF_8);
    }
}

package hu.progmatic;

import java.nio.charset.StandardCharsets;

public class Practice_20220407_07 {
    public static void main(String[] args) {
        String plaintext = "Sziasztok! Ez tök jó lesz. Ez nagyon érdekes.";
        String password = "Progmatic!";
        System.out.println("====================");
        System.out.println("\tBEMENET:");
        System.out.println("====================");
        System.out.println("Szöveg: " + plaintext);
        System.out.println("Jelszó: " + password);

        System.out.println();
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("\tTITKOSÍTVA:");
        System.out.println("====================");
        String cypher = encrypt(plaintext, password);
        System.out.println(cypher);
        System.out.println();
        System.out.println("====================");
        System.out.println("\tVISSZAFEJTVE:");
        System.out.println("====================");
        String plain2 = encrypt(cypher, password);
        System.out.println(plain2);
    }

    public static String encrypt(String plaintext, String password) {
        byte[] plainBytes = plaintext.getBytes(StandardCharsets.ISO_8859_1);
        byte[] passwordBytes = password.getBytes(StandardCharsets.ISO_8859_1);
        byte[] cypherBytes = new byte[plainBytes.length];

        for (int i = 0; i < plainBytes.length; i++) {
            cypherBytes[i] = (byte) (plainBytes[i] ^ passwordBytes[i % passwordBytes.length]);
        }

        return new String(cypherBytes, StandardCharsets.ISO_8859_1);
    }
}

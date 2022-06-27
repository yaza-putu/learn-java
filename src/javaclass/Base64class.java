package javaclass;

import java.util.Base64;

public class Base64class {
    public static void main(String[] args) {
        String query = "Akumulatif";
        String encode = Base64.getEncoder().encodeToString(query.getBytes());

        byte[] decode = Base64.getDecoder().decode(encode);
        String result = new String(decode);
        System.out.println(result);
    }
}

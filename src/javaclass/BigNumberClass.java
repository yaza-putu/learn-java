package javaclass;

import java.math.BigInteger;

public class BigNumberClass {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000000000000000");
        System.out.println(a.add(b));
    }
}

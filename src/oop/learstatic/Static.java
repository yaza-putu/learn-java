package oop.learstatic;

public class Static {
    public static final String APPLICATION = "Wahyu junaedi";
    public static final String VERSION = "V1.0.0";
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    public static int sum(int... values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }
        return total;
    }
}

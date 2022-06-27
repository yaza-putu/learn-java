package javaclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        // pattern and matcher

        String name = "putu Yasa Zaman";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);


        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}

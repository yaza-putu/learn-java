package lamda;

import lamda.utilFunction.StaticUtil;

import java.util.function.Predicate;

public class MetodReferenceApp {

    public static void main(String[] args) {

//        Predicate<String> predicateIsLowerCase = value -> StaticUtil.isLowercase(value);
        Predicate<String> predicateIsLowerCase = StaticUtil::isLowercase;
        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    public void run() {
        Predicate<String> predicateLowerCase = this::isLowercase;

        System.out.println(predicateLowerCase.test("test"));
    }



    public boolean isLowercase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}

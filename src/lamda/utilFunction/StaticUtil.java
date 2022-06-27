package lamda.utilFunction;

public class StaticUtil {
    public static boolean isLowercase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}

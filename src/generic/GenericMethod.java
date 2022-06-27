package generic;

public class GenericMethod {

    public static <T> int count(T[] array) {
        return array.length;
    }
}

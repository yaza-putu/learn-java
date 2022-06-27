package generic;

public class WildCard {
    public static void main(String[] args) {
        GenericClass<String> name = new GenericClass<>("Say");
        printLength(name);
    }

    public static void printLength(GenericClass<?> data) {
        System.out.println(data.getData());
    }
}

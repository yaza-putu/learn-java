package generic;

public class GenericApp {
    public static void main(String[] args) {

        // single generic
        GenericClass<String> name = new GenericClass<String>("Nice");
        System.out.println(name.getData());

        // multy generic
        MultipleGeneric<String,Integer> multi = new MultipleGeneric<String,Integer>("Yasa", 2);
        System.out.println(multi.getFirst());

        // generic method
        String[] names = {"swayan", "ss"};
        System.out.println( GenericMethod.count(names));

    }
}

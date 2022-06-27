package generic;

public class Invariant {

    public static void main(String[] args) {
        GenericClass<String> name = new GenericClass<>("nasi");
         //doit(name);

        GenericClass<Object> intai = new GenericClass<>(100);
        doit(intai);
    }

    public static void doit(GenericClass<Object> objectGenericClass) {
        //
    }
}

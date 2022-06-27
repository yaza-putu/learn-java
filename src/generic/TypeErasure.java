package generic;

import javaclass.ObjectClass;

public class TypeErasure {
    public static void main(String[] args) {
        GenericClass mydata = new GenericClass("naasi");

        GenericClass<Integer> genericClass = (GenericClass<Integer>) mydata;

        Integer number = genericClass.getData( );
        System.out.println(number);

    }
}

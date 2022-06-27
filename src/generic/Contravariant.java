package generic;

public class Contravariant {
    public static void main(String[] args) {
        GenericClass<Object> myobject = new GenericClass<>("Eko");
        GenericClass<? super String> mydata = myobject;
        process(mydata);
        System.out.println(mydata.getData());
    }

    public static void process(GenericClass<? super String> mydata) {
        //String result = mydata.getData(); // berbahaya saat get data
        mydata.setData("nasi");
    }
}

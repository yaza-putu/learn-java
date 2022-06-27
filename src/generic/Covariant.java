package generic;

public class Covariant {
    public static void main(String[] args) {
        GenericClass<String> data = new GenericClass<>("Makanan");
        myHeart(data);
    }

    public static void myHeart(GenericClass<? extends  Object> data) {
        // tidak bisa set data
        Object object = data.getData();
        System.out.println(object);
    }
}

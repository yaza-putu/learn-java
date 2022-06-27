package generic;

public class MultipeBoundedType {
    public static void main(String[] args) {
       //Data<Manager> managerData = new Data<>(new Manager()); // error karna manager tidak implement canSayhello interface
        Data<VicePresident> vicePresidentData = new Data<VicePresident>(new VicePresident());
    }

    public static interface canSayHello {
        void hello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Manager implements canSayHello {

        @Override
        public void hello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Manager & canSayHello> {
        private T hearth;

        public Data(T hearth) {
            this.hearth = hearth;
        }

        public T getData() {
            return hearth;
        }

        public void setData(T hearth) {
            this.hearth = hearth;
            hearth.hello("yasa");
        }
    }

}

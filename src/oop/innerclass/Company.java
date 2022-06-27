package oop.innerclass;

public class Company {
    private String name;

    public class Employee {
        private String name;

        public String getName() {
            return this.name;
        }
    }

}

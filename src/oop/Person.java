package oop;

public class Person {
   String name;
   String address;
   final String country = "Indonesia";

   public Person(String name, String address) {
       this.name = name;
       this.address = address + " "+ this.country;
   }

    public String getAddress() {
        return address.toUpperCase();
    }

    public String getName() {
        return name.toUpperCase();
    }
}

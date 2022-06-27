package oop.hidding;


import oop.Manager;

public class HiddingApp {

    public static void main(String[] args) {
        Child child = new Child();
        Manager manager = new Manager();
        manager.jabatan();

        Parent parent = child;
        parent.doIt("yaa");
        System.out.println(parent.name);
    }
}

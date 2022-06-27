package oop;

public class Manager {
    final String jabatan = "Manager";
    String name;

    String welcome(String name) {
        return "Selamat datang " + name;
    }

    public String jabatan () {
        return "Jabatan saya adalah " + this.jabatan;
    }
}

class ViceManager extends Manager {
    String name;

    public ViceManager(String name) {
        this.name = name;
    }

    String whoIs() {
        return "Selamat datang " + this.name + "Kamu adalah asisten manager disini";
    }
}

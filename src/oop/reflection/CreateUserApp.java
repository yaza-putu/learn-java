package oop.reflection;

import oop.exception.Validated;

public class CreateUserApp {
    public static void main(String[] args) {
        CreateUserRequest user = new CreateUserRequest();
        Validated.ValidationReflection(user);
    }
}

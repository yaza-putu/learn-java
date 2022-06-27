package oop.exception;

import oop.anotation.NotBlank;

import java.lang.reflect.Field;

public class Validated {
    public static void validate(String name) throws ManualException {
        if(name == null) {
            throw new ManualException("Name tidak boleh kosong");
        }
    }

    public static void validateRuntime(String name) {
        if (name == null) {
            throw new Runtime("null we");
        }
    }

    public static void ValidationReflection(Object o) {
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // validate
                try {
                    String value = (String) field.get(o);
                    if (value == null) {
                        throw new Database("fiedl" + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("access dilarang " + field.getName());
                }
            }
        }

    }
}

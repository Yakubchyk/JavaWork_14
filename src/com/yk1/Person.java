package com.yk1;

import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;

    public Person(int age, String name) throws IOException {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

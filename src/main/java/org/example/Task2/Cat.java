package org.example.Task2;

public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Mew");
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
        '}';
    }
}


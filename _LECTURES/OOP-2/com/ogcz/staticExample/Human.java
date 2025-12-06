package com.ogcz.staticExample;

public class Human {
    public int age; // accessible outside class when using public
    static public long population; // accessible outside

    String name;
    int salary;
    boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population += 1;
    }

}

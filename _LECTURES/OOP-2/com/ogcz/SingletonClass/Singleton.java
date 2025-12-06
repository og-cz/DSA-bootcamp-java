package com.ogcz.SingletonClass;

public class Singleton {
    private int num = 0;

    private Singleton() { // private means this all code will be used for this file only
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

class Run {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
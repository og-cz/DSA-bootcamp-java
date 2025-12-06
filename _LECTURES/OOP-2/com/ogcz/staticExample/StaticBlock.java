package com.ogcz.staticExample;

// this is a demo to show intalisation of static variables
public class StaticBlock {
    static int a = 3;
    static int b;

    // will only run once, when object is first created and loaded for the first
    // time
    static {
        System.out.println("i am a static block!");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}

package com;

import com.ogcz.packages.greet.Greeter;
import com.ogcz.staticExample.Human;

public class Main {
    public static void main(String[] args) {
        Greeter.greets();
        
        Human kunal = new Human(40, "kunal", 0, false);
        Human rahul = new Human(22, "rahul", 15000, true);

        System.out.println(rahul.age);
        System.out.println(kunal.population);

    }
}

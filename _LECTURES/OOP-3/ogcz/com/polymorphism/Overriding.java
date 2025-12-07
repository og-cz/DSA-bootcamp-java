// @formatter:off
package ogcz.com.polymorphism;

public class Overriding extends Shapes {

    int x = 0;

    @Override // annotation: this doesnt do anything in logic its just indicator its overriding Shapes Area method
    public void area() {
        System.out.println("overriding the area");
    }
}
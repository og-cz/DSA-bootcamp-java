import ogcz.com.polymorphism.*;

public class RunPoly {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        square.area();

        Shapes triangle = new Triangle(); // shapes have access to triangle which shows polymorphism
        triangle.area();
    }

}

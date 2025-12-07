package ogcz.com.inheritance;

public class Box {
    double l;
    public double h;
    public double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    void DisplayInfo() {
        System.out.println("displaying info");
    }

}

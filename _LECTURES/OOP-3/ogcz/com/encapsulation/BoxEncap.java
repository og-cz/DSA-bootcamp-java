package ogcz.com.encapsulation;

public class BoxEncap {
    private double l; // data hiding
    public double h;
    public double w;

    public BoxEncap() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}

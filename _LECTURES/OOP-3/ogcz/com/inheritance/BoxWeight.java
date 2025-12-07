package ogcz.com.inheritance;

public class BoxWeight extends Box {
    public double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;

    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        // used to initaliz values pressent in the parent/base class
        this.weight = weight;
    }
}

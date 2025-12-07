import ogcz.com.encapsulation.*;

public class RunEncap {
    public static void main(String[] args) {
        BoxEncap box1 = new BoxEncap();

        System.out.println(box1.w);
        System.out.println(box1.getL());

        box1.setL(10);
        System.out.println(box1.l); // not visible, thats just encapsulation
        System.out.println(box1.getL());
    }
}

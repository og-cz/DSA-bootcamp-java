// @formatter:off
import ogcz.com.inheritance.*;

public class RunInheritance {
    public static void main(String[] args) {

        Box box1 = new Box(4.6, 7.9, 10.1);
        Box box2 = new Box(box1);
        System.out.println(box1.w + " " + box1.h);
        System.out.println(box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box3.h + " " + box3.weight);
        System.out.println(box4.h + " " + box4.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8); // its reference to parent but the consturctor is child
        System.out.println(box5.w);
        // System.out.println(box5.width); unable to access because the type of Box determines not the constructor/object
        
    }
}

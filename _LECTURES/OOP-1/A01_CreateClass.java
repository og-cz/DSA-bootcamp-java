public class A01_CreateClass {

    public static void main(String[] args) {

        Student kunal = new Student(1, "kunal", 100);
        System.out.println(kunal.rno + " " + kunal.name);

        Student newKunal = new Student(kunal, 174);
        System.out.println(newKunal.rno + " " + newKunal.name + " " + newKunal.height);

    }
}

class Student {
    
    final int INCREASE = 2;
    int rno;
    String name;
    float marks;
    float height;

    void greeting() {
        System.out.println("hello i am" + " " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    // copy constructor, but this is overloading constructor
    Student(Student other, float height) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
        this.height = height;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
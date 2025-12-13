package SingleInheritance;

public class Child extends Parent {

    public Child(String name) {
        super("pankaj");

        System.out.println("Child Constructor " + name);
    }

    public int print() {
        System.out.println("child method");
        return 0;
    }

    public static void main(String[] args) {
        Child child = new Child("rushi");
        child.display();
        child.print();
    }
}

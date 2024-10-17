class Parent {
    static void display() {
        System.out.println("Static method in Parent class.");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class.");
    }
}
public class question_8_2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();
        parent.display();
        childAsParent.display();
        child.display();
}
}

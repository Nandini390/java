public class animal3{
void eat(){
    System.out.println("eating...");
}
}
class dog extends animal3{
    void bark(){
        System.out.println("barking...");
    }
}
class cat extends animal3{
    void meow(){
        System.out.println("meowing...");
    }
}
class testinheritance{
    public static void main(String[] args){
      cat c= new cat();
      c.meow();
      c.eat();
    }
}

interface InterfaceA{
    void methodA1();
    void methodA2();
}
interface InterfaceB{
    void methodB1();
    void methodB2();
}
interface InterfaceC{
    void methodC1();
    void methodC2();
}
interface combined_interface extends InterfaceA, InterfaceB, InterfaceC{
    void methodD();
}
class baseclass{
    void baseMethod(){
        System.out.println("base class method.");
    }
}
class MyClass extends baseclass implements combined_interface{
   @Override
   public void methodA1(){
    System.out.println("Implementation of methodA1.");
   }
   @Override
   public void methodA2(){
    System.out.println("Implementation of methodA2.");
   }
   @Override
   public void methodB1(){
    System.out.println("Implementation of methodB1.");
   }
   @Override
   public void methodB2(){
    System.out.println("Implementation of methodB2.");
   }
   @Override
   public void methodC1(){
    System.out.println("Implementation of methodC1.");
   }
   @Override
   public void methodC2(){
    System.out.println("Implementation of methodC2.");
   }
   @Override
   public void methodD(){
    System.out.println("Implementation of methodD.");
   }
}
public class question_18_2 {
    public static void useInterfaceA(InterfaceA a){
        a.methodA1();
        a.methodA2();
    }
    public static void useInterfaceB(InterfaceB b){
        b.methodB1();
        b.methodB2();
    }
    public static void useInterfaceC(InterfaceC c){
        c.methodC1();
        c.methodC2();
    }
    
    public static void useCombinedInterface(combined_interface d){
        d.methodD();
    }
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        useInterfaceA(myObject);
        useInterfaceB(myObject);
        useInterfaceC(myObject);
        useCombinedInterface(myObject);
        myObject.baseMethod();
    }
}

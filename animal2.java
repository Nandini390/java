public class animal2 {
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal2{
    void bark(){
        System.out.println("barking...");
    }
}
class babydog extends dog{
    void weep(){
        System.out.println("weeping...");
    }
}
class inheritance2{
    public static void main(String[] args){
        babydog d= new babydog();
        d.weep();
        d.bark();
        d.eat();
    }
}

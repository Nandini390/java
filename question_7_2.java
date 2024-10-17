class animal{
    
    public void sound(){
        System.out.println("making sound....");
     }
}
class dog extends animal{
    public void sound(){
        System.out.println("barking...");
    }
}
class cat extends animal{
    public void sound(){
        System.out.println("meowing...");
    }
}
public class question_7_2 {
    public static void main(String[] args){
    animal m1= new animal();
    m1.sound();
    dog m2= new dog();
    m2.sound();
    cat m3= new cat();
     m3.sound();
}
}

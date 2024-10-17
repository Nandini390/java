class base{
    base(){
        System.out.println("i am base class constructor");
    }
}
class child extends base{
    child(){
        System.out.println("i am a child class constructor");
    }
}
public class question_5_2 {
    public static void main(String[] args){
       child c1= new child();
    }
}

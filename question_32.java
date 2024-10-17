class base{
    int x;
    int y;
    base(int a, int b){
        x=a;
        y=b;
        System.out.println("i am parameterized constructor");
    }
    int add(){
        return x+y;
    }
}
public class question_32 {
    public static void main(String[] args){
      base b1= new base(2,3);
      System.out.println("the addition is: " + b1.add());
    }
}

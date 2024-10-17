class parent{
    int x,y;
    parent(){}
    parent(int a){
        x=a;
    }
    parent(int a, int b){
        x=a;
        y=b;
    }
    public int add(){
           return x+y;
    }
}
public class question_4_2 {
    public static void main(String [] args){
        parent p1= new parent();
        parent p2= new parent(2,3);
        System.out.println("the sum is: " + p2.add());
    }
}

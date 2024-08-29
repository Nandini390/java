public class methods {
    int logic(int a,int b){
        int z;
        if(a>b){
           z=a+b;
        }else{
            z=b-a;
        }
        return z;
}    
public static void main(String[] args){
      int a=2;
      int b=5;
      methods o1=new methods();
      int z=o1.logic(a,b);
      System.out.println(z);
}
}

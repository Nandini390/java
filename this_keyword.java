public class this_keyword {
    int x;
    int z;
    this_keyword(int x){
    x=x;
    System.out.println(x);
    }
    this_keyword(int x, int z){
      this.x=x;
      this.z=z;
      System.out.println(x + " " + z);
    }
    public static void main(String[] args){
     this_keyword o1=new this_keyword(5);
     this_keyword o2=new this_keyword(2,3);
    }
}

class Distance{
    int dist;
    Distance(){}
    Distance(int d){
        this.dist=d;
    }
    public void traveltime(){
        float time=(float)dist/60;
        System.out.println("the time taken to cover the distance " + dist + " is "+ time + " hours ");
    }
}
class DistanceMKS extends Distance{
   int d;
   DistanceMKS(int d){
    this.d=d;
   }
   public void traveltime(){
    float time=(float)d/100;
    System.out.println("the time taken to cover the distance " + d + " is " + time + " seconds ");
   }
}
public class question_12_2 {
    public static void main(String [] args){
     Distance d1= new Distance(34);
     d1.traveltime();
     DistanceMKS d2= new DistanceMKS(23);
     d2.traveltime();
    }
}


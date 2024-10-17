class ThreeDObject{
   public void surfaceArea(){
      System.out.println("calculates area");
   }
   public void Volume(){
      System.out.println("calculates volume");
   }
}
class Box extends ThreeDObject{
    int l,b,h;
    Box(int a, int b, int c){
        l=a;
        this.b=b;
        h=c;
    }
    public void surfaceArea(){
       System.out.println("the area of box is: " + 2*(l*b+b*h+h*l));
    }
    public void Volume(){
       System.out.println("the volume of box is: " + l*b*h);
    }
}
class Cube extends ThreeDObject{
    int a;
    Cube(int x){
        a=x;
    }
    public void surfaceArea(){
      System.out.println("the area of cube is: " + 6*a*a);
    }
    public void Volume(){
     System.out.println("the volume of cube is: " + a*a*a);
    }
}
class Cylinder extends ThreeDObject{
    int r,h;
    Cylinder(int a, int b){
        r=a;
        h=b;
    }
    public void surfaceArea(){
     System.out.println("the area of cylinder is: " + (2*3.14*r*h)+(2*3.14*r*r));
    }
    public void Volume(){
      System.out.println("the volume of cylinder is: " + 3.14*r*r*h);
    }
}
class Cone extends ThreeDObject{
    int l;
    int r;
    Cone(int a, int b){
        r=a;
        l=b;
    }
    public void surfaceArea(){
     System.out.println("the area of cone is: " + 3.14*r*(r+l));
    }
    public void Volume(){
     System.out.println("the volume of cone is: " + (1/3)*3.14*r*r*l  );
    }
}
public class question_9_2 {
    public static void main(String[] args){
      Box a= new Box(1,3,2);
      a.surfaceArea();
      a.Volume();
      Cube b=new Cube(4);
      b.surfaceArea();
      b.Volume();
      Cylinder c= new Cylinder(2,5);
      c.surfaceArea();
      c.Volume();
      Cone d= new Cone(2,6);
      d.surfaceArea();
      d.Volume();
    }
}

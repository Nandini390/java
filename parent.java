class parents {
        void eat(){
            System.out.println("eating...");
            System.out.println("this is parent class");
        }
    }
    class child extends parent{
        void eat(){
            System.out.println("running...");
            System.out.println("this is child class");
        }
    }
 public class parent{
        public static void main(String[] args){
           child c1=new child();
           c1.eat();
        }
     }


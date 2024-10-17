class stack{
    int []arr;
    int size;
    int top;
    stack(int s){
        size=s;
        top=-1;
        arr= new int[size];
    }
    void push(int x){
        if(size-top>1){
            top++;
            arr[top]=x;
        }else{
            System.out.println("stack overflow");
        }
    }
    void pop(){
      if(top==-1){
        System.out.println("stack is empty");
      }else{
        top--;
      }
    }
    boolean isempty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }
}
public class question_25 {
    public static void main(String[] args){
       stack st= new stack(2);
       st.push(3);
       st.push(5);
       System.out.println("the top element is: " + st.peek());
       st.pop();
       System.out.println("the top element is: " + st.peek());
       if(st.isempty()){
         System.out.println("stack is empty...");
       }else{
        System.out.println("stack is not empty...");
       }
    }
}

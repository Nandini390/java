class queue{
    int []arr;
    int qfront;
    int rear;
    int size;
    public
    queue(int s){
        size=s;
        arr=new int[size];
        qfront=0;
        rear=0;
    }
    boolean isempty(){
       if(qfront==rear){
        return true;
       }else{
        return false;
       }
    }
    void enqueue(int data){
        if(rear==size){
            System.out.println("queue is full");
        }else{
            arr[rear]=data;
            rear++;
        }
    }
    int dequeue(){
        if(qfront==rear){
            return -1;
        }else{
            int ans=arr[qfront];
            arr[qfront]=-1;
            qfront++;
            if(qfront==rear){
                qfront=0;
                rear=0;
            }
            return ans;
        }
    }
    int front(){
        if(qfront==rear){
            return -1;
        }else{
            return arr[qfront];
        }
    }
}
public class question_26 {
    public static void main(String[] args){
      queue q= new queue(3);
      q.enqueue(4);
      q.enqueue(6);
      System.out.println("the front element of queue is: " + q.front());
      q.dequeue();
      System.out.println("the front element of queue is: " + q.front());
      if(q.isempty()){
        System.out.println("queue is empty...");
      }else{
        System.out.println("queue is not empty...");
      }
    }
}

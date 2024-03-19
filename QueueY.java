public class QueueY {
 
    static class Queue {

        static int arr[];

        static int size;
        static int rear = -1;
        

        Queue(int n){

            arr = new int[n];
            this.size = n;


        }

        public static boolean isEmpty(){

            return rear == -1;

        }

        // enqueue
        public static void add(int data){

            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
        }

        rear++;
        arr[rear] = data;

        }

        // dequeue
        public static int remove(){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

           int front = arr[0];
           for(int i = 0; i < rear; i++){
               arr[i] = arr[i+1];
           }
           rear--;
           return front;

        }
        // peek
        public static int peek(){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];

        }

    }

    public static void main(String[] args) {
            
            Queue queue = new Queue(5);
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);
            queue.add(60);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    }
    
}

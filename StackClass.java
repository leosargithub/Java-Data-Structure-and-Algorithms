public class StackClass {
    
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     static class Stack{

        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push (int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        public static void pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return;
            }
            head = head.next;
        }
        public static int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

     }
public static void main(String[] args) {

    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    
}

}

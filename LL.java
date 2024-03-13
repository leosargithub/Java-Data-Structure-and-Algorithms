import java.util.List;

public class LL {
    Node head;
    private int size;
LL(){
    this.size = 0;
}

    class Node{

        String data;
        Node next;
        Node(String data){

            this.data = data;
            this.next = null;
            size++;
        
        }
    }

    // Add first, Add last 

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){

            head = newNode;
            return;
        }
        newNode.next = head;
        
        head = newNode;
    }

         public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){

            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
     public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
     }

     public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("A");
        list.addFirst("is");
        list.printlist();
        list.addLast("B");
        list.printlist();

        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
        System.out.println("Size of list is: " + list.getSize());
        
    }
    
}

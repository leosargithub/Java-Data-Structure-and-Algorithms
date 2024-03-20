public class BST {
    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public static Node insert(Node root, int val){

        if(root == null){

            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
     }
     public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
     
    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1,4,6,10,11,14};
        Node root = null;

        for(int val: values){
            root = insert(root, val);
        }
        inorder(root);
        System.out.println();

        if(search(root, 9)){
            System.out.println("Found");


    }
     else{
        System.out.println("Not Found");

}
    }
}

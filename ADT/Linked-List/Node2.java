public class Node2{

    int value;
    Node next;

    public Node2(int v, Node n){
       value = v;
       next = n ;

    }

    public static void main(String[] args) {
        Node myList = new Node(44, new Node(97, new Node(23,new Node(17,null))));

        System.out.print(myList);
    }
}
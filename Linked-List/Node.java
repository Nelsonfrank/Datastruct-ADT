// import org.graalvm.compiler.graph.Node;

class Node {
    int value;
    Node next;

    Node(int v, Node n){
        value = v;
        next = n;
    }

    public static void main(String args[]){
         
        Node temp = new Node(17, null);
        temp = new Node(78, temp);
        temp = new Node(70, temp);
        
        Node myList = new Node(90, temp);

        System.out.print(myList);
    }
}
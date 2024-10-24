package datastructures.linkedlist;

public class InsertNodeAtEnd {

    private Node head;
    InsertNodeAtEnd(){
        this.head = null;
    }
    public Node insertAtEnd(int data){
        if(head == null){
            head = new Node(data);
        }else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;
    }

    public void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        InsertNodeAtEnd node = new InsertNodeAtEnd();
        node.insertAtEnd(10);
        node.insertAtEnd(20);
        node.insertAtEnd(30);
        node.insertAtEnd(40);
        node.printList();

        System.out.println();

        node.head = new Node(50);
        node.head.next = new Node(60);
        node.head.next.next = new Node(70);

        node.printList();
    }
}

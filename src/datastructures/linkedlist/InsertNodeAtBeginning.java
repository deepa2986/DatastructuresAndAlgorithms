package datastructures.linkedlist;

public class InsertNodeAtBeginning {
    private Node head;

    public InsertNodeAtBeginning(){
        this.head = null;
    }
    public Node insertNodeAtHead(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node node = new Node(data);
            node.next = head;
            head = node;
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

        InsertNodeAtBeginning node = new InsertNodeAtBeginning();
        node.insertNodeAtHead(40);
        node.insertNodeAtHead(30);
        node.insertNodeAtHead(20);
        node.insertNodeAtHead(10);
        node.printList();

        System.out.println();
        node.head = new Node(80);
        node.head.next = new Node(60);
        node.head.next.next = new Node(40);
        node.printList();


    }
}

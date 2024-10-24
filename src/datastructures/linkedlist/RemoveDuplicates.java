package datastructures.linkedlist;

public class RemoveDuplicates {

    private Node head;
    public Node removeDuplicates(Node head){
        Node node = head;
        while (node != null && node.next != null){
            if(node.data == node.next.data){
                node.next = node.next.next;
            }
            node = node.next;
        }
        return head;
    }

    public void printNode(Node head){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {

        RemoveDuplicates duplicates = new RemoveDuplicates();
        duplicates.head = new Node(2);
        duplicates.head.next = new Node(9);
        duplicates.head.next.next = new Node(9);
        duplicates.head.next.next.next = new Node(19);
        duplicates.head.next.next.next.next = new Node(19);

        duplicates.printNode(duplicates.head);
        System.out.println();

        duplicates.removeDuplicates(duplicates.head);
        duplicates.printNode(duplicates.head);

    }
}

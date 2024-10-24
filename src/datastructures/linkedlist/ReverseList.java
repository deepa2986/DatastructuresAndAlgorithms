package datastructures.linkedlist;

public class ReverseList {

    private Node head;
    public Node reverseList(Node head){
      Node temp = null;
      Node next = head;
      Node previous = null;

      while (next != null){
          temp = next.next;
          next.next = previous;
          previous = next;
          next  = temp;
      }
      return previous;
    }

    public void printList(Node head){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {

        ReverseList list = new ReverseList();
        list.head = new Node(2);
        list.head.next = new Node(9);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(1);

        list.printList(list.head);

        System.out.println();
        Node reverseList = list.reverseList(list.head);
        list.printList(reverseList);
    }
}

package datastructures.linkedlist;

public class PrintMiddleElement {

    private Node head;

    public void printMiddleElement(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element : " +slow.data);
    }

    public Node getMiddleElement(Node head){
        Node slow = head;
        Node fast = head;
         while (fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
    }
    public static void main(String[] args) {

        PrintMiddleElement element = new PrintMiddleElement();
        element.head = new Node(1);
        element.head.next = new Node(2);
        element.head.next.next = new Node(3);
        element.head.next.next.next = new Node(4);
    //   element.head.next.next.next.next = new Node(12);
//        element.head.next.next.next.next.next = new Node(8);
//        element.head.next.next.next.next.next.next = new Node(90);

        element.printMiddleElement();
        Node middleElement = element.getMiddleElement(element.head);
        System.out.println(middleElement.data);
    }
}

package datastructures.linkedlist;
public class LengthOfLinkedList {
    private Node head;
    LengthOfLinkedList(){
        this.head = null;
    }
    public int getLengthOfList(){
        int count = 0;
        Node node = head;
        while (node != null){
            node = node.next;
            count++;
        }
        return count;
    }

    public int lengthOfListByRecursion(Node node){
        if(node == null){
            return 0;
        }
        return 1 + lengthOfListByRecursion(node.next);
    }
    public static void main(String[] args) {

        LengthOfLinkedList list = new LengthOfLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        int lengthOfList = list.getLengthOfList();
        System.out.println(lengthOfList);

        int lengthOfListByRecursion = list.lengthOfListByRecursion(list.head);
        System.out.println(lengthOfListByRecursion);

    }
}

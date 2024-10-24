package datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLists {

    private Node head;
    public Node getIntersectionPoint(Node node1, Node node2){

        if(node1 == null || node2 == null){
            return null;
        }
        Set<Node> nodeSet = new HashSet<>();
        Node temp1 = node1;
        while (temp1 != null){
            nodeSet.add(temp1);
            temp1 = temp1.next;
        }

        Node temp2 = node2;
        while (node2 != null){
            if(nodeSet.contains(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }

    public void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        IntersectionOfTwoLists list1 = new IntersectionOfTwoLists();
        list1.head = new Node(8);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(10);
        list1.head.next.next.next = new Node(4);

        list1.printList();

        IntersectionOfTwoLists list2 = new IntersectionOfTwoLists();
        list2.head = new Node(5);
        list2.head.next = new Node(11);
        list2.head.next.next = list1.head.next.next;
        //list2.head.next.next = new Node(34);
        list2.head.next.next.next = new Node(19);
        list2.head.next.next.next.next = new Node(9);

        System.out.println();
        list2.printList();

        System.out.println();
        IntersectionOfTwoLists lists = new IntersectionOfTwoLists();
        Node intersectionPoint = lists.getIntersectionPoint(list1.head, list2.head);
        System.out.println(intersectionPoint.data);
    }
}

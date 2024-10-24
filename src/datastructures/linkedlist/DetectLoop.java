package datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectLoop {

    public boolean hasCycle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head.next;

        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean detectLoop(Node node){

        Set<Node> nodeSet = new HashSet<>();
        while(node != null){
            if(nodeSet.contains(node)){
                return true;
            }else {
                nodeSet.add(node);
            }
            node = node.next;
        }
        return false;
    }

//    public void printNode(Node node){
//        Node temp = node;
//        while (temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
    public static void main(String[] args) {

        Node node = new Node(4);
        node.next = new Node(5);
        node.next.next = new Node(1);
        node.next.next.next = new Node(6);
        node.next.next.next.next = new Node(8);
        node.next.next.next.next.next = node.next.next.next;


        DetectLoop loop = new DetectLoop();
        boolean hasCycle = loop.hasCycle(node);
        System.out.println(hasCycle);

        System.out.println();

   //     loop.printNode(node);

        boolean detectLoop = loop.detectLoop(node);
        System.out.println(detectLoop);
    }
}

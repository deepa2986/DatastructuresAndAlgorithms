package datastructures.linkedlist;

import java.util.Stack;

public class CheckPalindrome {

    public static boolean isPalindromeByUsingStack(Node head){
        Node node = head;
        Stack<Integer> nodeStack = new Stack<>();
        while (node != null){
            nodeStack.push(node.data);
            node = node.next;
        }
        node = head;
        while (node != null){
            if(node.data != nodeStack.pop()){
                return false;
            }
            node = node.next;
        }
        return true;
    }

    public static boolean isPalindromeOptimised(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            Node temp = slow;
            slow = slow.next;
            temp.next = prev;
            prev = temp;
        }

        if (fast != null){
            slow = slow.next;
        }

        while (prev != null && slow != null){
            if(prev.data != slow.data){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return prev == null && slow == null;

    }
    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(1);

        boolean palindromeByUsingStack = isPalindromeByUsingStack(node);
        System.out.println(palindromeByUsingStack);

        boolean palindromeOptimised = isPalindromeOptimised(node);
        System.out.println(palindromeOptimised);
    }
}

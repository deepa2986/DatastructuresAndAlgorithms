package datastructures.linkedlist;

public class RemoveNthNode {

    public Node removeNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;

        for(int  i = 1; i <= n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public void printNode(Node node){
        Node temp =  node;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(90);
        head.next.next.next.next.next = new Node(23);

        RemoveNthNode node = new RemoveNthNode();
        node.printNode(head);

        System.out.println();

        node.removeNthNode(head,3);
        node.printNode(head);
    }
}

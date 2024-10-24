package datastructures.linkedlist;

public class SortList {

    private Node head;
    public Node sortList(){
        Node node = head;
        int[] countArray = {0,0,0};

        while(node != null){
            countArray[node.data]++;
            node = node.next;
        }

        node = head;
        int i = 0;
        while (node != null){
            if(countArray[i] == 0){
                i++;
            }else {
                node.data = i;
                countArray[i]--;
                node = node.next;
            }
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

        SortList list  = new SortList();
        list.head = new Node(2);
        list.head.next = new Node(0);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
        list.head.next.next.next.next = new Node(0);

        list.printList();
        System.out.println();

        list.sortList();
        list.printList();
    }
}

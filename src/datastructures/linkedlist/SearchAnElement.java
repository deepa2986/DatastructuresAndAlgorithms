package datastructures.linkedlist;

public class SearchAnElement {

    private Node head;

    public boolean getAnElement(int value){

        Node node = head;
        boolean isFound = false;
        while(node != null){
            if(node.data == value){
                isFound = true;
                break;
            }
            node = node.next;
        }
        return isFound;
    }

    public boolean getElementByRecursion(Node node , int value){
        if(node == null){
            return false;
        }
        if(node.data == value){
            return true;
        }
        return getElementByRecursion(node.next,value);
    }
    public static void main(String[] args) {

        SearchAnElement element = new SearchAnElement();
        element.head = new Node(6);
        element.head.next = new Node(12);
        element.head.next.next = new Node(2);
        element.head.next.next.next = new Node(10);
        element.head.next.next.next.next = new Node(90);

        boolean elementFound = element.getAnElement(29);
        System.out.println(elementFound);

        boolean elementFound1 = element.getAnElement(2);
        System.out.println(elementFound1);


        boolean elementFoundByRecursion = element.getElementByRecursion(element.head, 60);
        System.out.println(elementFoundByRecursion);

        boolean element2FoundByRecursion = element.getElementByRecursion(element.head, 10);
        System.out.println(element2FoundByRecursion);
    }
}

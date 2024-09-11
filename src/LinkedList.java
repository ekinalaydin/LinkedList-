

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    static class Node {
        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }
    }

    public  LinkedList(int value){
        Node newNode = new Node (value);
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }
public Node getHead() {
    return this.head;
}
    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return size;
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public void printAll() {
        if (size == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + size);
        System.out.println("\nLinked List:");
        if (size == 0) {
            System.out.println("empty");
        } else {
            printLinkedList();
        }
    }
    public void makeEmpty(){
        head = null;
        tail = null;
        size = 0;

    }

    public void append(int value){
        Node newNode = new Node(value);
        if (size == 0 ){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

}
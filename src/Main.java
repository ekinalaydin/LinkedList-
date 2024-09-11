public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(8);
        myLinkedList.makeEmpty();
        myLinkedList.append(5);
        myLinkedList.append(3);
        myLinkedList.append(0);

        myLinkedList.printAll();    }
}
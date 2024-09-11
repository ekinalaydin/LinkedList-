import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(8);
        myLinkedList.makeEmpty();
        myLinkedList.append(5);
        myLinkedList.append(3);
        myLinkedList.append(0);

        myLinkedList.printAll();

        System.out.println();
        System.out.println();

        DoublyLinkedList myDD = new DoublyLinkedList(8);
        myDD.makeDDEmpty();

        myDD.append(0);
        myDD.append(3);
        myDD.append(4);
        myDD.printDDAll();
        myDD.removeLast();
        myDD.printDDAll();


    }
}
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
        myDD.append(123);
        myDD.printDDAll();


        myDD.removeLast();
        myDD.printDDAll();

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDD.printDDAll();

        myDD.prepend(18);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDD.printDDAll();
        System.out.println("----------------");
        System.out.println("Deleted Value: ");

        System.out.println(myDD.removeFirst().value);
        System.out.println();
        myDD.printDDAll();

        System.out.println("----------------");
        System.out.println("Value of given index is: " + myDD.get(0).value);

        System.out.println("----------------");
        System.out.println("Value of changed index is: " + myDD.set(0, 10));
        System.out.println("Value of changed index is: " + myDD.get(0).value);
        System.out.println("----------------");

        myDD.set(1, 45);
        myDD.printDDAll();

    }
}
package prof_camp.D5.HW;

public class Linkedlist_lab {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
    }

    // Q1: Test addFirst and addLast
    public static void q1() {
        System.out.println("Q1: addFirst & addLast");
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.printList(); // [5 -> 10 -> 20]
    }

    // Q2: Test insertAt
    public static void q2() {
        System.out.println("\nQ2: insertAt");
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.insertAt(2, 3); // insert 3 at index 2
        list.printList(); // [1 -> 2 -> 3 -> 4]
    }

    // Q3: Test removeFirst, removeLast, removeAt
    public static void q3() {
        System.out.println("\nQ3: remove methods");
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.removeAt(0); // remove 10
        list.printList(); // [20 -> 30 -> 40]
        list.removeAt(2); // remove 40
        list.printList(); // [20 -> 30]
        list.removeAt(0); // remove 20
        list.printList(); // [30]
    }

    // Q4: Test get and set
    public static void q4() {
        System.out.println("\nQ4: get & set");
        MyLinkedList list = new MyLinkedList();
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        System.out.println("Element at index 1: " + list.get(1));
        list.set(1, 250);
        System.out.println("After setting index 1 to 250:");
        list.printList(); // [100 -> 250 -> 300]
    }

    // Q5: Test indexOf (search)
    public static void q5() {
        System.out.println("\nQ5: indexOf (search)");
        MyLinkedList list = new MyLinkedList();
        list.addLast(5);
        list.addLast(15);
        list.addLast(25);
        System.out.println("Index of 15: " + list.indexOf(15));
        System.out.println("Index of 100: " + list.indexOf(100));
    }
}

package prof_camp.D5.HW;

//25 N'Tonkla

public class ArrayList_lab {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
    }

    // Q1: Test add
    public static void q1() {
        System.out.println("Q1: add elements");
        MyArrayList arr = new MyArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("After adding: ");
        arr.printArray(); // [10, 20, 30]
    }

    // Q2: Test insertAt
    public static void q2() {
        System.out.println("\nQ2: insertAt");
        MyArrayList arr = new MyArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.insert(2, 3); // insert 3 at index 2
        System.out.println("After inserting 3 at index 2: ");
        arr.printArray(); // [1, 2, 3, 4]
    }

    // Q3: Test removeAt
    public static void q3() {
        System.out.println("\nQ3: removeAt");
        MyArrayList arr = new MyArrayList();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        System.out.println("Before remove: ");
        arr.printArray();
        arr.deleteByIndex(1); // remove element at index 1
        System.out.println("After removing index 1: ");
        arr.printArray(); // [5, 15, 20]
    }

    // Q4: Test get and set
    public static void q4() {
        System.out.println("\nQ4: get & set");
        MyArrayList arr = new MyArrayList();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        System.out.println("Element at index 1: " + arr.get(1));
        // arr.set(1, 250);
        // System.out.println("After setting index 1 to 250: " + arr); // [100,250, 300]
        arr.printArray();
    }

    // Q5: Test search
    public static void q5() {
        System.out.println("\nQ5: search indexOf");
        MyArrayList arr = new MyArrayList();
        arr.add(7);
        arr.add(14);
        arr.add(21);
        System.out.println("Index of 14: " + arr.indexOf(14)); // 1
        System.out.println("Index of 100: " + arr.indexOf(100)); // -1
    }

    // Q6: Test ensureCapacity (array growth)
    public static void q6() {
        System.out.println("\nQ6: ensureCapacity (resize)");
        MyArrayList arr = new MyArrayList();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println("After adding 10 elements: ");
        arr.printArray();
        System.out.println("Size: " + arr.size());
    }
}

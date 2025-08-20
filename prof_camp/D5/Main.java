package prof_camp.D5;

public class Main {
    public static void main(String[] args) {
        linkList a = new linkList();
        a.addFirst(1);
        a.addFirst(5);
        a.addFirst(4);
        System.out.println(a.popLast());
        a.printOut();
    }
}

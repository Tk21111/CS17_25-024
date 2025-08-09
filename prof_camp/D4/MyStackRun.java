public class MyStackRun {
    public static void main(String[] args) {
        
        Mystack stack = new Mystack(5);
        stack.push(5);
        stack.push(9);
        stack.push(4);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.peak());


        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peak());
        System.out.println(stack.toString());

        MyQueue queue = new MyQueue(5);

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();

        System.out.println(queue.toString());

    }
}

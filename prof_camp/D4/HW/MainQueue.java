package HW;
public class MainQueue {
    static void demo1_enqueue_test() {
		MyQueue queue = new MyQueue(5);
		System.out.println("============= Enqueue Test =============");
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("Now size of Queue is: " + queue.getSize());
		System.out.println("Queue is Full: " + queue);
		System.out.println("Front of Queue is: " + queue.peek());
		queue.enqueue(6);
		System.out.println("Queue Overflow (should not enqueue 6): " + queue);
		System.out.println("Now size of Queue is: " + queue.getSize());
		System.out.println("Front of Queue is: " + queue.peek());
		System.out.println("-----------------------------------------");
	}

    static void demo2_dequeue_test() {
		MyQueue queue = new MyQueue(5);
		System.out.println("============= Dequeue Test =============");
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("Original Queue: " + queue);
		System.out.println("Original size of Queue is: " + queue.getSize());
		queue.dequeue();
		int val = queue.dequeue();
		System.out.println("Now size of Queue is: " + queue.getSize());
		System.out.println("Queue when dequeue 2 times: " + queue);
		System.out.println("Last dequeue value is: " + val);
		System.out.println("Is Queue Empty?: " + queue.isEmpty());
		while (!queue.isEmpty()) {
		val = queue.dequeue();
		System.out.println("Dequeue value: " + val);
		System.out.println("Current Queue: " + queue);
		}
		System.out.println("Is Queue Empty?: " + queue.isEmpty());
		System.out.println("Now size of Queue is: " + queue.getSize());
		System.out.println("Dequeue when Queue is Empty . . .");
		if (queue.dequeue() < 0) {
		System.err.println("Dequeue when Queue is empty");
		}
		System.out.println("-----------------------------------------");
	}

	static void demo3_test() {
		MyQueue queue = new MyQueue(5);
		System.out.println("============= All Test =============");
		for (int i = 0; i < 3; i++) {
			queue.enqueue(i + 1);
			System.out.println("Enqueue: " + (i + 1));
		}
		System.out.println("Queue: " + queue);
		System.out.println("Front is: " + queue.peek());
		System.out.println("Dequeue 1 time: " + queue.dequeue());
		System.out.println("Queue (when Dequeue 1 time): " + queue);
		for (int i = 0; i < 3; i++) {
			int val = queue.dequeue();
			if (val < 0) {
				System.err.println("Dequeue when Queue is Empty");
				break;
			}
			System.out.println("Dequeue value is: " + val);
		}
		System.out.println("Queue (when Dequeue 3 time): " + queue);
		int frontVal = queue.peek();
		System.out.println("Front of Queue is: " + frontVal);
        System.out.println("Rear of Queue is: " + queue.rear);
		if (frontVal < 0)
			System.out.println("Queue is empty");
		for (int i = 0; i < 5; i++) {
			queue.enqueue(i + 1);
			System.out.println("Enqueue " + (i + 1));
		}
		System.out.println("Is Queue empty: " + queue.isEmpty());
		System.out.println("Queue: " + queue);
		System.out.println("-------------------------------------");
	}

	static void demo4_wraparound_test() {
		MyQueue queue = new MyQueue(5);
		System.out.println("============= Wrap Around Test =============");
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("Initial Queue: " + queue);
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Queue after 2 dequeues: " + queue);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println("Queue after enqueue 50, 60: " + queue);
		queue.enqueue(70);
		System.out.println("Queue after enqueue 70 (should wrap): " + queue);
		System.out.println("---------------------------------------------");
	}

    

    public static void main(String[] args) {
demo4_wraparound_test();    }

}
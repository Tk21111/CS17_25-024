package HW;

public class MainStack {

	public static void main(String[] args) {
		demo1_push_test();
		// demo2_pop_test();
		// demo3_test();
	}

	static void demo1_push_test() {
		MyStack stack = new MyStack(5);
		System.out.println("============= Push Test =============");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Now size of Stack is: " + stack.getSize());
		System.out.println("Stack is Full: " + stack);
		System.out.println("top of Stack is: " + stack.peek());
		stack.push(6);
		System.out.println("Stack Overflow (should not push 6): " + stack);
		System.out.println("Now size of Stack is: " + stack.getSize());
		System.out.println("top of Stack is: " + stack.peek());
		System.out.println("-------------------------------------");
	}

	static void demo2_pop_test() {
		MyStack stack = new MyStack(5);
		System.out.println("============= Pop Test =============");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Original Stack: " + stack);
		System.out.println("Original size of Stack is: " + stack.getSize());
		stack.pop();
		int pop = stack.pop();
		System.out.println("Now size of Stack is: " + stack.getSize());
		System.out.println("Stack when pop 2 time: " + stack);
		System.out.println("Last pop value is: " + pop);
		System.out.println("Is Stack Empty?: " + stack.isEmpty());
		while (!stack.isEmpty()) {
			pop = stack.pop();
			System.out.println("Pop value: " + pop);
			System.out.println("Current Stack: " + stack);
		}
		System.out.println("Is Stack Empty?: " + stack.isEmpty());
		System.out.println("Now size of Stack is: " + stack.getSize());
		System.out.println("Pop when Stack is Empty . . .");
		stack.pop();
		if (stack.pop() < 0) {
			System.err.println("Pop when Stack is empty");
		}
		System.out.println("-------------------------------------");
	}

	static void demo3_test() {
		MyStack stack = new MyStack(5);
		System.out.println("============= All Test =============");
		for (int i = 0; i < 3; i++) {
			stack.push(i + 1);
			System.out.println("Push: " + (i + 1));
		}
		System.out.println("Stack: " + stack);
		System.out.println("top is: " + stack.peek());
		System.out.println("Pop 1 time: " + stack.pop());
		System.out.println("Stack (when Pop 1 time): " + stack);
		for (int i = 0; i < 3; i++) {
			int pop = stack.pop();
			if (pop < 0) {
				System.err.println("Pop when Stack is Empty");
				break;
			}
			System.out.println("Pop value is: " + pop);
		}
		System.out.println("Stack (when Pop 3 time): " + stack);
		int top = stack.peek();
		System.out.println("Top of Stack is: " + top);
		if (top < 0)
			System.out.println("Stack is empty");
		for (int i = 0; i < 5; i++) {
			stack.push(i + 1);
			System.out.println("Push " + (i + 1));
		}
		System.out.println("Is Stack empty: " + stack.isEmpty());
		System.out.println("Stack: " + stack);
		System.out.println("-------------------------------------");
	}
}

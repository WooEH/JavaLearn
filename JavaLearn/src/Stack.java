//interface StackInterface {
//	boolean isEmpty();
//	boolean isFull();
//	void push(char item);
//	char pop();
//	char peek();
//	void clear();
//}
//
//class ArrayStack implements StackInterface {
//	private int top;
//	private int stackSize;
//	private char stackArr[];
//	
//	public ArrayStack(int stackSize) {
//		top = -1;
//		this.stackSize = stackSize;
//		stackArr = new char[this.stackSize];
//	}
//	
//	public boolean isEmpty() {
//		return (top == -1);
//	}
//	
//	public boolean isFull() {
//		return (top == this.stackSize-1);
//	}
//	
//	public void push(char item) {
//		if(isFull()) {
//			System.out.println("Stack is Full!");
//		} else {
//			stackArr[++top] = item;
//			System.out.println("Inserted Item : " + item);
//		}
//	}
//	
//	public char pop() {
//		if(isEmpty()) {
//			System.out.println("Deleting fail! Stack is empty!");
//			return 0;
//		} else {
//			System.out.println("Deleted Item : " + stackArr[top]);
//			return stackArr[--top];
//		}
//	}
//	
//	public char peek() {
//		if(isEmpty()) {
//			System.out.println("Peeking fail! Stack is Empty!");
//			return 0;
//		}else {
//			System.out.println("Peeked Item : " + stackArr[top]);
//			return stackArr[top];
//		}
//	}
//	
//	public void clear() {
//		if(isEmpty()) {
//			System.out.println("Stack is already empty!");
//		}else {
//			top = -1;
//			stackArr = new char[this.stackSize];
//			System.out.println("Stack is Clear!");
//		}
//	}
//	
//	public void printStack() {
//		if(isEmpty()) {
//			System.out.println("Stack is Empty!");
//		}else  {
//			System.out.print("Stack elements : ");
//			for(int i=0;i<=top;i++) {
//				System.out.print(stackArr[i] + " ");
//			}
//			System.out.println();
//		}
//	}
//}
//
//public class Stack {
//	
//	public static void main(String[] args) {
//		int stackSize = 5;
//		ArrayStack arrStack = new ArrayStack(stackSize);
//		
//		
//	}
//}
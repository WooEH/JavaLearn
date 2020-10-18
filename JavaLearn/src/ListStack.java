//class StackbyList {
//	private Node top = null;
//	
//	private class Node {
//		private Object data;
//		private Node nextNode;
//		
//		Node(Object data){
//			this.data = data;
//			this.nextNode = null;
//		}
//	}
//	
//	
//	public StackbyList() {
//		this.top = null;
//	}
//	
//	public boolean isEmpty() {
//		return (top == null);
//	}
//	
//	public void push(Object item) {
//		Node newNode = new Node(item);
//		newNode.nextNode = top;
//		top = newNode;
//	}
//	
//	public Object peek() {
//		if(isEmpty()) {
//			System.out.println("Stack is Empty!");
//			return 0;
//		} else {
//			return top.data;
//		}
//	}
//	
//	public Object pop() {
//		Object item = peek();
//		top = top.nextNode;
//		return item;
//	}
//}
//
//
//public class ListStack {
//
//	public static void main(String[] args) {
//		StackbyList sl = new StackbyList();
//		sl.push(3);
//		System.out.println(sl.pop());
//	}
//
//}

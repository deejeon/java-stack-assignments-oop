
public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	
	// member methods
	public void add(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			return;
		}
		
		Node runner = this.head;
		while (runner.next != null) {
			runner = runner.next;
		}
		runner.next = newNode;
		return;
	}
	
	public void remove() {
		if (this.head.next == null) {
			this.head = null;
			return;
		}
		
		Node runner = this.head;
		while (runner.next.next != null) {
			runner = runner.next;
		}
		runner.next = null;
		return;
	}
	
	public void printValues() {
		if (this.head == null) {
			return;
		}
		
		Node runner = this.head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		return;
	}
	
	public Node find(int value) {
		if (this.head == null) {
			return null;
		}
		
		Node runner = this.head;
		while (runner.value != value && runner != null) {
			runner = runner.next;
		}
		return runner;
	}
	
}

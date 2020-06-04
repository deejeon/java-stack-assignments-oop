
public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList mySLL = new SinglyLinkedList();
		
		mySLL.add(1);
		mySLL.add(2);
		mySLL.add(3);
		mySLL.add(4);
		mySLL.remove();
		
		mySLL.printValues();
		
		System.out.println(mySLL.find(5));
	}

}

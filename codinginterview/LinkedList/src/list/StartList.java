package list;

public class StartList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		LinkedList ll1 = new LinkedList(d);
		for ( int i = 1 ; i < 5 ; i ++)
			ll1.appendToTail(i);
		ll1.displayLinkedList();
		
		LinkedList ll2 = new LinkedList(d);
		for ( int i = 0 ; i < 7 ; i ++)
			ll2.appendToTail(i);
		ll2.displayLinkedList();	
		
		

		LinkedList.addTwoLists(ll1, ll2);
		
		
		
		LinkedList ll3 = new LinkedList(0);
		ll3.makeCircularList(5, 10 );
		
		
		Node end = ll3.findCircularEntryPoint();
		System.out.print(end.data);
		
	}

}

package list;


public class LinkedList {
	
	Node head ;
	
	LinkedList(int d)
	{
		head = new Node(d);
	}
	
	
	LinkedList()
	{
		head = new Node();
	}
	
	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node mark = head;
		while(mark.next!=null)
		{
			mark = mark.next;
		}
		mark.next = end;
	}
	
	
	void displayLinkedList()
	{
		Node mark = head;
		
		while(mark != null)
		{
			System.out.print(mark.data+" ");
			mark = mark.next;
		}
		System.out.println("");
	}
	
	// insert a number after the first given number
	void insertNode(int startNumber, int insertNumber)
	{
		Node insertNode = new Node(insertNumber);
		Node mark = head;
		while(mark != null && mark.data != startNumber)
		{
			mark = mark.next;
		}
		insertNode.next = mark.next;
		mark.next =insertNode;
	}
	
	
	// delete the first node whose data is equal to the given number.
	void deleteNode(int deleteNumber)
	{
		Node mark = head;
		while(mark.next != null)
		{
			if(mark.next.data==deleteNumber)
			{
				mark.next = mark.next.next;
				break;
			}
			mark = mark.next;
		}
	}
	
	int listLength()
	{
		Node mark = head;
		int length = 0 ;
		while(mark != null)
		{
			length++;
			mark = mark.next;
		}
		System.out.println("length is "+length);
		return length;
	}
	
	
	Node searchNode(int d)
	{
		Node mark = head;
		while(mark != null)
		{
			if(mark.data == d)
				return mark;
			mark = mark.next;
		}
		return null;
	}
	
	//2.1 delete duplicate characters
	void deleteDuplicates()
	{
		LinkedList ll = new LinkedList();
		Node mark = head.next;
		int storeDuplicate = 0;
		while(mark!=null)
		{
			if((storeDuplicate & (1 << mark.data)) ==0)
			{
				ll.appendToTail(mark.data);
				storeDuplicate = storeDuplicate | (1 << mark.data);
			}
			mark = mark.next;
		}	
	}
	
	//2.2 find kth to the last element
	
	Node lastKthElement (int k)
	{
		Node no = head;
		int listLength = this.listLength();
		for( int i = 0; i < listLength - k ; i ++)
			no = no.next;
		System.out.println("the last kth element is :" + no.data);
		return no;
	}
	//improve implementation
	Node lastKthElementTwoPointers ( int k )
	{
		Node p1 = head;
		Node p2 = head;
		
		for( int i = 0 ; i < k ; i ++)
		{
			if(p2 == null)
				return null;
			else
				p2 = p2.next;
		}
		
		while(p2 != null)
		{
			p2 = p2.next;
			p1 = p1.next;
		}
		
		
		System.out.println("the last kth element is :" + p1.data);
		return p1;
	}

	//2.3
	boolean deleteMiddleNode(Node no)
	{
		if(no==null || no.next==null)
			return false;
		Node newNode = no.next;
		no.data = newNode.data;
		no.next = newNode.next;
		return true;
	}
	
	//2.4
	
	void sortAroundGivenValue(int x)
	{
		LinkedList listHead1 = new LinkedList();
		LinkedList listHead2 = new LinkedList();
		Node nodeTail1 = listHead1.head;
		Node nodeTail2 = listHead2.head;
		
		Node mark = head;
		while(mark != null)
		{
			if(mark.data < x)
			{
				listHead1.appendToTail(mark.data);
				nodeTail1 = nodeTail1.next;
			}
			else
			{
				listHead2.appendToTail(mark.data);
				nodeTail2 = nodeTail2.next;
			}
			mark = mark.next;
		}
		
		listHead1.head = listHead1.head.next;
		listHead2.head = listHead2.head.next;
		nodeTail1.next = listHead2.head;
		head = listHead1.head;
		
	}
	
	//2.5 add two lists
	static void addTwoLists(LinkedList l1, LinkedList l2)
	{
		long actualNumber = 0;
		Node n1 = l1.head;
		Node n2 = l2.head;
		String str1="";
		String str2="";
		while(n1 != null || n2 != null)
		{
			if(n1 != null)
			{
				str1 = str1 + n1.data ;
				n1 = n1.next;
			}
			if(n2 != null)
			{
				str2 = str2 + n2.data ;
				n2 = n2.next;
			}
		}
		actualNumber = Integer.parseInt(str1)+Integer.parseInt(str2);
		System.out.println("final result = " + actualNumber);

	}
	
	//2.6 find entry point of a circular linked list
	boolean makeCircularList(int entryPoint, int totalLength)
	{
		if( entryPoint > totalLength)
		{
			return false;
		}
		
		for(int i = 1 ; i < totalLength ; i ++)
			this.appendToTail(i);
		this.displayLinkedList();
		Node nodeEntry = head;
		Node nodeTail = head;
		
		
		int stepCount = 0;
		while(nodeTail.next != null)
		{
			if(stepCount < entryPoint)
			{
				stepCount ++;
				nodeEntry = nodeEntry.next;
			}
			nodeTail = nodeTail.next;
		}
		
		nodeTail.next = nodeEntry;
		nodeTail = head;
		
		/*while(nodeTail != null)
		{
			System.out.print(nodeTail.data + "   ");
			nodeTail = nodeTail.next;
		}*/
		
		
		
		
		
		
		return true;
		
			
	}

	
	
	Node findCircularEntryPoint()
	{
		Node fastPoint = head;
		Node slowPoint = head;
		
		do
		{
			fastPoint = fastPoint.next;
			fastPoint = fastPoint.next;
			slowPoint = slowPoint.next;
		}
		while(fastPoint != slowPoint);
		
		
		slowPoint = head;
		
		
		while(slowPoint != fastPoint)
		{
			slowPoint = slowPoint.next;
			fastPoint = fastPoint.next;
		}
		
		
		
		
		
		return fastPoint;
	}
	
}



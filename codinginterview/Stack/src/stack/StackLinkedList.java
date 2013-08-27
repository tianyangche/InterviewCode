package stack;

public class StackLinkedList {
	Node top;
	
	
	//constructor
	public StackLinkedList()
	{
		top = null;
	}
	
	public boolean isEmpty()
	{
		return (top==null)? true:false;
	}
	

	
	
	public int getSize()
	{
		int length = 0 ;
		Node searchItem = top;
		while( searchItem != null )
		{
			length ++ ;
			searchItem = searchItem.next;
		}
		return length;
	}
	
	
	
	public char pop()
	{
		char returnItem = top.data;
		top = top.next;
		return returnItem;
	}
	
	
	
	public char peek()
	{
		System.out.println("top element is :" + top.data); 
		return top.data;
	}
	
	public void push(char pushData)
	{
		Node pushItem = new Node(pushData);		
		pushItem.next = top;
		top = pushItem;

		
	}
	
	
	public void displayStack()
	{
		Node displayNode = top;
		while(displayNode != null)
		{
			System.out.print(displayNode.data+ "   ");
			displayNode = displayNode.next;
		}
		System.out.println();
	}
	

	//3.1 
	
	
	
	/*char findMinimumItem()
	{
		StackLinkedList s1 = this;
		StackLinkedList s2 = new StackLinkedList(s1.pop());

		while(!s1.isEmpty())
		{
			if(s1.peek() < minValue)
				minValue = s1.peek();
			s2.push(s1.pop());
		}
		System.out.println("minimum item is :" + minValue);
		return minValue;
	}*/
	
	
}

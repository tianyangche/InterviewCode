package stackArray;

public class StackArray {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	
	public StackArray()
	{
		maxSize = 100;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public StackArray(int size)
	{
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	
	public void push(int pushItem)
	{
		if(top == maxSize - 1)
		{
			System.out.println(" The stack is full, create a new one.  ");
			int[] newArray = new int[2*maxSize];
			for( int i = 0 ; i < top ; i ++ )
				newArray[i] = stackArray[i];
			stackArray = newArray;
		}
		stackArray[++top] = pushItem;
	}
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	
	
	public boolean isFull()
	{
		if(top == maxSize - 1)
			return true;
		else
			return false;
	}
	
	
	
	public int pop()
	{
		if(isEmpty())
			return -100;
		else
		{
			return stackArray[top--];
		}
	}
	
	
	
	public int peek()
	{
		if(isEmpty())
			return -1;
		else
			return stackArray[top];
	}
	public void display()
	{
		for( int i = 0 ; i <= top ; i ++ )
			System.out.print(stackArray[i]+"   ");
		System.out.println("   ");

	}
	

	
	
	
}

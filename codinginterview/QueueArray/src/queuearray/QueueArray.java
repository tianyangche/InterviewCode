package queuearray;

public class QueueArray {

	int front, rear;
	int maxSize;
	char [] elements;
	
	public QueueArray()
	{
		front = rear = 0;
		maxSize = 50;
		elements = new char[maxSize];
	}
	
	
	public QueueArray(int size)
	{
		front = rear = 0;
		maxSize = size;
		elements = new char[size];
		
	}
	
	public boolean isEmpty()
	{
		if(front == rear)
		{
			//System.out.println("empty");
			return true;
		}

		else
		{
			//System.out.println("not empty");
			return false;
		}
	}
	
	public boolean isFull()
	{
		if((rear+1)%maxSize == front)
		{
			//System.out.println("full");
			return true;
		}
		else
		{
			//System.out.println("not full");
			return false;
		}
			
	}
	
	
	
	
	public boolean enQueue(char insertItem)
	{
		if(!isFull())
		{
			elements[rear] = insertItem;
			//System.out.println(elements[rear]);
			rear = (rear + 1) % maxSize;	
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public char deQueue()
	{
		if(!isEmpty())
		{
			char returnItem = elements[front];
			front = ( front + 1 ) % maxSize;
			return returnItem;
		}
		else
			return '\0';
		
	}
	
	public void displayQueueArray()
	{
		int displayIndex = front;
		while(displayIndex != rear)
		{
			System.out.print(elements[displayIndex] + "\t");
			displayIndex = ( displayIndex + 1 ) % maxSize;
		}
		System.out.println();
	}
	
	
	

}

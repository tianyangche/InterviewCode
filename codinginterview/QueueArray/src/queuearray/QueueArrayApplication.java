package queuearray;



public class QueueArrayApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray myqueue = new QueueArray(10);
		char insertItem ;
		for(int i = 0 ; i < 9 ; i ++ )
		{
			insertItem = (char)(i+(int)'a');
			myqueue.enQueue(insertItem);
		}
		if(myqueue.isFull())
		{
			System.out.println("full");
		}
		myqueue.displayQueueArray();
	}

}

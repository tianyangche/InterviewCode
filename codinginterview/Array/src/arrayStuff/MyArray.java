package arrayStuff;




public class MyArray {
	private int[] arrayList;
	private int numElems;
	private int maxElems;
	
	//-------------------------------
	public MyArray(int max)
	{
		arrayList = new int[max];
		numElems = 0;
		maxElems = max;
	}
	
	
	int getMaxSize()
	{
		return maxElems;
	}
	
	
	//-------------------------------
	public boolean find(int searchKey)
	{
		for( int i = 0 ; i < numElems ; i ++ )
			if(arrayList[i] == searchKey)
				return true;
		return false;
		
	}
	
	
	
	
	//---------------------------------
	public void insert(int insertItem)
	{
		arrayList[numElems++] = insertItem;
	}
	
	//-----------------------------------------------------------------
	public boolean delete(int deleteItem)
	{
		int deletePoint = 0;
		
		for( deletePoint = 0 ; deletePoint < numElems ; deletePoint ++ )
		{
			if(arrayList[deletePoint] == deleteItem)
				break;
		}
		
		if( deletePoint == numElems )
			return false;

		while(deletePoint != numElems-1)
		{
			arrayList[deletePoint] = arrayList[deletePoint + 1];
			deletePoint ++ ;
		}
		
		numElems --;
		return true;
	}
	
	
	
	
	//------------------------------------------------
	public void display()
	{
		for( int i = 0 ; i < numElems ; i ++ )
			System.out.print(arrayList[i]  + "   ");
		System.out.println();
	}
	
	//------------------------------------------------
	public int length()
	{
		return numElems;
	}
	
	
	
	
	
	
	
	
	
	
}

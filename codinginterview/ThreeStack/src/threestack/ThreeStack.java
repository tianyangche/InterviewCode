package threestack;

public class ThreeStack {
	private int stackSize = 100;
	private int[] stackArray = new int[stackSize * 3];
	private int[] stackIndex = {-1,-1,-1};
	
	
	
	public void push(int pushIndex, int pushItem)// throws Exception
	{
		//if( stackIndex[pushIndex] + 1 >= stackSize )
		//{
		//	throw new Exception("out of space");
		//}
		
		stackArray[++stackIndex[pushIndex] + pushIndex * stackSize ] = pushItem ;
	}
	
	
	public int pop(int popIndex) throws Exception
	{
		if( stackIndex[popIndex] == -1)
		{
			throw new Exception("empty stack");
		}
		return stackArray[ popIndex * stackSize + stackIndex[popIndex]-- ];
	}
	
	
	public void display()
	{
		for(int j = 0 ; j < 3 ; j ++ )
		{			
			for(int i = 0 ; i < stackIndex[j] ; i ++ )
			{
				System.out.print(stackArray[j * stackSize + i ] + "\t");
			}
				System.out.println();
		}
		
		
		
		
	}
	
	
}

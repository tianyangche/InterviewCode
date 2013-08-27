package stackArray;

public class StackArrayApplication {
	
	public static boolean isPremaline(int[] array)
	{
		int i = array.length ;

		
		System.out.println("This string length is  " + i);
		StackArray intStack = new StackArray(i);

		
		if(i % 2 == 0 )
		{
			for( int j = 0 ; j < i/2 ; j ++ )
				intStack.push(array[j]);
			for( int j = i/2 ; j < i ; j ++ )
				if( intStack.pop() != array[j])
					return false;
		}
		else
		{
			for( int j = 0 ; j < i/2 ; j ++ )
				intStack.push(array[j]);
			for( int j = i/2 + 1 ; j < i ; j ++ )
				if( intStack.pop() != array[j])
					return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StackArray sa = new StackArray(20);
			int[] intString = {1,2,3,3,2,2,1} ; 

			
			if(StackArrayApplication.isPremaline(intString))
				System.out.println("yes");
			else
				System.out.println("no");
			
			
			
	}
	

	
	
	
}

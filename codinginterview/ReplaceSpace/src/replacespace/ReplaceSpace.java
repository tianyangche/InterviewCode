package replacespace;

public class ReplaceSpace {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is our    world";
		int length = str.length();
		int spaceCount = 0;
		for( int i = 0 ; i < length ; i++ )
			if(str.charAt(i)==' ')
				spaceCount ++;
		int newLength = length + spaceCount * 2;
		char[] newStr = new char [100];
		for ( int i = length-1 ; i >= 0 ; i --)
		{
			if(str.charAt(i) == ' ')
			{
				newStr[--newLength] = '0';
				newStr[--newLength] = '2';
				newStr[--newLength] = '%';
			}
			else
			{
				newStr[--newLength] = str.charAt(i);			
			}

			System.out.println(newStr[newLength]);
		}
		System.out.println(newStr);

	}

}

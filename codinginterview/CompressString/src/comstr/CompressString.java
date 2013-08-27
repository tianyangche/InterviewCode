package comstr;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origin = "aaabbbccddc";
		int originLength = origin.length();
		
		int currentLength = 0;
		String result = "";
		int i =0, j ;
		while( i < originLength )
		{
			for ( j = i + 1 ; j < originLength; j++)
			{
				if(origin.charAt(i) != origin.charAt(j))
					break;
			}
			
			result = result + origin.charAt(i) + (j-i) ;
			i = j;

		}
		
		
		
		System.out.println(result);
		
		
	}

}

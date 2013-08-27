package substring;

public class IsRorateSubstring {

	public static boolean isSubstring(String str1, String str2)
	{
		for( int i=0 ; i < str2.length()-str1.length(); i ++ )		
		{

			if(  str1.equals(str2.substring(i, i+str1.length())))
				return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String s1 = "erbottlewa";
		String s2 = "waterbottle";
		if( isSubstring(s1, s2+s2) == true && s1.length() == s2.length() )
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
			

	}

}

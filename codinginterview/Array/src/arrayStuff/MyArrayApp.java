package arrayStuff;

public class MyArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray array = new MyArray(100);
		for(int i = 0 ; i < 15 ; i ++ )
		{
			array.insert(i);
		}
		
		System.out.println("The length of this array is " + array.length());
		array.display();
		
		
		array.delete(5);
		array.display();
		array.insert(20);
		array.display();
	}

}

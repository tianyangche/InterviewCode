package threestack;

public class ThreeStackApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeStack myStack = new ThreeStack() ;
		for(int i = 0 ; i < 10 ; i ++ )
			myStack.push(0, i);
		myStack.display();
	}

}

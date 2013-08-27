package main;

public class SetToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 10;
		final int M = 5;
		
		int [][] array = new int[M][N];
		boolean zeroMark =false;
		for(int i = 0 ; i < M ; i ++)
		{
			for(int j = 0 ; j < N ;j ++)
			{
				array[i][j] = i * M + j -500;
			}
		}
		//array[2][3] = 0;
		boolean[] row = new boolean [M];
		boolean[] column = new boolean [N];

		for(int i = 0 ; i < M ; i ++)
		{
			for(int j = 0 ; j < N ;j ++)
			{
				if(array[i][j]==0)
					zeroMark = true;
			}
		}
		
		if(zeroMark==true )
		{
		for(int i = 0 ; i < M ; i ++)
		{
			for(int j = 0 ; j < N ;j ++)
			{
					array[i][j] = 0;
			}
		}
		}
		
		
		for(int i = 0 ; i < M ; i ++)
		{
			for(int j = 0 ; j < N ;j ++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

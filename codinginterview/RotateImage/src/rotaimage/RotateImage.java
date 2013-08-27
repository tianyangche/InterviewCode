package rotaimage;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 8;
		int [][] image = new int[N][N];
		for(int i = 0 ; i < N; i ++)
			for(int j = 0 ; j < N; j++)
				image[i][j] = i*10 + j;
		for(int i = 0 ; i < N; i ++)
		{
			for(int j = 0 ; j < N; j++)
			{
				System.out.print(image[i][j]+" ");	
			}
			System.out.println(" ");		
		}
		int temp;
		for(int i = 0 ; i < N/2; i ++)
			for(int j = 0 ; j < N/2; j++)
			{
				temp = image[N-1-j][i];
				image[N-1-j][i] = image[N-1-i][N-1-j];
				image[N-1-i][N-1-j] = image[j][N-1-i];
				image[j][N-1-i] = image[i][j];
				image[i][j] = temp ;
			}
		
		for(int i = 0 ; i < N; i ++)
		{
			for(int j = 0 ; j < N; j++)
			{
				System.out.print(image[i][j]+" ");	
			}
			System.out.println(" ");		
		}
		
	}

}

package ArrangementTest;

public class ArrangementTest03 {

	public static void main(String[] args) {
		// 가변 배열 선언
		int[][]ar = new int[3][];
		int i, j = 0;
		
		// 가변 메모리 할당
		ar[0] = new int[1];
		ar[1] = new int[2];
		ar[2] = new int[3];
		
		//배열
		ar[0][0] = 10;
		ar[1][0] = 20;
		ar[1][1] = 30;
		ar[2][0] = 40;
		
		for(i = 0; i < ar.length ; i++)
		{
			for(j = 0 ; j < ar[i].length ; j++)
			{
				System.out.print("ar["+ i +"]"+"["+ j +"]=" + ar[i][j] + " ");
	
			}
			System.out.println();
		}

	}

}

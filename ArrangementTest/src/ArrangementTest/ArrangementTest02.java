package ArrangementTest;

public class ArrangementTest02 {

	public static void main(String[] args) {
		// 2차원 배열 선언과 동시에 초기화
		int [][] ar = { {10, 20 },{30,40} };
		int i, j;
		
		//행과 열을 출력하기 위해 반복문 2
		for (i = 0; i < ar.length; i++)
		{
			for (j = 0; j < ar[i].length; j++)
				System.out.print(" " + ar[i][j]);
					System.out.println();
		}

	}

}

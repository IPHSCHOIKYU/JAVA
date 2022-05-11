package ArrangementTest;

public class ArrangementTest01 {

	public static void main(String[] args)
	{
		//배열 선언 및 초기화
		int [] ar = {10,20,30}; //ar이라는 변수에 "10","20","30"이라는 정수 넣기
		
	for(int i=0; i<ar.length; i++) //i=0, i의 값이 ar보다 작으면 i값에 10증가
		{
		System.out.println("ar["+ i +"]=" + ar[i]);
		}
	}

}

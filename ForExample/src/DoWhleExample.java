
public class DoWhleExample {

	public static void main(String[] args) {
		// �ݺ��� do~while�� ������ �ѹ��� ����
		// 1���� 100������ ��
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i<=1000);
		System.out.println("i�� ����"+i);
		System.out.printf("1~%d�� ��: ",i-1,sum);
	}

}

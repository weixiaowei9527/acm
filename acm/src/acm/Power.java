package acm;

import java.util.Scanner;
/*�ж�һ�������Ƿ���2����*/
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			a = scanner.nextInt();
			if ((a&(a-1)) == 0) {
				/*&������*/
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}

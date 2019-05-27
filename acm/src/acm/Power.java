package acm;

import java.util.Scanner;
/*判断一个整数是否是2的幂*/
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			a = scanner.nextInt();
			if ((a&(a-1)) == 0) {
				/*&与运算*/
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}

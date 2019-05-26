package bishi;

import java.util.Scanner;

public class 最大子列和问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		int[] b = new int[N + 1];
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
			if (a[i]>0) {
				flag = true;
			}
			b[i] = a[i];
		}
		b[0] = a[0];

		for (int i = 1; i < N; i++) {
			//����������кͣ�������
			/*
			 * for (int j = 0; j < i; j++) { if (a[i] > a[j]) {
			 * 
			 * if (b[j] + a[i] > b[i]) { b[i] = b[j] + a[i]; } } }
			 */
			//������������кͣ�����
			/*
			 * if (a[i] > a[i - 1]) { if (b[i-1]+a[i]>=b[i]) { b[i]=b[i-1]+a[i]; } }
			 */

			if (b[i - 1] + a[i] >= b[i]) {
				b[i] = b[i - 1] + a[i];
			}

			//System.out.printf("i:%d %d\n", i, b[i]);
		}
		int max_value = b[0];
		for (int i = 1; i < N; i++) {
			if (b[i] > max_value) {
				max_value = b[i];
			}
		}
		if (flag) {
			System.out.println(max_value);
		}else {
			System.out.println(0);
		}
		
	}
}

package bishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

class struct{
	int first;
	String second;
}
class Test {
	int N;
	int K;
	int[] tel;
	String secondString;
	void getIN() {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		K = scanner.nextInt();
		String next = scanner.next();

		char[] charArray = next.toCharArray();
		tel = new int[N];
		for (int i = 0; i < charArray.length; i++) {
			tel[i] = charArray[i] - '0';
		}
	}

	void wai() {
		int minint = Integer.MAX_VALUE;
		List<struct>result = new ArrayList<struct>();
		for (int k = 0; k < 10; k++) {
			struct element = new struct();
			int t = nei(k);
			element.first = t;
			element.second = this.secondString;
			result.add(element);
			System.out.println(k+":" +t);
		}
		int standard = -1;
		for(int i = 0; i < 10; i++) {
			if(minint>result.get(i).first) {
				minint = result.get(i).first;
				standard = i;
			}else if (minint==result.get(i).first) {
				if (result.get(standard).second.compareTo(result.get(i).second)>0) {
					standard = i;
				}
			}
		}
		System.out.println("结果:");
		System.out.println(result.get(standard).first);
		System.out.println(result.get(standard).second);
	}
	/*
	 * 修改为重复的kk，需要修改的总值
	 * @return 修改总值
	 * */
	int nei(int kk) {
		int hang = N + 1;
		int lie = K + 1;
		int max_int = 9999;
		int[][] map = new int[hang][lie];
		for (int i = 0; i < hang; i++) {
			map[i][0] = 0;
		}
		for (int i = 1; i < lie; i++) {
			map[0][i] = max_int;
		}
		for (int i = 1; i < hang; i++) {
			for (int j = 1; j < lie; j++) {
				map[i][j] = Math.min(map[i - 1][j], map[i - 1][j - 1] + Math.abs(kk - tel[i - 1]));
			}
		}
		//输出map
		System.out.println("The kk is:"+kk);
		for(int i = 0; i < hang; i++) {
			if (i!=0) {
				System.out.printf("tel[%2d]:%d ",i,Math.abs(kk - tel[i-1]));
			}else {
				System.out.print("tel[ %]:% ");
			}
			for(int j = 0; j <lie;j++) {
				System.out.printf("%6d ",map[i][j]);
			}
			System.out.print("\n");
		}
		int[] temp = new int[N+1];
		int h = 0;
		for(int i = N,j = K;i>=1&&j>1;i--) {
			if((map[i][j]-Math.abs(tel[i-1]-kk)) == map[i-1][j-1]) {
				j--;
				temp[h++] = i-1;
			}
		}
		
		//输出temp
		for(int i = 0; i < h;i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		
		
		char[] tempc = new char[N+1];
		int tou = 0;
		int wei = h - 1;
		for(int i = 0; i < N; i++) {
			
			if(tou <=wei) {
				int tempvalue = temp[wei];
				if (tempvalue == i) {
					tempc[i] = (char) ('0'+kk);
					wei--;
				}else {
					tempc[i] = (char) ('0'+tel[i]);
				}
			}else {
				tempc[i] = (char) ('0'+tel[i]);
				
			}
		}
		this.secondString = new String(tempc);
		System.out.println("first is:"+map[hang-1][lie-1]);
		System.out.println("secondString is:"+this.secondString);
		return map[hang-1][lie-1];
	}
	
}

public class LiangHao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.getIN();
		test.wai();
	}

}

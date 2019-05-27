package acm;

import javax.naming.spi.DirStateFactory.Result;

class Bubble {
	private int arr[];
	private int time_complexity;

	public Bubble(int arr[]) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}

	public Bubble() {
		// TODO Auto-generated constructor stub
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void Result() {
		show();
		int t;

		
		for (int i = 0; i < this.arr.length - 1; i++) {
			for (int j = 0; j < this.arr.length - i - 1; j++) {
				time_complexity++;
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

				}
			}
		}
	}

	public int getTime_complexity() {
		return time_complexity;
	}

	public void show() {
		for (int x : arr) {
			System.out.println(x);
		}
	}
}

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble bubble = new Bubble();
		int[] a = { 5, 3, 98, 56, 151, 0, 23, 15 };

		int[] best_case = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("时间复杂度最小:");
		bubble.setArr(best_case);
		bubble.Result();
		System.out.println(bubble.getTime_complexity());

		int[] worst_case = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("时间复杂度最大:");
		bubble.setArr(worst_case);
		bubble.Result();
		System.out.println(bubble.getTime_complexity());

	}
}

package test;
import java.util.Scanner;

class Acm {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] a;

	void inputData() {
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 
		}
		
	}
	
	void insertSort() {
		/*插入排序*/
		int len = a.length;
		int insertNum;
		for(int i = 1; i < len; i++) {
			insertNum = a[i];
			int j = i -1;
			while(j>=0&&a[j]>insertNum) {
				
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = insertNum;
		}
	}
	void sheelSort() {
		
		/*
		 * 对插入排序的优化
		 * 对于直接插入排序问题，数据量巨大时*/
		int d = a.length;
		while(d!= 0) {
			d = d/2;
			for(int i = 0; i < d; i++) {
				/*i循环是用来分组的*/
				for(int j = i+d; j<a.length;j+=d) {
					/*执行以d为间隔的插入排序*/
					int last = j-d;
					int insertNum = a[j];
					while(last>=0&&a[last]>insertNum) {
						/*第二个比较符号控制升序降序*/
						a[last+d] = a[last];
						last-=d;
					}
					a[last+d] = insertNum;
				}
			}
		}
	}
	void selectSort() {
		/*
		 * 简单选择排序
		 * 常用于取序列中最大最小的几个数时。*/
		int len = a.length;
		for(int i = 0; i < len; i++) {
			int key = a[i];
			int position = i;
			for(int j = i+1; j<len;j++) {
				if (a[j]<key) {
					key = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i]= key; 
		}
	}
	void swap(int i, int j) {
		int t;
		t= a[i];
		a[i] = a[j];
		a[j]= t; 
	}
	void buildMaxHeap(int len) {
		for(int i = len/2-1; i>=0; i--) {
			int left = i*2+1;
			if (left+1<len) {
				if (a[left]<a[left+1]) {
					swap(left, left+1);
				}
			}
			if (a[left]>a[i]) {
				swap(left, i);
			}
		}
	}
	void heapSort() {
		/*对简单选择排序的优化。*/
		
		int len = a.length;
		buildMaxHeap(len);
		for(int i = len - 1; i >= 0; i--) {
			swap(i, 0);
			buildMaxHeap(i);
		}
	}
	void bubbleSort() {
		/*
		 *冒泡排序 
		 * 一般不用。*/
		int t;
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j+1]) {
					t= a[j];
					a[j]= a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	void showResult() {
		int i;
		for(i = 0; i < n - 1; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("%d \n", a[i]);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Acm acm = new Acm();
		acm.inputData();
		acm.bubbleSort();
		acm.showResult();
	}

}
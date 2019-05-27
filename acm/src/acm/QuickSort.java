package acm;
class Quick{
	private int[] arr;
	public Quick(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	void quicksort(int left,int right) {
		if (left>right) {
			return;
		}
		int refercence_number;
		int inner_left, inner_right;
		refercence_number = arr[left];
		inner_left = left;
		inner_right = right;
		while(inner_left < inner_right) {
			/*必须先从右到左，这样最后一个数是属于左半部分的，否则最后一个数划分会出错*/
			while (arr[inner_right] >= refercence_number && inner_left<inner_right) {
				inner_right--;
			}
			arr[inner_left] = arr[inner_right];
			while(arr[inner_left]<=refercence_number&&inner_left<inner_right) {
				inner_left++;
			}
			arr[inner_right] = arr[inner_left];
		}
		arr[inner_left] = refercence_number;
		show();
		quicksort(left, inner_left-1);
		quicksort(inner_left+1, right);
	}
	public void show() {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
	}
	
}
public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 5, 3, 98, 56, 151, 0, 23, 15 };
		int[] worst_case = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Quick quick = new Quick(a);
		quick.setArr(a);
		quick.quicksort(0, a.length-1);
		quick.show();
	}
}

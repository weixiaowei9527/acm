package test;

public class Solution {
	public boolean Find(int target, int[][] array) {
		boolean flag = false;
		if (array.length!= 0) {
			int len = array[0].length;
			for (int i = 0; i < array.length; i++) {
				if (array[i][0] <= target && target <= array[i][len - 1]) {
					for (int j = 0; j < len; j++) {
						if (array[i][j] == target) {
							flag = true;
							break;
						}
					}
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[9][0];
		if (a.length!= 0) {
			System.out.println(a[0].length);
		}
	}
}

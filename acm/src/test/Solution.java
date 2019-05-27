package test;

public class Solution {
	public boolean Find1(int target, int[][] array) {
		boolean flag = false;
		if (array.length != 0) {
			/* 判断数组是否为空 */
			int len = array[0].length;
			if (len != 0) {
				int i = 0;
				int j = len - 1;
				while (i < array.length && j >= 0) {
					if (array[i][j] == target) {
						flag = true;
						break;
					}
					if (array[i][j] < target) {
						i++;
					}
					if (i< array.length&&array[i][j] > target) {
						j--;
					}
				}
			}
		}
		return flag;
	}

	public boolean Find(int target, int[][] array) {
		boolean flag = false;
		if (array.length != 0) {
			/* 判断数组是否为空 */
			int len = array[0].length;
			for (int i = 0; i < array.length; i++) {
				if (len == 0) {
					/* 防止数组下标超界，len-1 */
					break;
				}
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
		if (a.length != 0) {
			System.out.println(a[0].length);
		}
	}
}

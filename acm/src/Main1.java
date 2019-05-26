import java.util.Scanner;

class Coordinate {
	int x, y;
	int len;
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, m;
		Coordinate[] he = new Coordinate[55];
		n = scanner.nextInt();
		m = scanner.nextInt();
		char[][] a = new char[n][m];
		int[][] book = new int[n][m];

		for (int i = 0; i < n; i++) {

			String hang = scanner.next();
			a[i] = hang.toCharArray();

		}
		int sx, sy;
		sx = scanner.nextInt();
		sy = scanner.nextInt();
		int k;
		k = scanner.nextInt();
		for (int i = 0; i < k; i++) {
			Coordinate temp = new Coordinate();
			temp.x = scanner.nextInt();
			temp.y = scanner.nextInt();
			he[i]= temp; 
		}
		Coordinate[] duilie = new Coordinate[m * n];
		int head;
		int tail;
		head = tail = 0;
		duilie[tail++].x = sx;
		duilie[tail++].y = sy;
		book[sx][sy] = 1;
		int max_value = 0;
		while (head < tail) {
			for (int i = 0; i < k; i++) {
				int xx = duilie[head].x + he[i].x;
				int yy = duilie[head].y + he[i].y;
				if (((xx >= 0 && xx <= m) && (yy >= 0 && yy <= n)) && book[xx][yy] == 0 && a[xx][yy] != 'X') {
					Coordinate t = new Coordinate();
					t.x = xx;
					t.y = yy;
					t.len = duilie[head].len + 1;
					duilie[tail++] = t;
					book[xx][yy] = 1;
				}
			}
			head++;
		}
		for (int i = 0; i < tail; i++) {
			if (duilie[i].len > max_value)
				max_value = duilie[i].len;
		}
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%d ", book[i][j]);
			}
			System.out.printf("\n");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == '.' && book[i][j] == 0) {
					flag = false;
					break;
				}

			}
		}
		if (flag)
			System.out.printf("%d\n", max_value);
		else
			System.out.printf("%d\n", -1);

	}

}

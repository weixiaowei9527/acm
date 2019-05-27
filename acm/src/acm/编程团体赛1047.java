package acm;


import java.util.Scanner;
import java.util.HashSet;
class duiwu{
	int sum;
	String id;
	public duiwu(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		sum = 0;
	}
}
/*public */class Main0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duiwu maxDuiwu = new duiwu("-1");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		HashSet<duiwu> set = new HashSet<duiwu>();
		String inString;
		sc.nextLine();
		for(int i = 0; i < n; i++){
			inString = sc.nextLine();
			String[] strings = inString.split("-| ");
			boolean f = true;
			for(duiwu x:set){
				if (x.id.equals(strings[0])) {
					x.sum += Integer.parseInt(strings[2]);
					if (x.sum > maxDuiwu.sum) {
						maxDuiwu = x;
					}
					f = false;
					break;
				}
			}
			if (f) {
				duiwu dui = new duiwu(strings[0]);
				dui.sum += Integer.parseInt(strings[2]);
				set.add(dui);
				if (dui.sum > maxDuiwu.sum) {
					maxDuiwu = dui;
				}
			}
		}
		System.out.println(maxDuiwu.id + " " + maxDuiwu.sum);
	}

}
public class 编程团体赛1047 {

}

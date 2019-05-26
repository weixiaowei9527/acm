package bishi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.ObjectHolder;

class XiangSort implements Comparator<Xiang> {
	// 升序
	/*
	 * @Override public int compare(Xiang o1, Xiang o2) { // TODO Auto-generated
	 * method stub
	 * 
	 * if (o1.zhishu > o2.zhishu) { return 1; } else if (o1.zhishu < o2.zhishu) {
	 * return -1; } else { return 0; } }
	 */
	// 降序
	@Override
	public int compare(Xiang o1, Xiang o2) {
		// TODO Auto-generated method stub

		if (o1.zhishu < o2.zhishu) {
			return 1;
		} else if (o1.zhishu > o2.zhishu) {
			return -1;
		} else {
			return 0;
		}
	}

}

class Xiang {
	int xishu;
	int zhishu;

	public Xiang() {
		// TODO Auto-generated constructor stub
	}

	public Xiang(Xiang xiang) {
		// TODO Auto-generated constructor stub
		this.xishu = xiang.xishu;
		this.zhishu = xiang.zhishu;
	}

	public Xiang(int xishu, int zhishu) {
		this.xishu = xishu;
		this.zhishu = zhishu;
	}
}

/*
 * 提示 多项式加法是将指数相同的系数相加，多项式乘法是各项的系数相乘指数相加
 */
public class 乘积项和和项 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a, b;
		a = scanner.nextInt();
		ArrayList<Xiang> aList = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			Xiang xiang = new Xiang();
			xiang.xishu = scanner.nextInt();
			xiang.zhishu = scanner.nextInt();
			aList.add(xiang);
		}
		b = scanner.nextInt();
		ArrayList<Xiang> bList = new ArrayList<>();
		Xiang xiang = new Xiang();
		for (int i = 0; i < b; i++) {

			xiang.xishu = scanner.nextInt();
			xiang.zhishu = scanner.nextInt();
			bList.add(new Xiang(xiang));
		}
		/* System.out.println(); */
		/*
		 * for (Xiang x : bList) { System.out.println(x.xishu); }
		 */
		int xishu;
		int zhishu;
		// 求乘
		List<Xiang> cheng = new ArrayList<Xiang>();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				xishu = aList.get(i).xishu * bList.get(j).xishu;
				zhishu = aList.get(i).zhishu + bList.get(j).zhishu;
				cheng.add(new Xiang(xishu, zhishu));
			}
		}
		Collections.sort(cheng, new XiangSort());
		int p;
		for (p = 0; p < cheng.size() - 1; p++) {
			System.out.printf("%d %d ", cheng.get(p).xishu, cheng.get(p).zhishu);
		}
		System.out.printf("%d %d\n", cheng.get(p).xishu, cheng.get(p).zhishu);

		// 求和
		List<Xiang> he = new ArrayList<Xiang>();
		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < bList.size(); j++) {
				if (aList.get(i).zhishu == bList.get(j).zhishu) {

					xishu = aList.get(i).xishu + bList.get(j).xishu;
					zhishu = aList.get(i).zhishu;
					he.add(new Xiang(xishu, zhishu));
					aList.remove(i);
					bList.remove(j);
				}
			}
		}
		for (int i = 0; i < aList.size(); i++) {
			he.add(aList.get(i));
		}
		for (int i = 0; i < bList.size(); i++) {
			he.add(bList.get(i));
		}
		Collections.sort(he, new XiangSort());
		for (p = 0; p < he.size() - 1; p++) {
			System.out.printf("%d %d ", he.get(p).xishu, he.get(p).zhishu);
		}
		System.out.printf("%d %d\n", he.get(p).xishu, he.get(p).zhishu);
	}
}


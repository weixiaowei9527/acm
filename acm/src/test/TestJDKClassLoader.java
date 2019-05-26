package test;

import javax.crypto.spec.DESKeySpec;

class Singleton {
	/* singleton位置不同，结果不同 */
	private static Singleton singleton = new Singleton();
	public static int count1;
	public static int count2 = 1;

	private Singleton() {
		System.out.println(count1);
		System.out.println(count2);
		count1++;
		count2++;

	}

	// private static Singleton singleton = new Singleton();
	public static Singleton getSingleton() {
		return singleton;
	}
}

public class TestJDKClassLoader {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> forName = null;
		
		forName = Class.forName("java.lang.String");
		System.out.println(forName.getClassLoader());
		if (forName == String.class) {
			System.out.println("equal");
		}
		forName = Class.forName("test.TestJDKClassLoader");
		System.out.println(forName.getClassLoader());
		/*
		 * 输出结果
		 * null
		 * sun.misc.Launcher$AppClassLoader@2a139a55
		 * AppClassLoader是一个内部类
		*/
		
		
		
		System.out.println(String.class.getClassLoader());
		System.out.println();
		System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
		System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
		/*
		 * Singleton singleton = Singleton.getSingleton();
		 * System.out.println(singleton.count1+";"+singleton.count2);
		 */
	}

}

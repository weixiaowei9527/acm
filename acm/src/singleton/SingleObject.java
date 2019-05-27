package singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("hello World!");
	}
}
/*单例模式不能被继承*/

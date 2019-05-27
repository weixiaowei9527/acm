package acm;
interface a{
	int aa = 0;
	int getsum();
}
abstract class chou implements a{
	@Override
	public int getsum() {
		// TODO Auto-generated method stub
		System.out.println(aa);
		return 0;
	}
	abstract void showq();
}
class shi extends chou{

	@Override
	void showq() {
		// TODO Auto-generated method stub
		System.out.println("nihao");
	}
	
}
public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shi c = new shi();
		c.getsum();
		Thread thread = new Thread();
		Object object = new Object();
	}

}

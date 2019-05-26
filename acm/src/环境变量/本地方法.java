package 环境变量;

import java.io.IOException;
import java.util.Properties;

public class 本地方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(System.getProperty("java.library.path"));
		Properties properties = System.getProperties();
		properties.list(System.out);
	}

}

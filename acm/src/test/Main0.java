package test;

import java.lang.reflect.Constructor;

public class Main0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor<?>[] constructors = Test1Impl.class.getConstructors();
		for(Constructor<?> x:constructors) {
			System.out.println(x.getName());
		}
		System.out.println("dsjfoid");
		
	}

}

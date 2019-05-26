package design.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 动态代理
 * 代理可以帮助我们进行很好的封装，使底层的代码能够有效的隐藏起来
 * 
 * */
interface ProxyInterface{
	void say();
}
class ConsumerExample implements ProxyInterface{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("this is consumer");
	}
	
}
class ProxyExample implements InvocationHandler{
	private Object isProxied;
	public ProxyExample() {
		// TODO Auto-generated constructor stub
	}
	public ProxyExample(Object isProxied) {
		this.isProxied = isProxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("this is ProxyExample");
		Object invoke = method.invoke(isProxied, args);
		return invoke;
	}
	
}
public class DynamicProxy {
	static void customer(ProxyInterface proxyInterface) {
		proxyInterface.say();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerExample consumerExample = new ConsumerExample();
		ProxyExample proxyExample = new ProxyExample(consumerExample);
		ClassLoader classLoader = ProxyInterface.class.getClassLoader();
		ProxyInterface newProxyInstance = (ProxyInterface) Proxy.newProxyInstance(classLoader, new Class[]{ProxyInterface.class}, proxyExample);
		customer(newProxyInstance);
	}

}

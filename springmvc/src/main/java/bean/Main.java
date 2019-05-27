package bean;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {
	
	
	
	@Test
	public void test() {
		ApplicationContext context =  new ClassPathXmlApplicationContext("bean/blog-bean.xml");
		BlogJDBCTemplate bean = context.getBean(BlogJDBCTemplate.class);
		BlogBean bean3 = new BlogBean();
		bean3.setPost_title("你好");
		bean3.setPost_content("的是佛i就");
		bean3.setPost_time(new Date());
		int insertBlog = bean.insertBlog(bean3);
		System.out.println(insertBlog);
		List<BlogBean> listBlog = bean.listBlog();
		for(BlogBean bean2:listBlog) {
			System.out.println(bean2.toString());
		}
	}
	
	public void name() {
		System.out.println(new Date());
	}
}

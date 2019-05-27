package hibernate.dao;

import java.util.List;

import bean.BlogBean;

public interface BlogDao {
	
	BlogBean queryById(Integer id);
	int addBlog(BlogBean blogBean);
	List<BlogBean> queryAll();
}

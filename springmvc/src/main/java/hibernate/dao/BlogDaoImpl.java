package hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.BlogBean;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	public BlogDaoImpl() {

	}

	public int addBlog(BlogBean blogBean) {
		this.session = sessionFactory.openSession();
		session.save(blogBean);
		return 0;
	}

	public BlogBean queryById(Integer id) {
		String sqlString = "select * from w_blog where post_id=?";
		NativeQuery<BlogBean> nativeQuery = session.createNativeQuery(sqlString, BlogBean.class);
		nativeQuery.setParameter(1, id);
		List<BlogBean> resultList = nativeQuery.getResultList();
		BlogBean blogBean = null;
		for (BlogBean bean : resultList) {
			blogBean = bean;
			System.out.println(bean.toString());
		}
		return blogBean;
	}

	public List<BlogBean> queryAll() {
		String sqlString = "select * from w_blog";
		NativeQuery<BlogBean> nativeQuery = session.createNativeQuery(sqlString, BlogBean.class);
		List<BlogBean> resultList = nativeQuery.getResultList();
		for (BlogBean bean : resultList) {
			System.out.println(bean.toString());
		}
		return resultList;
	}

}

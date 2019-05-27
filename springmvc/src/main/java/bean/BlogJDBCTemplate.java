package bean;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.sun.org.apache.regexp.internal.recompile;

public class BlogJDBCTemplate implements BlogDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManager;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	@Override
	public List<BlogBean> listBlog() {
		// TODO Auto-generated method stub
		String sqlString = "select * from w_blog";
		List<BlogBean> query = jdbcTemplate.query(sqlString, new BlogJDBCTMapper());
		return query;
	}

	@Override
	public int insertBlog(BlogBean bean) {
		// TODO Auto-generated method stub
		String sqlString = "insert into "
				+ "w_blog(post_title,post_content,post_time)"
				+ "values(?,?,?)";
		int update = jdbcTemplate.update(sqlString, new Object[] {
				bean.getPost_title(),bean.getPost_content(),bean.getPost_time()
		});
		return update;
	}

}

package bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class BlogJDBCTMapper implements RowMapper<BlogBean>{

	@Override
	public BlogBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BlogBean bean = new BlogBean();
		bean.setPost_id(rs.getInt("post_id"));
		bean.setPost_title(rs.getString("post_title"));
		bean.setPost_content(rs.getString("post_content"));
		Date date = rs.getDate("post_time");
		bean.setPost_time(date);
		return bean;
	}

}

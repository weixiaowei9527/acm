package bean;

import java.util.List;

public interface BlogDao {
	List<BlogBean>listBlog();
	int insertBlog(BlogBean bean);
}

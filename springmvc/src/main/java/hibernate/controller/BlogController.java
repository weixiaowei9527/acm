package hibernate.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.BlogBean;
import hibernate.dao.BlogDao;

@Controller
public class BlogController {
	
	@Autowired
	private BlogDao blogDao;
	
	@RequestMapping("/addblog")
	public String addBlog() {
		
		BlogBean bean = new BlogBean();
		bean.setPost_title("lkdjfl");
		bean.setPost_content("jdlfkj");
		bean.setPost_time(new Date());
		blogDao.addBlog(bean);
		return "success";
	}
}

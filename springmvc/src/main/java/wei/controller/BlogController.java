package wei.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import bean.BlogBean;
import bean.BlogJDBCTemplate;


@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private BlogJDBCTemplate blogJDBCTemplate;
	
	@RequestMapping(value="/select",method=RequestMethod.POST)
	@ResponseBody
	public List<BlogBean> selectBlog() {
		List<BlogBean> listBlog = null;
		if (blogJDBCTemplate!=null) {
			listBlog = blogJDBCTemplate.listBlog();
			System.out.println(listBlog.size());
			BlogBean bean = new BlogBean();
		}else {
			System.out.println("select");
		}
		return listBlog;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView putBlog(BlogBean blog) {
		ModelAndView mav = new ModelAndView();
		 mav.setViewName("forward:success.jsp"); 

        Date date = new Date();
        blog.setPost_time(date);
        System.out.println(blog);
        int insertBlog = blogJDBCTemplate.insertBlog(blog);
        System.out.println(insertBlog);
        if (insertBlog == 1) {
        	mav.addObject("msg",blog.getPost_title()+",发表成功");
		}else {
			mav.addObject("msg","发表失败");
		}
        return mav;
    }
}

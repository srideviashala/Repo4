package com.fdar.articles.infoq.conversion.struts2;

import org.apache.struts2.interceptor.ServletRequestAware;
import com.fdar.articles.infoq.conversion.Blog;
import com.fdar.articles.infoq.conversion.BlogService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.ModelDriven;

import javax.servlet.http.HttpServletRequest;

public class BlogAction extends ActionSupport implements ModelDriven, Preparable, ServletRequestAware {

    private int blogId;
    private Blog blog;
    private BlogService service = new BlogService();
    private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public void setId(int blogId) {
        this.blogId = blogId;
    }

    public void prepare() throws Exception {
        if( blogId==0 ) {
            blog = new Blog();
        } else {
            blog = service.findById(blogId);
        }
    }

    public Object getModel() {
        return blog;
    }

    public String save() {
        service.create(blog);
        return SUCCESS;
    }

    public String update() {
        service.update(blog);
        request.setAttribute("blog",blog);
        return SUCCESS;
    }

    public String remove() {
        service.delete(blogId);
        return SUCCESS;
    }

    public String execute() {
        request.setAttribute("blog",blog);
        return SUCCESS;
    }

}


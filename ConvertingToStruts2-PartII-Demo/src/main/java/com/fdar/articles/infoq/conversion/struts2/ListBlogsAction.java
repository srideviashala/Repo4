package com.fdar.articles.infoq.conversion.struts2;

import com.fdar.articles.infoq.conversion.BlogService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class ListBlogsAction extends ActionSupport implements ServletRequestAware {

    private BlogService service = new BlogService();
    private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public String execute() {
        request.setAttribute("bloglist",service.list());
        return SUCCESS;
    }

}

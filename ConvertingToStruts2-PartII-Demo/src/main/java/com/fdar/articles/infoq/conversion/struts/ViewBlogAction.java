package com.fdar.articles.infoq.conversion.struts;

import com.fdar.articles.infoq.conversion.BlogService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ViewBlogAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        BlogService service = new BlogService();
        String id = request.getParameter("id");
        request.setAttribute("blog",service.findById(Integer.parseInt(id)));

        return (mapping.findForward("success"));
    }
}


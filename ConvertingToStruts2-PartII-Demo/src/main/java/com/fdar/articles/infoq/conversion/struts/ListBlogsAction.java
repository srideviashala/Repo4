package com.fdar.articles.infoq.conversion.struts;

import com.fdar.articles.infoq.conversion.BlogService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;

public class ListBlogsAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        BlogService service = new BlogService();
        request.setAttribute("bloglist",service.list());

        return (mapping.findForward("success"));
    }
}


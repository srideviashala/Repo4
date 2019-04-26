package com.fdar.articles.infoq.conversion.struts;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.Action;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.fdar.articles.infoq.conversion.BlogService;

public class RemoveBlogEntryAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        BlogService service = new BlogService();
        String id = request.getParameter("id");
        service.delete(Integer.parseInt(id));

        return (mapping.findForward("success"));
    }
}

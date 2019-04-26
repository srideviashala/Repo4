package com.fdar.articles.infoq.conversion.struts;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.Action;
import org.apache.commons.beanutils.BeanUtils;
import com.fdar.articles.infoq.conversion.Blog;
import com.fdar.articles.infoq.conversion.BlogService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class SaveBlogEntryAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        BlogService service = new BlogService();
        BlogForm blogForm = (BlogForm) form;
        Blog blog = new Blog();
        BeanUtils.copyProperties( blog, blogForm );

        service.create( blog );

        return (mapping.findForward("success"));
    }
}

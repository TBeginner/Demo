package myTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {

    @Override
    public int doEndTag() throws JspException {

        try {
            pageContext.getOut().print("HelloOOOOO");
        } catch (Exception e) {
            throw new JspTagException(e);
        }

        return EVAL_PAGE;
    }
}

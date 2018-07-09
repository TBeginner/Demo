package myservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author zhang_chao
 */
public class DispatcherServlet extends GenericServlet {

	private String target = "/jsp/hello.jsp";
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//  读取参数
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		// 设置属性
		req.setAttribute("USER", userName + " reloaded111");
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(target);
		
		dispatcher.forward(req, res);
	}

}

package project1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name="Nishitha";
		String pwd="12345";
		String uname=req.getParameter("tname");
		String upwd=req.getParameter("pwd");
		
		if(name.equals(uname)&&pwd.equals(upwd))
		{
			HttpSession ssn=req.getSession();
			ssn.setAttribute("user",uname);
			res.sendRedirect("welcome.jsp");
		}
		else
		{
		res.sendRedirect("login.jsp");
		}
	}
	
}

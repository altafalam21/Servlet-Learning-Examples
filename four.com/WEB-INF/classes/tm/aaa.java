package tm;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class aaa extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try{
String nn = rq.getParameter("nm");
String ss = rq.getParameter("sex");
String cc = rq.getParameter("ct");
Cookie c1 = new Cookie("nm",nn);
Cookie c2 = new Cookie("ct",cc);
Cookie c3 = new Cookie("sex",ss);
rs.addCookie(c1);
rs.addCookie(c2);
rs.addCookie(c3);
System.out.println("Request Arrived");
System.out.println("Data arrived");
System.out.println("Name : "+nn);
System.out.println("Gender : "+ss);
System.out.println("City : "+cc);
rs.setContentType("text/html");
PrintWriter pw;
pw = rs.getWriter();
pw.println("<!DOCTYPE HTML>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<meta charset = 'utf-8'>");
pw.println("<title>four.com</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<h1>Session Tracking Example</h1>");
pw.println("<h4>Using Cookies</h4> ");
pw.println("<a href='/four.com/SaveData'>Save</a>");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
e.printStackTrace();
}

}

}

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
String cc = rq.getParameter("ct");
String ss = rq.getParameter("sex");
HttpSession sess = rq.getSession(true);
sess.setAttribute("nm",nn);
sess.setAttribute("ct",cc);
sess.setAttribute("sex",ss);
System.out.println("Request Arrived");
System.out.println("Data Arrived");
System.out.println("Name : "+nn);
System.out.println("Gender : "+ss);
System.out.println("City : "+cc);
rs.setContentType("text/html");
PrintWriter pw;
pw = rs.getWriter();
pw.println("<!DOCTYPE HTML>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>five.com</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<h1>Session Tracking Example</h1>");
pw.println("<h4><u>Using session object</u></h4>");
pw.println("<a href='/five.com/SaveData'>Save</a>");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);
}
}
}



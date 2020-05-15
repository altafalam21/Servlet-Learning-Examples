package tm;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class bbb extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try
{
String nn="";
String cc="";
String ss="";
HttpSession sess;
sess =rq.getSession(false);
if(sess!=null)
{
nn = (String)sess.getAttribute("nm");
cc = (String)sess.getAttribute("ct");
ss = (String)sess.getAttribute("sex");
}
System.out.println("Request arrived");
System.out.println("Data arrived");
System.out.println("Name : "+nn);
System.out.println("City : "+cc);
System.out.println("Gender : "+ss);
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
pw.println("<h1>Session tracking example</h1>");
pw.println("<h4>Using session object</h4>");
pw.println("<h1>Data Saved</h1></body></html>");
pw.println("Name : "+nn+"</br>");
pw.println("Gender : "+ss+"</br>");
pw.println("City : "+cc+"</br>");
pw.println("</center>");
}catch(Exception e)
{
System.out.println(e);
}
}
}
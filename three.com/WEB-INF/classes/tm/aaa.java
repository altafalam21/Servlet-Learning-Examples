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
System.out.println("Request arrived");
System.out.println("Data arrived");
System.out.println("Name : "+nn);
System.out.println("Gender : "+ss);
System.out.println("City : "+cc);
rs.setContentType("text/html");
PrintWriter pw;
pw = rs.getWriter();
pw.println("<!Doctype html>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>three.com</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<h1>Session Tracking Example</h1>");
pw.println("<h4><u>Using URL Rewriting</u></h4>");
pw.println("<a href='/three.com/SaveData?nm="+URLEncoder.encode(nn)
+"&ct="+URLEncoder.encode(cc)+"&sex="+URLEncoder.encode(ss)+"'>Save</a>");
pw.println("</center>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception exception)
{
System.out.println(exception);
}
}
}
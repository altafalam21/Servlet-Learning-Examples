package tm;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class bbb extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try
{
Cookie c[] = rq.getCookies();
String nn = "";
String ss="";
String cc="";
if(c!=null)
{
for(Cookie r:c)
{
if(r.getName().equals("nm"))
{
nn=r.getValue();
}else if(r.getName().equals("ct"))
{
cc=r.getValue();
}else if(r.getName().equals("sex"))
{
ss=r.getValue();
}
}
}
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
pw.println("<title>four.com</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<center>");
pw.println("<h1>Session Tracking Example</h1>");
pw.println("<h4>Using cookies</h4>");
pw.println("<h1>Data Saved</h1></body></html>");
pw.println("Name : "+nn+"<br/>");
pw.println("Gender : "+ss+"<br/>");
pw.println("City : "+cc+"<br/>");
pw.println("</center>");
}catch(Exception e)
{
System.out.println(e);
}

}



}
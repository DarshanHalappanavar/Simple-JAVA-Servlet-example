import java.io.*;
import java.util.*;
import javax.servlet.*;
public class Assignment
extends GenericServlet {
public void service(ServletRequest request,
ServletResponse response)
throws ServletException, IOException {
// Get print writer.
PrintWriter pw = response.getWriter();
// Get enumeration of parameter names.
Enumeration e = request.getParameterNames();
// Display parameter names and values.
pw.print("<table border><caption>Student Details</caption>"+"<tr><th>Student data</th><th>data values</th></tr>");
while(e.hasMoreElements()) {
String pn = (String)e.nextElement();
String pv = request.getParameter(pn);
pw.print("<tr><td>"+pn+"</td><td>"+pv+"</td></tr>");
}
pw.print("</table>");
pw.close();
}
}

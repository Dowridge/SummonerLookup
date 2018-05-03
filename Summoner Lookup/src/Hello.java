import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/Hello")
public class Hello extends HttpServlet {
 private static final long serialVersionUID = 1;


 //https://github.com/taycaldwell/riot-api-java
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  League a = new League();
  String sn = request.getParameter("r1n");
  String sd = request.getParameter("r1d");
  a.setnamenamea(sn, sd);
  out.print(a);
 }

}
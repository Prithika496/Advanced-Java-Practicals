
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SubjectList extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SubjectList</title>");            
            out.println("</head>");
            out.println("<body>");
            
            HttpSession hs = request.getSession(false);
            out.println("<br>Welcome Again " + hs.getAttribute("uname"));
            int n1 = Integer.parseInt((String)hs.getAttribute("visit")) + 1;
            out.println("<br>You visited " + n1 + " times");
            hs.setAttribute("visit", n1 + "");
            out.println("<br>Your Session Id " + hs.getId() );
            out.println("<br>You Logged in at " + new java.util.Date(hs.getCreationTime()));
            
            out.println("<br><h1 align=center>Welcome to TYBSCIT Div B</h1><br>");
            out.println("<br>");
            out.println("<h3 align=center>Subjects</h3>");
            
            out.println("<table border=1px solid black align=center>");
            out.println("<tr>");
            out.println("<th>Subject list</th>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Advanced Java</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Artificial Intelligence</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Internet of things</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>ASP.NET with C#</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Project Management</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            
            
            out.println("<a href=Home> <button> Home </button> </a><br>");
            out.println("<br>");
            out.println("<a href=StudentList> <button> StudentList </button> </a><br>");
            out.println("<br>");
            out.println("<a href=Achievements> <button> Achievements </button> </a><br>");
            out.println("<br>");
            out.println("<a href=Logout> <button> Logout </button> </a><br>");
            out.println("<br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
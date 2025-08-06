
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Achievements extends HttpServlet {  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Achievements</title>");            
            out.println("</head>");
            out.println("<body>");
            
            HttpSession hs = request.getSession(false);
            out.println("Welcome Again " + hs.getAttribute("uname"));
            int n1 = Integer.parseInt((String)hs.getAttribute("visit")) + 1;
            out.println("<br>You visited " + n1 + " times");
            hs.setAttribute("visit", n1 + "");
            out.println("<br>Your Session Id " + hs.getId());
            out.println("<br>You Logged in at " + new java.util.Date(hs.getCreationTime()));  
            
            out.println("<br><h1 align=center>Welcome to TYBSCIT Div B</h1><br>");
            out.println("<br>");
            out.println("<h3 align=center>Achievements</h3>");
            out.println("<img src=image.avif height=300 width=300>");
            out.println("<p>Throughout my academic and professional journey, I have consistently demonstrated a commitment to excellence and growth. I have successfully completed multiple projects, often exceeding expectations and earning recognition from peers and mentors. My ability to work collaboratively, think critically, and adapt to new challenges has led to several personal and team accomplishments. These achievements reflect my dedication, perseverance, and continuous pursuit of improvement in everything I do. </p>");
            out.println("<a href=Home> <button> Home </button> </a><br>");
            out.println("<br>");
            out.println("<a href=StudentList> <button> StudentList </button> </a><br>");
            out.println("<br>");
            out.println("<a href=SubjectList> <button> Subjects </button> </a><br>");
            out.println("<br>");
            out.println("<a href=Logout> <button> Logout </button> </a><br>");
            out.println("<br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
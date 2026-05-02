// // import java.io.IOException;
// // import java.io.PrintWriter;
// // import javax.servlet.ServletException;
// // import javax.servlet.http.HttpServlet;
// // import javax.servlet.http.HttpServletResponse;

// // public class exe01 extends HttpServlet {
// //     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
// //         throws ServletException, IOException {
// //         response.setContentType("text/html;charset=UTF-8");
// //         try (PrintWriter out = response.getWriter()) {
// //           Integer a = Integer.parseInt(request.getParameter("a"));
// //           Integer b = Integer.parseInt(request.getParameter("b"));
// //           out.println("<html><body>");
// //           out.println("A soma de " +
// //                   a + " e " + b + 
// //                   " será " + (a + b));
// //           out.println("</body></html>");
// //         } 
// //     }
// // }
// import java.io.IOException;
// import java.io.PrintWriter;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// public class exe01 extends HttpServlet {

//     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//         throws ServletException, IOException {
        
//         response.setContentType("text/html;charset=UTF-8");
        
//         try (PrintWriter out = response.getWriter()) {

//             Integer a = Integer.parseInt(request.getParameter("a"));
//             Integer b = Integer.parseInt(request.getParameter("b"));

//             out.println("<html><body>");
//             out.println("A soma de " + a + " e " + b + " será " + (a + b));
//             out.println("</body></html>");
//         }
//     }

//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//         throws ServletException, IOException {
//         processRequest(request, response);
//     }

//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response)
//         throws ServletException, IOException {
//         processRequest(request, response);
//     }
// }
// // @WebServlet(urlPatterns = {"/ListaProduto"})
// // public class ListaProduto extends HttpServlet {
// //      @EJB
// //      beans.ProdutoGestorLocal facade;
// //      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
// //              throws ServletException, IOException {
// //          response.setContentType("text/html;charset=UTF-8");
// //          try (PrintWriter out = response.getWriter()) {
// //              /* TODO output your page here. You may use following sample code. */
// //              out.println("<!DOCTYPE html>");
// //              out.println("<html>");
// //              out.println("<head>");
// //              out.println("<title>Servlet ListaProduto</title>");             
// //              out.println("</head>");
// //              out.println("<body>");
// //              List<Produto> lista = facade.listaTodos();
// //              for (Produto produto : lista) {
// //                  out.println("<h2>" + produto.getNome() + " - Empresa: " + produto.getCodEmpresa().getRazaoSocial() + "</h2>");
// //              }
// //              out.println("</body>");
// //              out.println("</html>");
// //          }
// //      }
// //      // Códito omitido.
// // }
// ```jsp
// <html>
// <head>
//     <title>Lista de Usuários</title>
// </head>
// <body>
//     <h1>Lista de Usuários</h1>
//     <table>
//         <tr>
//             <th>Nome</th>
//             <th>Email</th>
//         </tr>
//         <c:forEach var="user" items="${users}">
//             <tr>
//                 <td>${user.name}</td>
//                 <td>${user.email}</td>
//             </tr>
//         </c:forEach>
//     </table>
// </body>
// </html>
// ```
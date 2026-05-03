// // @WebServlet(name = "ServletListaProduto",
// // urlPatterns = {"/ServletListaProduto"})
// // public class ServletListaProduto extends HttpServlet {
// //     @EJB
// //     ProdutoGestorLocal facade;
 
// //     protected void doGet(HttpServletRequest request,
// //             HttpServletResponse response)
// //             throws ServletException, IOException {
// //             response.setContentType("text/html;charset=UTF-8");
// //             try (PrintWriter out = response.getWriter()) {
// //                 out.println("< html >< body >");
// //                 facade.obterTodos().forEach(p -> {
// //                     out.println("
// //                             " + p.getNome());
// //                 });
// //                 out.println("");
// //             }
// //     }
// // } 
// body {
// __________ emf = Persistence.createEntityManagerFactory("PU");
// __________ em = emf.createEntityManager();
// em.getTransaction().begin();
// c = new Curso(3, "EE");
// em.__________(c);
// em.getTransaction().commit(); 
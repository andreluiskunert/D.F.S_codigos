// // @WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
// // public class FrontController extends HttpServlet {
 
// //     static final Map<String, Controller> controllers = new HashMap();
 
// //     static {
// //         controllers.put("welcome", new HomeController());
// //         controllers.put("books", new BookController());
// //     }
 
// //     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
// //             throws ServletException, IOException {
 
// //         String path = request.getParameter("acao");
// //         System.out.println(path);
// //         Controller controller = controllers.get(path);
// //         if (controller != null) {
// //             controller.handleRequest(request, response);
// //         } else {
// //             response.sendError(HttpServletResponse.SC_NOT_FOUND);
// //         }
// //     }
// public class FrontController {
//     private Dispatcher dispatcher;
 
//     public FrontController() {
//         dispatcher = new Dispatcher();
//     }
 
//     private boolean isAuthenticated(HttpServletRequest request) {
//         // Verifica se o usuário está autenticado
//         // Retorna true se estiver autenticado, false caso contrário
//     }
 
//     public void handleRequest(HttpServletRequest request, HttpServletResponse response) {
//         if (isAuthenticated(request)) {
//             dispatcher.dispatch(request, response);
//         } else {
//             response.sendRedirect("login.jsp");
//         }
//     }
// }

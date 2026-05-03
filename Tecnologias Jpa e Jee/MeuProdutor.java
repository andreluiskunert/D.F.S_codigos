
// // @WebServlet("/MeuProdutor")
// // public class MeuProdutor extends HttpServlet {
 
// //     @Resource(mappedName = "jms/MinhaConnectionFactory")
// //     private ConnectionFactory connectionFactory;
// //     @Resource(mappedName = "jms/MinhaQueue")
// //     private Queue queue;
 
// //     public void putMessage(String mensagem) {
// //         try {
// //             Connection connection = connectionFactory.createConnection();
// //             Session session = connection.createSession(false,
// //                     Session.AUTO_ACKNOWLEDGE);
// //             MessageProducer messageProducer
// //                     = session.createProducer(queue);
// //             TextMessage message = session.createTextMessage();
// //             message.setText(mensagem);
// //             messageProducer.send(message);
// //         } catch (JMSException ex) {
 
// //         }
// //     }
// //     @Override
// //     protected void doGet(HttpServletRequest request, 
// //             HttpServletResponse response) throws IOException{
// //         response.setContentType("text/html;charset=UTF-8");
// //         request.setCharacterEncoding("UTF-8");
// //         String mensagem = request.getParameter("mensagem");
// //         putMessage(mensagem);
// //         PrintWriter out = response.getWriter();
// //             out.println("<h1>Sua Mensagem foi Enviada</h1>");
// //             out.println("Mensagem: " + mensagem);
// //     }
// // }
// // <html>
// // <head>
// // <title>TODO supply a title</title>
// // <meta charset="UTF-8">
// // <meta name="viewport" content="width=device-width, initial-scale=1.0">
// // </head>
// // <body>
// // <form action="MeuProdutor">
// // <input type="text" name="mensagem">
// // <input type="submit" value="Envie uma mensagem!">
// // </form>
// // </body>
// // </html>
// @Local
// public interface ProdutoGestorLocal {
//     List< Produto > obterTodos();
//     void incluir(Produto p);
// }
 
// @Stateless
// public class ProdutoGestor implements ProdutoGestorLocal {
//     @Override
//     public List obterTodos() {
//         EntityManagerFactory emf = Persistence.
//             createEntityManagerFactory("ExemploSimplesJPAPU");
//         EntityManager em = emf.createEntityManager();
//         Query query = em.createNamedQuery("Produto.findAll");
//         List< Produto > lista = query.getResultList();
//         em.close();
//         return lista;
//     }
//     @Override
//     public void incluir(Produto p) {
//         EntityManagerFactory emf = Persistence.
//             createEntityManagerFactory("ExemploSimplesJPAPU");
//         EntityManager em = emf.createEntityManager();
//         try {
//             em.getTransaction().begin();
//             em.persist(p);
//             em.getTransaction().commit();
//         } catch (Exception e) {
//             em.getTransaction().rollback();
//         } finally {
//             em.close();
//         }
//     }

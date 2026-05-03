// // // // // // // protected void processRequest(HttpServletRequest request, HttpServletResponse response)
// // // // // // //         throws ServletException, IOException {
// // // // // // //         response.setContentType("text/html;charset=UTF-8");
// // // // // // //         try (PrintWriter out = response.getWriter()) {
// // // // // // //             out.println("< html >< body >");
// // // // // // //             try {
// // // // // // //                 InitialContext ctx = new InitialContext();
// // // // // // //                 DataSource dts = (DataSource) ctx.lookup("jdbc/loja");
// // // // // // //                 Connection c1 = dts.getConnection();
// // // // // // //                 Statement st = c1.createStatement();
// // // // // // //                 ResultSet rs = st.executeQuery("SELECT * FROM PRODUTO");
// // // // // // //                 while(rs.next())
// // // // // // //                     out.println(rs.getString("NOME")+"
// // // // // // //                             ");
// // // // // // //                 c1.close();
// // // // // // //             } catch (SQLException | NamingException ex) {
// // // // // // //             }
// // // // // // //             out.println("");
// // // // // // //         }
// // // // // // // } 
// // // // // // @Local
// // // // // // public interface CalculadoraLocal {
// // // // // //     int somar(int a, int b);
// // // // // // } 
// // // // // @Stateless
// // // // // public class Calculadora implements CalculadoraLocal {
// // // // //     @Override
// // // // //     public int somar(int a, int b) {
// // // // //         return a + b;
// // // // //     }
// // // // // } 
// // // // @WebServlet(name = "ServletSoma",
// // // // urlPatterns = {"/ServletSoma"})
// // // // public class ServletSoma extends HttpServlet {
 
// // // //     @EJB
// // // //     CalculadoraLocal facade;
 
// // // //     protected void doGet(HttpServletRequest request,
// // // //             HttpServletResponse response)
// // // //             throws ServletException, IOException {
// // // //             response.setContentType("text/html;charset=UTF-8");
// // // //             try (PrintWriter out = response.getWriter()) {
// // // //                 out.println("< html >< body >");
 
// // // //                 out.println("< h1 >Servlet ServletSoma: " +
// // // //                         facade.somar(2, 3) + "< /h1 >");
// // // //                 out.println("< /body >");
// // // //                 out.println("< /html >");
// // // //             }
// // // //     }
// // // // } 
// // // @MessageDriven(activationConfig = {
// // // @ActivationConfigProperty(propertyName = "destinationLookup",
// // // propertyValue = "jms/SimpleQueue"),
// // // @ActivationConfigProperty(propertyName = "destinationType",
// // // propertyValue = "javax.jms.Queue")
// // // })
// // // public class Mensageiro001 implements MessageListener {
 
// // //     public Mensageiro001() {
// // //     }
 
// // //     @Override
// // //     public void onMessage(Message message) {
// // //         try {
// // //             System.out.println("Mensagem enviada: "+
// // //                     ((TextMessage) message).getText());
// // //         } catch (JMSException ex) {
// // //             System.out.println("Erro: "+ex.getMessage());
// // //         }
// // //     }
// // // } 
// // @WebServlet(name = "ServletMessage",
// // urlPatterns = {"/ServletMessage"})
// // public class ServletMessage extends HttpServlet {
// //     @Resource(mappedName = "jms/SimpleConnectionFactory")
// //     private ConnectionFactory connectionFactory;
// //     @Resource(mappedName = "jms/SimpleQueue")
// //     private Queue queue;
 
// //     public void putMessage() throws ServletException {
// //         try {
// //             Connection connection =
// //                 connectionFactory.createConnection();
// //             Session session =
// //                 connection.createSession(false,
// //                         Session.AUTO_ACKNOWLEDGE);
// //             MessageProducer messageProducer =
// //                 session.createProducer(queue);
// //             TextMessage message = session.createTextMessage();
// //             message.setText("Teste com MDB");
// //             messageProducer.send(message);
// //         } catch (JMSException ex) {
// //             throw new ServletException(ex);
// //         }
// //     }
 
// //     protected void doGet(HttpServletRequest request,
// //             HttpServletResponse response)
// //             throws ServletException, IOException {
// //             response.setContentType("text/html;charset=UTF-8");
// //             try (PrintWriter out = response.getWriter()) {
// //                 out.println("");
// //                 out.println("");
 
// //                 putMessage();
 
// //                 out.println("< h1 >Mensagem Enviada< /h1 >");
// //                 out.println("");
// //             }
// //     }
// // } 
// // // 
// @MessageDriven(activationConfig = {
//     @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/MinhaQueue"),
//     @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
// })
// public class MeuReceptor implements MessageListener {
 
//     public MeuReceptor() {
//     }
 
//     @Override
//     public void onMessage(Message message) {
//         try { System.out.println("Mensagem enviada: "
//                     + ((TextMessage) message).getText());
//         } catch (JMSException ex) {
//             System.out.println("Erro: " + ex.getMessage());
//         }
//     }
// }

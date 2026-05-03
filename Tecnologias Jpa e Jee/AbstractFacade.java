// // // // // // public abstract class AbstractFacade {
// // // // // //     private Class entityClass;
// // // // // //     public AbstractFacade(Class entityClass) {
// // // // // //         this.entityClass = entityClass;
// // // // // //     }
// // // // // //     protected abstract EntityManager getEntityManager();
// // // // // //     public void create(T entity) {
// // // // // //         getEntityManager().persist(entity);
// // // // // //     }
// // // // // //     public void edit(T entity) {
// // // // // //         getEntityManager().merge(entity);
// // // // // //     }
// // // // // //     public void remove(T entity) {
// // // // // //         getEntityManager().remove(getEntityManager().merge(entity));
// // // // // //     }
// // // // // //     public T find(Object id) {
// // // // // //         return getEntityManager().find(entityClass, id);
// // // // // //     }
// // // // // //     public List findAll() {
// // // // // //         javax.persistence.criteria.CriteriaQuery cq =
// // // // // //             getEntityManager().getCriteriaBuilder().createQuery();
// // // // // //         return getEntityManager().createQuery(cq).getResultList();
// // // // // //     }
// // // // // //     public List< T > findRange(int[] range) {
// // // // // //         javax.persistence.criteria.CriteriaQuery cq =
// // // // // //             getEntityManager().getCriteriaBuilder().createQuery();
// // // // // //         cq.select(cq.from(entityClass));
// // // // // //         javax.persistence.Query q =
// // // // // //             getEntityManager().createQuery(cq);
// // // // // //         q.setMaxResults(range[1] - range[0] + 1);
// // // // // //         q.setFirstResult(range[0]);
// // // // // //         return q.getResultList();
// // // // // //     }
// // // // // //     public int count() {
// // // // // //         javax.persistence.criteria.CriteriaQuery cq =
// // // // // //             getEntityManager().getCriteriaBuilder().createQuery();
// // // // // //         javax.persistence.criteria.Root< T > rt =
// // // // // //             cq.from(entityClass);
// // // // // //         cq.select(
// // // // // //                 getEntityManager().getCriteriaBuilder().count(rt));
// // // // // //         javax.persistence.Query q =
// // // // // //             getEntityManager().createQuery(cq);
// // // // // //         return ((Long) q.getSingleResult()).intValue();
// // // // // //     }
// // // // // // } 
// // // // // <%@page contentType="text/html" pageEncoding="UTF-8"%>
// // // // // <html>
// // // // //     <body>
// // // // //         <form action="CadastroFC" method="post">
// // // // //             <input type="hidden" name="acao" value="incEmpExec"/>
// // // // //             Razão Social: <input type="text" name="razao_social"/><br/>
// // // // //             <input type="submit" value="Cadastrar"/>
// // // // //         </form>
// // // // //     </body>
// // // // // </html> 
// // // // <%@page import="model.Empresa"%>
// // // // <%@page import="java.util.List"%>
// // // // <%@page contentType="text/html" pageEncoding="UTF-8"%>
// // // // <html>
// // // //     <body>
// // // //         <form action="CadastroFC" method="post">
// // // //             <input type="hidden" name="acao" value="incDepExec"/>
// // // //             Empresa:
// // // //             <select name="cod_empresa">
// // // //                 <%
// // // //                     List<Empresa> lista = (List<Empresa>)
// // // //                     request.getAttribute("listaEmp");
// // // //                     for(Empresa e: lista){
// // // //                     %>
// // // //                     <option value="<%=e.getCodigo()%>">
// // // //                     <%=e.getRazaoSocial()%>
// // // //                     </option>
// // // //                     <% } %>
// // // //             </select><br/>
// // // //             Nome: <input type="text" name="nome"/>
 
// // // //             <input type="submit" value="Cadastrar"/>
// // // //         </form>
// // // //     </body>
// // // // </html> 
// // // <%@page import="model.Empresa"%>
// // // <%@page import="java.util.List"%>
// // // <%@page contentType="text/html" pageEncoding="UTF-8"%>
// // // <html>
// // //     <body>
// // //         <a href="CadastroFC?acao=incEmp">Nova Empresa</a>
// // //         <table border="1" width="100%">
// // //             <tr><td>Código</td><td>Razão Social</td><td>Opções</td></tr>
// // //             <%
// // //                 List<Empresa> lista = (List<Empresa>)
// // //                 request.getAttribute("lista");
// // //                 for(Empresa e: lista){
// // //                 %>
// // //                 <tr><td><%=e.getCodigo()%></td>
// // //                     <td><%=e.getRazaoSocial()%> </td>
// // //                     <td>
// // //                         <a href="CadastroFC?acao=excEmpExec&cod=<%=e.getCodigo()%>">
// // //                             Excluir</a>
// // //                     </td>
// // //                 </tr>
// // //                 <% } %>
// // //         </table>
// // //     </body>
// // // </html> 
// // <%@page import="model.Departamento"%>
// // <%@page import="java.util.List"%>
// // <%@page contentType="text/html" pageEncoding="UTF-8"%>
// // <html>
// //     <body>
// //         <a href="CadastroFC?acao=incDep">Novo Departamento</a>
// //         <table border="1" width="100%">
// //             <tr><td>Código</td><td>Nome</td><td>Empresa</td>
// //                 <td>Opções</td></tr>
// //             <%
// //                     List<Departamento> lista = (List<Departamento>)
// //                     request.getAttribute("lista");
// //                     for(Departamento d: lista){
// //                     %>
// //                     <tr><td><%=d.getCodigo()%></td>
// //                         <td><%=d.getNome()%></td>
// //                         <td><%=d.getEmpresa().getRazaoSocial()%></td>
// //                         <td>
// //                             <a href="CadastroFC?acao=excDepExec&cod=<%=d.getCodigo()%>">
// //                                 Excluir</a>
// //                         </td>
// //                     </tr>
// //                     <% } %>
// //         </table>
// //     </body>
// // </html> 
// <html>
//     <body>
//         <a href="CadastroFC?acao=listaDep">
//             Listagem de Departamentos</a>
//         <a href="CadastroFC?acao=listaEmp">
//             Listagem de Empresas</a>
//     </body>
// </html> 

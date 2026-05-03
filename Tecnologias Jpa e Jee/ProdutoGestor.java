// // @Local
// // public interface ProdutoGestorLocal {
// //     List listaTodos();
// // }
// @Stateless
// public class ProdutoGestor implements ProdutoGestorLocal {
 
//     @Override
//     public List<Produto> listaTodos() {
//         EntityManagerFactory emf
//                 = Persistence.createEntityManagerFactory("EnterpriseApplication1-ejbPU2");
//         EntityManager em = emf.createEntityManager();
//         Query query = em.createNamedQuery("Produto.findAll");
//         List lista = query.getResultList();
//         em.close();
//         return lista;
//     }
// }
// // // public class Principal {
// // //     public static void main(String[] args) {
// // //         EntityManagerFactory emf =
// // //             Persistence.createEntityManagerFactory(
// // //                     "ExemploSimplesJPAPU");
// // //         EntityManager em = emf.createEntityManager();
// // //         Query query = em.createNamedQuery("Produto.findAll");
// // //         List< Produto > lista = query.getResultList();
// // //         lista.forEach((e) -> {
// // //             System.out.println(e.getNome());
// // //         });
// // //         em.close();
// // //     }
// // // }
// // public class Principal {
 
// //     public static void main(String[] args) {
// //         EntityManagerFactory emf
// //                 = Persistence.createEntityManagerFactory(
// //                         "ExemploSimplesJPAPU");
// //         EntityManager em = emf.createEntityManager();
// //         Query query = em.createNamedQuery("Produto.findByCodProduto");
// //         query.setParameter("codProduto", 1);
// //         List< Produto> lista = query.getResultList();
// //         lista.forEach((e) -> {
// //             System.out.println(e.getCodProduto() + "-" + e.getNome());
// //         });
// //         em.close();
// //     }
// // } 
// @Entity
// @NamedQueries({
//     @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
//     @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.department = :department")
// })
// public class Employee {
//     // restante da classe
// }
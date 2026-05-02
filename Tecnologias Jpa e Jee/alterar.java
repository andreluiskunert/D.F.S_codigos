// public static void alterar(Produto p){
//     EntityManagerFactory emf =
//         Persistence.createEntityManagerFactory(
//                 "ExemploSimplesJPAPU");
//     EntityManager em = emf.createEntityManager();
//     try {
//         em.getTransaction().begin();
//         em.merge(p);
//         em.getTransaction().commit();
//     }catch(Exception e){
//         em.getTransaction().rollback();
//     }finally{
//         em.close();
//     }
// }

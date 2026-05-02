// public static void excluir(Integer codigo){
//     EntityManagerFactory emf =
//         Persistence.createEntityManagerFactory(
//                 "ExemploSimplesJPAPU");
//     EntityManager em = emf.createEntityManager();
//     try {
//         em.getTransaction().begin();
//         em.remove(em.find(Produto.class, codigo));
//         em.getTransaction().commit();
//     }catch(Exception e){
//         em.getTransaction().rollback();
//     }finally{
//         em.close();
//     }
// } 
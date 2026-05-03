// // public static void excluir(Integer codigo){
// //     EntityManagerFactory emf =
// //         Persistence.createEntityManagerFactory(
// //                 "ExemploSimplesJPAPU");
// //     EntityManager em = emf.createEntityManager();
// //     try {
// //         em.getTransaction().begin();
// //         em.remove(em.find(Produto.class, codigo));
// //         em.getTransaction().commit();
// //     }catch(Exception e){
// //         em.getTransaction().rollback();
// //     }finally{
// //         em.close();
// //     }
// // } 
// CREATE TABLE EMPRESA (
//     CODIGO INT NOT NULL PRIMARY KEY,
//     RAZAO_SOCIAL VARCHAR(50));
 
// CREATE TABLE DEPARTAMENTO (
//     CODIGO INT NOT NULL PRIMARY KEY,
//     NOME VARCHAR(50),
//     COD_EMPRESA INT NOT NULL);
 
// ALTER TABLE DEPARTAMENTO ADD FOREIGN KEY(COD_EMPRESA)
// REFERENCES EMPRESA(CODIGO);
 
// CREATE TABLE SERIAIS (
//     NOME_TABELA VARCHAR(50) NOT NULL PRIMARY KEY,
//     VALOR_CHAVE INT);
 
// INSERT INTO SERIAIS VALUES ('EMPRESA',0);
// INSERT INTO SERIAIS VALUES ('DEPARTAMENTO',0); 
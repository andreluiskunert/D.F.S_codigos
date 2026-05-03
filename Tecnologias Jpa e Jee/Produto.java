// // // // // public class Produto {
// // // // //     private int codigo;
// // // // //     private String nome;
// // // // //     private int quantidade;
 
// // // // //     public Produto(){}
// // // // //     // Os getters e setters das propriedades foram omitidos
// // // // // }
// // // // // <hibernate-mapping schema="loja">
// // // // //     <class name="model.Produto" table="PRODUTO">
// // // // //         <id name="codigo" type="int">
// // // // //             <column name="COD_PRODUTO">
// // // // //         </id>
// // // // //         <property name="nome" type="string" column="NOME">
// // // // //         <property name="quantidade" type="int" column="QUANTIDADE">
// // // // //     </class>
// // // // // </hibernate-mapping>
// // // // // @Entity
// // // // // @Table(name = "PRODUTO")
// // // // // @NamedQueries({
// // // // // @NamedQuery(name = "Produto.findAll",
// // // // // query = "SELECT p FROM Produto p")})
// // // // // public class Produto implements Serializable {
// // // // //     private static final long serialVersionUID = 1L;
// // // // //     @Id
// // // // //     @Basic(optional = false)
// // // // //     @Column(name = "COD_PRODUTO")
// // // // //     private Integer codigo;
// // // // //     @Column(name = "QUANTIDADE")
// // // // //     private Integer quantidade;
 
// // // // //     public Produto() {
// // // // //     }
// // // // //     public Produto(Integer codigo) {
// // // // //         this.codigo = codigo;
// // // // //     }
// // // // //     // Os getters e setters das propriedades foram omitidos
// // // // //     @Override
// // // // //     public int hashCode() {
// // // // //         int hash = 0;
// // // // //         hash += (codigo != null ? codigo.hashCode() : 0);
// // // // //         return hash;
// // // // //     }
// // // // //     @Override
// // // // //     public boolean equals(Object object) {
// // // // //         if (object==null||!(object instanceof Produto)) {
// // // // //             return false;
// // // // //         }
// // // // //         Produto other = (Produto) object;
// // // // //         return this.codigo!=null &&
// // // // //             this.codigo.equals(other.codigo);
// // // // //     }
// // // // //     @Override
// // // // //     public String toString() {
// // // // //         return "model.Produto[ codigo=" + codigo + " ]";
// // // // //     }
// // // // // }
// // // // // <?xml version="1.0" encoding="UTF-8"?>
// // // // // <persistence version="2.1"
// // // // //     xmlns="http://xmlns.jcp.org/xml/ns/persistence"
// // // // //     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
// // // // //     xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
// // // // //     http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
// // // // // <persistence-unit name="ExemploSimplesJPAPU"
// // // // //     transaction-type="RESOURCE_LOCAL">
// // // // // <provider>
// // // // //     org.eclipse.persistence.jpa.PersistenceProvider;
// // // // // </provider>
// // // // // <class>model.Produto</class>
// // // // // <properties>
// // // // //     <property name="javax.persistence.jdbc.url"
// // // // //         value="jdbc:derby://localhost:1527/bancoJPA"/>
// // // // //     <property name="javax.persistence.jdbc.driver"
// // // // //         value="org.apache.derby.jdbc.ClientDriver"/>
// // // // //     <property name="javax.persistence.jdbc.user"
// // // // //         value="bancoJPA"/>
// // // // //     <property name="javax.persistence.jdbc.password"
// // // // //         value="bancoJPA"/>
// // // // // </properties>
// // // // // </persistence-unit>
// // // // // </persistence>
// // // // CREATE TABLE PRODUTO (
// // // //     COD_PRODUTO INTEGER NOT NULL PRIMARY KEY,
// // // //     NOME VARCHAR(50),
// // // //     QUANTIDADE INTEGER);
 
// // // // INSERT INTO PRODUTO VALUES (1,'Morango',200);
// // // // INSERT INTO PRODUTO VALUES (2,'Banana',1000);
// // // // INSERT INTO PRODUTO VALUES (3,'Manga',600);
 
// // // // SELECT * FROM PRODUTO; 
// // // @Entity
// // // @Table(name = "PRODUTO")
// // // @NamedQueries({
// // //     @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
// // //     @NamedQuery(name = "Produto.findByCodProduto", query = "SELECT p FROM Produto p WHERE p.codProduto = :codProduto")
// // // })
// // // public class Produto implements Serializable {
// // // // código omitido
// // CREATE TABLE EMPRESA ( 
// // CODIGO INT NOT NULL PRIMARY KEY,
// // RAZAO_SOCIAL VARCHAR(50)); 
 
// // CREATE TABLE PRODUTO ( 
// // CODIGO INT NOT NULL PRIMARY KEY, 
// // NOME VARCHAR(50), 
// //    QUANTIDADE INTEGER,
// // COD_EMPRESA INT NOT NULL); 
 
// // ALTER TABLE PRODUTO ADD FOREIGN KEY(COD_EMPRESA) 
// // REFERENCES EMPRESA(CODIGO);
 
// // INSERT INTO EMPRESA VALUES (1,'SKY NET'); 
// // INSERT INTO EMPRESA VALUES (2,'MATRIX');
 
// // INSERT INTO PRODUTO VALUES (1,'Morango',200, 1); 
// // INSERT INTO PRODUTO VALUES (2,'Banana',1000, 1); 
// // INSERT INTO PRODUTO VALUES (3,'Manga',600, 2);
// // ====
// @Entity
// @Table(name = "PRODUTO")
// @NamedQueries({
//     @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")})
// public class Produto implements Serializable {
 
//     private static final long serialVersionUID = 1L;
//     @Id
//     @Basic(optional = false)
//     @NotNull
//     @Column(name = "CODIGO")
//     private Integer codigo;
//     @Size(max = 50)
//     @Column(name = "NOME")
//     private String nome;
//     @Column(name = "QUANTIDADE")
//     private Integer quantidade;
//     @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "CODIGO")
//     @ManyToOne(optional = false)
//     private Empresa codEmpresa;
    
//     // Restante do código omitido
// @Entity
// @Table(name = "EMPRESA")
// @NamedQueries({
//     @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")})
// public class Empresa implements Serializable {
 
//     private static final long serialVersionUID = 1L;
//     @Id
//     @Basic(optional = false)
//     @NotNull
//     @Column(name = "CODIGO")
//     private Integer codigo;
//     @Size(max = 50)
//     @Column(name = "RAZAO_SOCIAL")
//     private String razaoSocial;
//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEmpresa")
//     private Collection<Produto> produtoCollection;
//      //Restante do código omitido

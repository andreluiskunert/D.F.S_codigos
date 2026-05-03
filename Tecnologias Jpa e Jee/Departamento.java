// @Entity
// @Table(name = "DEPARTAMENTO")
// @NamedQueries({
// @NamedQuery(name = "Departamento.findAll",
// query = "SELECT d FROM Departamento d")})
// public class Departamento implements Serializable {
//     private static final long serialVersionUID = 1L;
//     @Id
//     @TableGenerator(name = "DeptoTabGen", table = "SERIAIS",
//     pkColumnName = "NOME_TABELA",
//     pkColumnValue = "DEPARTAMENTO",
//     valueColumnName = "VALOR_CHAVE")
//     @GeneratedValue(strategy = GenerationType.TABLE,
//     generator = "DeptoTabGen")
//     @Basic(optional = false)
//     @NotNull
//     @Column(name = "CODIGO")
//     private Integer codigo;
//     // O restante do código foi omitido por não ser relevante
//     // para a modificação efetuada
// }
 
// @Entity
// @Table( name = "EMPRESA" )
// @NamedQueries({
// @NamedQuery(name = "Empresa.findAll",
// query = "SELECT e FROM Empresa e")})
// public class Empresa implements Serializable {
//     private static final long serialVersionUID = 1L;
//     @Id
//     @TableGenerator(name = "EmpTabGen", table = "SERIAIS",
//     pkColumnName = "NOME_TABELA",
//     pkColumnValue = "EMPRESA",
//     valueColumnName = "VALOR_CHAVE")
//     @GeneratedValue(strategy = GenerationType.TABLE,
//     generator = "EmpTabGen")
//     @Basic(optional = false)
//     @NotNull
//     @Column(name = "CODIGO")
//     private Integer codigo;
 
//     // O restante do código foi omitido por não ser relevante
//     // para a modificação efetuada
// } 

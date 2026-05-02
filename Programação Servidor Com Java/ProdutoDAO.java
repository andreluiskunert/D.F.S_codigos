import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Connection getConnection() throws Exception{
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      return DriverManager.getConnection(
         "jdbc:derby://localhost:1527/loja",
         "loja", "loja");      
   }
   private Statement getStatement() throws Exception{
      return getConnection().createStatement();
   }   
   private void closeStatement(Statement st) throws Exception{
      st.getConnection().close();
    }
   
   public List<Produto> obterTodos(){
      ArrayList<Produto> lista = new ArrayList<>();
      try {
         ResultSet r1 = getStatement().executeQuery(
                        "SELECT * FROM PRODUTO");
         while(r1.next())
            lista.add(new Produto(r1.getInt("codigo"),
               r1.getString("nome"),r1.getInt("quantidade")));
         closeStatement(r1.getStatement());
      }catch(Exception e){
      }   
      return lista;       
   }
}

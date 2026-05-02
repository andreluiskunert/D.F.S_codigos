import java.sql.Statement;

public class excluir {
    public excluir(int codigo){
   try {
       Statement st =  getStatement();
      st.executeUpdate(
         "DELETE FROM PRODUTO WHERE CODIGO  = "+
         codigo);
      closeStatement(st);
   }catch(Exception e){
   }
}

	private void closeStatement(Statement st) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'closeStatement'");
	}

	private Statement getStatement() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getStatement'");
	}
}

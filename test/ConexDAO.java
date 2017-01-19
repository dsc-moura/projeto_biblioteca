
import br.riobranco.Biblioteca.Aluno.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexDAO {
    
    
    public void insert (Aluno aluno){
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("Insert into");
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setLong(2, aluno.getCpf());
            stmt.setString(3, aluno.getNome());
            
            stmt.executeUpdate();           
            
        } catch (SQLException ex) {
            throw new RuntimeException("erro");
        }finally{
                Conectar.closeConnection(con, stmt);
        }
    }
    
    public void update (Aluno aluno){
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update ");
            
            stmt.setString(1, aluno.getMatricula());
            stmt.setLong(2, aluno.getCpf());
            stmt.setString(3, aluno.getNome());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            throw new RuntimeException("erro");
        }finally{
            Conectar.closeConnection(con, stmt);
        }       
    }
    
    public static ArrayList<Aluno> listagem (String numero){
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Aluno> listinha = new ArrayList<>();
            
        try {
            stmt = con.prepareStatement("select");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno busca = new Aluno();
                busca.setMatricula(rs.getString("matricula"));
                busca.setCpf(rs.getLong("cpf"));
                busca.setNome(rs.getString("nome"));
                listinha.add(busca);
            }           
            
        } catch (SQLException ex) {
           throw new RuntimeException("erro");
        }
        return listinha;
        
    }
    
    
}

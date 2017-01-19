
package edu.riobranco.Biblioteca.AlunoDAO;

import br.riobranco.Biblioteca.Factory.ConnectionFactory;
import br.riobranco.Biblioteca.Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LivroDAO {
    
    public static void inserirLivros(Livro livro){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement inserir = null;
        
        try {
            inserir = con.prepareStatement("INSERT INTO LIVRO (isbn,titulo,autor,editora) VALUES (?,?,?,?)");
            
            inserir.setInt(1, livro.getIsbn());
            inserir.setString(2, livro.getTitulo());
            inserir.setString(3, livro.getAutor());
            inserir.setString(4, livro.getEditora());
            
            inserir.executeUpdate();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro");
        }finally{
            ConnectionFactory.closeConnection(con, inserir);
        }       
    }
    
    public static ArrayList<Livro> biblioteca (int numero){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement buscarL = null;
        ResultSet resultado = null;
        
        ArrayList<Livro> listinha = new ArrayList<>();
        
        try {
            buscarL = con.prepareStatement("SELECT * FROM LIVRO WHERE isbn = '" + numero + "' ");
            resultado = buscarL.executeQuery();
            
            while(resultado.next()){
                Livro livrinho = new Livro();
                
                livrinho.setTitulo(resultado.getString("titulo"));
                livrinho.setAutor(resultado.getString("autor"));
                livrinho.setEditora(resultado.getString("editora"));
                
                listinha.add(livrinho);               
            }      
            
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, buscarL, resultado);
        }
        return listinha;
    }   
}

package edu.riobranco.Biblioteca.AlunoDAO;

import br.riobranco.Biblioteca.Aluno.Aluno;
import br.riobranco.Biblioteca.Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class AlunoDAO {
    public void adicionar_Aluno(Aluno aluno){        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement gravarA = null;       
        
        try {            
            gravarA = con.prepareStatement("INSERT INTO ALUNO (cpf,nome,matricula)VALUES (?,?,?)");
            
            gravarA.setLong(1, aluno.getCpf());            
            gravarA.setString(2, aluno.getNome()); 
            gravarA.setString(3, aluno.getMatricula());
            
            gravarA.executeUpdate();            
           
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro - Contate o Administrador");
        }finally{
            ConnectionFactory.closeConnection(con, gravarA);           
        }      
    } 
    
    public void alterar_Cadastro(Aluno aluno){        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement gravarA = null;       
        
        try {            
            gravarA = con.prepareStatement("UPDATE ALUNO SET matricula = ?, nome = ? WHERE cpf = ?");
            
            gravarA.setString(1, aluno.getMatricula());
            gravarA.setString(2, aluno.getNome());
            gravarA.setLong(3, aluno.getCpf());
            
            gravarA.executeUpdate();            
           
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro - Contate o Administrador");
        }finally{
            ConnectionFactory.closeConnection(con, gravarA);           
        }      
    } 
    
    public void excluir_Cadastro(Aluno aluno){        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement gravarA = null;       
        
        try {            
            gravarA = con.prepareStatement("DELETE FROM ALUNO WHERE cpf = ?");
            
            gravarA.setLong(1, aluno.getCpf());               
            
            gravarA.executeUpdate();            
           
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro - Contate o Administrador");
        }finally{
            ConnectionFactory.closeConnection(con, gravarA);           
        }      
    } 
    
    public static ArrayList<Aluno> lista(long cpfAluno){
        
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement procurarA = null;
        ResultSet resultado = null;
        
        ArrayList<Aluno> listaA = new ArrayList<>();        
            String sQl = "SELECT * FROM ALUNO WHERE cpf = '" + cpfAluno + "'";
        try {            
            procurarA = con.prepareStatement(sQl);
            resultado = procurarA.executeQuery(); 
            
            while(resultado.next()){   
                Aluno listagem = new Aluno();
                listagem.setMatricula(resultado.getString("matricula"));            
                listagem.setNome(resultado.getString("nome"));
                listagem.setCpf(resultado.getLong("cpf"));        
            
                listaA.add(listagem);
            }
           
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro - Contate o Administrador");
        }finally{
            ConnectionFactory.closeConnection(con, procurarA, resultado);           
        }   
      return listaA;
    }
    
    public boolean validarCPF(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
      
            for (i=0; i<9; i++) {    
                num = (int)(CPF.charAt(i) - 48); 
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11))
            dig10 = '0';
            
            else dig10 = (char)(r + 48); 
            sm = 0;
            peso = 11;
            
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11))
                dig11 = '0';
            
            else dig11 = (char)(r + 48);

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                return(true);
            
            else return(false);
            
        } catch (InputMismatchException erro) {
            return(false);
        }   
    }
}

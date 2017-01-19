package br.riobranco.Biblioteca.Main;

import br.riobranco.Biblioteca.Aluno.Aluno;
import edu.riobranco.Biblioteca.AlunoDAO.AlunoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FORM_Aluno extends javax.swing.JInternalFrame {
    AlunoDAO dao = new AlunoDAO();
    boolean alteracao = false;
      
    public FORM_Aluno() {
        initComponents();
        btn_EditarCadastro.setEnabled(false);
        btn_ExcluirCadastro.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recebe_Nome = new javax.swing.JTextField();
        recebe_Matricula = new javax.swing.JTextField();
        btn_Limpar = new javax.swing.JButton();
        recebe_Cpf = new javax.swing.JTextField();
        cpf_Invalido = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_SalvarCadastro = new javax.swing.JButton();
        btn_EditarCadastro = new javax.swing.JButton();
        btn_ExcluirCadastro = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Matricula:");

        jLabel3.setText("CPF:");

        recebe_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recebe_NomeFocusLost(evt);
            }
        });

        recebe_Matricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recebe_MatriculaFocusLost(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        recebe_Cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recebe_CpfFocusLost(evt);
            }
        });
        recebe_Cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recebe_CpfKeyTyped(evt);
            }
        });

        cpf_Invalido.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        cpf_Invalido.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recebe_Matricula)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(recebe_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpf_Invalido, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addComponent(recebe_Nome))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf_Invalido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recebe_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recebe_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(recebe_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Limpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        btn_SalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/riobranco/Biblioteca/Imagens/disk.png"))); // NOI18N
        btn_SalvarCadastro.setText("Salvar");
        btn_SalvarCadastro.setFocusable(false);
        btn_SalvarCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SalvarCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarCadastroActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_SalvarCadastro);

        btn_EditarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/riobranco/Biblioteca/Imagens/building_edit_1.png"))); // NOI18N
        btn_EditarCadastro.setText("Editar");
        btn_EditarCadastro.setFocusable(false);
        btn_EditarCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_EditarCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_EditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarCadastroActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_EditarCadastro);

        btn_ExcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/riobranco/Biblioteca/Imagens/delete.png"))); // NOI18N
        btn_ExcluirCadastro.setText("Excluir");
        btn_ExcluirCadastro.setFocusable(false);
        btn_ExcluirCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ExcluirCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirCadastroActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_ExcluirCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recebe_NomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recebe_NomeFocusLost

    }//GEN-LAST:event_recebe_NomeFocusLost

    private void recebe_MatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recebe_MatriculaFocusLost

    }//GEN-LAST:event_recebe_MatriculaFocusLost

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        alteracao = false;
        cpf_Invalido.setText(null);
        
        recebe_Cpf.setText("");
        recebe_Nome.setText("");
        recebe_Matricula.setText("");
        
        recebe_Nome.setEditable(true);
        recebe_Cpf.setEditable(true);
        recebe_Matricula.setEditable(true);   
              
        recebe_Cpf.setBackground(Color.WHITE);
        recebe_Matricula.setBackground(Color.WHITE);
        recebe_Nome.setBackground(Color.WHITE);
        
        btn_SalvarCadastro.setEnabled(true);
        btn_EditarCadastro.setEnabled(false);
        btn_ExcluirCadastro.setEnabled(false);
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void recebe_CpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recebe_CpfFocusLost
        if(recebe_Cpf.getText() != null){
           for(Aluno retorna : dao.lista(Long.parseLong(recebe_Cpf.getText()))){
                recebe_Nome.setText(retorna.getNome());
                recebe_Matricula.setText(retorna.getMatricula());
                
                btn_ExcluirCadastro.setEnabled(true);
                btn_EditarCadastro.setEnabled(true);
                btn_SalvarCadastro.setEnabled(false);
                
                recebe_Nome.setBackground(Color.getHSBColor(60, 39, 100));
                recebe_Matricula.setBackground(Color.getHSBColor(60, 39, 100));
                recebe_Cpf.setBackground(Color.getHSBColor(60, 39, 100));
                recebe_Nome.setEditable(false);
                recebe_Matricula.setEditable(false);
                recebe_Cpf.setEditable(false);
                cpf_Invalido.setText(null);
            }              
        }
        if(dao.validarCPF(recebe_Cpf.getText())== true){
            cpf_Invalido.setText("CPF Inválido");
            recebe_Nome.setEditable(true);
            recebe_Matricula.setEditable(true);      
            btn_SalvarCadastro.setEnabled(true);  
        }
        if(dao.validarCPF(recebe_Cpf.getText())== false){
            cpf_Invalido.setText("CPF Inválido");
            recebe_Nome.setEditable(false);
            recebe_Matricula.setEditable(false);         
            btn_SalvarCadastro.setEnabled(false);         
        }            
    }//GEN-LAST:event_recebe_CpfFocusLost

    private void recebe_CpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recebe_CpfKeyTyped
        String digitos = "1234567890";
        if(!digitos.contains(evt.getKeyChar()+"")){
            evt.consume();
        } 
    }//GEN-LAST:event_recebe_CpfKeyTyped

    private void btn_SalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarCadastroActionPerformed
        Aluno cadastro = new Aluno();
        
        cadastro.setNome(recebe_Nome.getText());
        cadastro.setMatricula(recebe_Matricula.getText());
        cadastro.setCpf(Long.parseLong(recebe_Cpf.getText()));
        
        if(alteracao == true){            
            dao.alterar_Cadastro(cadastro);
            recebe_Cpf.setEditable(true);            
            alteracao = false;
            JOptionPane.showMessageDialog(null, "Alteração Realizado com Sucesso!");
        }
        else{            
            dao.adicionar_Aluno(cadastro);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        }
        
        if(recebe_Cpf.getText() == null){
            JOptionPane.showMessageDialog(null, "Digite um CPF Valido");
        }
        
        recebe_Cpf.setBackground(Color.WHITE);
        recebe_Cpf.setText(null);
        recebe_Nome.setText(null);
        recebe_Matricula.setText(null);
        
        btn_SalvarCadastro.setEnabled(true);
        btn_EditarCadastro.setEnabled(false);
        btn_ExcluirCadastro.setEnabled(false);
    }//GEN-LAST:event_btn_SalvarCadastroActionPerformed

    private void btn_EditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarCadastroActionPerformed
        alteracao = true;
        
        recebe_Matricula.setEditable(true);
        recebe_Nome.setEditable(true);       
        recebe_Matricula.setBackground(Color.WHITE);
        recebe_Nome.setBackground(Color.WHITE);
               
        btn_SalvarCadastro.setEnabled(true);
    }//GEN-LAST:event_btn_EditarCadastroActionPerformed

    private void btn_ExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirCadastroActionPerformed
        Aluno cadastro = new Aluno();
        
        cadastro.setNome(recebe_Nome.getText());
        cadastro.setMatricula(recebe_Matricula.getText());
        cadastro.setCpf(Long.parseLong(recebe_Cpf.getText()));
        
        dao.excluir_Cadastro(cadastro);
        
        alteracao = false;
        
        recebe_Cpf.setEditable(true);
        recebe_Matricula.setEditable(true);
        recebe_Nome.setEditable(true);
        
        recebe_Matricula.setBackground(Color.WHITE);
        recebe_Nome.setBackground(Color.WHITE);      
        recebe_Cpf.setBackground(Color.WHITE);
        
        recebe_Cpf.setText("");
        recebe_Nome.setText("");
        recebe_Matricula.setText("");
        
        btn_EditarCadastro.setEnabled(false);
        btn_SalvarCadastro.setEnabled(true);
        btn_ExcluirCadastro.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
    }//GEN-LAST:event_btn_ExcluirCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EditarCadastro;
    private javax.swing.JButton btn_ExcluirCadastro;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_SalvarCadastro;
    private javax.swing.JLabel cpf_Invalido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField recebe_Cpf;
    private javax.swing.JTextField recebe_Matricula;
    private javax.swing.JTextField recebe_Nome;
    // End of variables declaration//GEN-END:variables
}

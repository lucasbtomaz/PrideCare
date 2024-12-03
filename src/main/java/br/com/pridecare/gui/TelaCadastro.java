package br.com.pridecare.gui;

import br.com.pridecare.dao.UsuarioDAO;
import br.com.pridecare.model.Usuario;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 * Classe TelaCadastro representa a tela de cadastro do sistema PrideCare.
 * <p>
 * Esta classe fornece a interface gráfica para que o usuário insira as
 * informações pessoais do usuario que ele vai cadastrar.
 * </p>
 *
 * @author oluca
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Construtor da classe TelaCadastro. Inicializa os componentes gráficos da
     * tela de Cadastro.
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * Funcao para limpar campos depois do cadastrado
     */
    private void limparCampos() {
        textNomeCompleto.setText("");
        textCpf.setText("");
        textDataNascimento.setText("");
        textEmail.setText("");
        textTelefone.setText("");
        textEspecialidade.setText("");
        textCRM.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        dataNascimento = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        orientacaoSexual = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        textNomeCompleto = new javax.swing.JTextField();
        textCpf = new javax.swing.JTextField();
        textDataNascimento = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        btnDeslogar1 = new javax.swing.JButton();
        TiposUsuario = new javax.swing.JLabel();
        TiposUsuario1 = new javax.swing.JLabel();
        textEspecialidade = new javax.swing.JTextField();
        TiposUsuario2 = new javax.swing.JLabel();
        textCRM = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jComboBoxOrientacao = new javax.swing.JComboBox<>();
        jTipoUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 50, 150));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome Completo:");

        dataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        dataNascimento.setText("Data de nascimento:");

        genero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(255, 255, 255));
        genero.setText("Gênero:");

        orientacaoSexual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orientacaoSexual.setForeground(new java.awt.Color(255, 255, 255));
        orientacaoSexual.setText("Orientação sexual:");

        CPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF");

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email:");

        Telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone:");

        textNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeCompletoActionPerformed(evt);
            }
        });

        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnDeslogar1.setText("Deslogar");
        btnDeslogar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogar1ActionPerformed(evt);
            }
        });

        TiposUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TiposUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TiposUsuario.setText("Tipo de Cadastro:");

        TiposUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TiposUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        TiposUsuario1.setText("Especialidade:");

        textEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEspecialidadeActionPerformed(evt);
            }
        });

        TiposUsuario2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TiposUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        TiposUsuario2.setText("CRM:");

        textCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCRMActionPerformed(evt);
            }
        });

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cisgênero", "Transgênero", "Gênero neutro", "Não-binário", "Bigênero" }));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        jComboBoxOrientacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heterossexual", "Homossexual", "Bissexual", "Pansexual", "Outro" }));
        jComboBoxOrientacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrientacaoActionPerformed(evt);
            }
        });

        jTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Medico", "Farmaceutico", "Funcionario", "Coordenador", "Familiar" }));
        jTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TiposUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TiposUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeslogar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataNascimento)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                        .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(jComboBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(textCpf))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orientacaoSexual, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TiposUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textEmail)
                                    .addComponent(textTelefone)
                                    .addComponent(textEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(textCRM, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(jComboBoxOrientacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(textNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascimento)
                    .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orientacaoSexual)
                    .addComponent(jComboBoxOrientacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiposUsuario)
                    .addComponent(jTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiposUsuario1)
                    .addComponent(textEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TiposUsuario2)
                    .addComponent(textCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnMenu)
                    .addComponent(btnDeslogar1))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Captura os dados preenchidos nos campos de texto e combo box
        String nomeCompleto = textNomeCompleto.getText();
        String cpf = textCpf.getText();
        String dataNascimento = textDataNascimento.getText();
        String genero = jComboBoxGenero.getSelectedItem().toString();
        String orientacaoSexual = jComboBoxOrientacao.getSelectedItem().toString();
        String email = textEmail.getText();
        String telefone = textTelefone.getText();
        String tipoUsuario = jTipoUsuario.getSelectedItem().toString();
        String especialidade = textEspecialidade.getText();
        String crm = textCRM.getText();

        // Converte a data para o formato correto 
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dataNascimentoFormatada;
        try {
            java.util.Date data = inputFormat.parse(dataNascimento);
            dataNascimentoFormatada = outputFormat.format(data);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato DD/MM/YYYY.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Gerar senha padrão e definir para alterar na primeira vez que o usuário logar
        String senhaPadrao = "Senha123";
        boolean alterarSenha = true;

        // Cria uma instância de Usuario e define os valores
        Usuario usuario = new Usuario();
        usuario.setNome(nomeCompleto);
        usuario.setCpf(cpf);
        usuario.setDataNascimento(Date.valueOf(dataNascimentoFormatada));
        usuario.setGenero(genero);
        usuario.setOrientacaoSexual(orientacaoSexual);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);
        usuario.setSenha(senhaPadrao);
        usuario.setAlterarSenha(alterarSenha);
        usuario.setTipoUsuario(tipoUsuario);
        usuario.setEspecialidade(especialidade);
        usuario.setCrm(crm);

        // Salva o usuário no banco de dados através do UsuarioDAO
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.salvarUsuario(usuario);
            JOptionPane.showMessageDialog(this, tipoUsuario + " " + nomeCompleto + " cadastrado com sucesso!");
            limparCampos(); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void textNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeCompletoActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        textTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c) && c != '\b') {
                    evt.consume();
                }
            }
        });

    }//GEN-LAST:event_textTelefoneActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnDeslogar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogar1ActionPerformed
        JOptionPane.showMessageDialog(this, "Sessão encerrada. Até logo!");
        System.exit(0);
    }//GEN-LAST:event_btnDeslogar1ActionPerformed

    private void textEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEspecialidadeActionPerformed

    private void textCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCRMActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void jComboBoxOrientacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrientacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOrientacaoActionPerformed

    private void jTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTipoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel TiposUsuario;
    private javax.swing.JLabel TiposUsuario1;
    private javax.swing.JLabel TiposUsuario2;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeslogar1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel dataNascimento;
    private javax.swing.JLabel genero;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxOrientacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jTipoUsuario;
    private javax.swing.JLabel orientacaoSexual;
    private javax.swing.JTextField textCRM;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEspecialidade;
    private javax.swing.JTextField textNomeCompleto;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}

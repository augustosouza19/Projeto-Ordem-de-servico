package A_GUI;

// CLASSE
import B_CONEXAO_MYSQL.CONEXAO;

// ESTILO DO JAVA
import java.awt.Color;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import java.awt.EventQueue;

// CONEXÕES
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

// EXCEÇÕES
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.HeadlessException;

// CLASSES SWING
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class B_TELA_LOGIN extends javax.swing.JFrame 
{
    // ATRIBUTOS
    int cont;
    
    // VARÍAVEIS ESPECIAIS DE CONEXÃO AO BANCO DE DADOS
    // CONEXÃO
    Connection conexao = null;
    
    // EXECUTA AS INSTRUÇÕES SQL 
    PreparedStatement pst = null; 
    
    // EXIBE O RESULTADO DAS INSTRUÇÕES SQL
    ResultSet rs = null; 
    
    public B_TELA_LOGIN() 
    {
        initComponents();  
        
        // MÉTODO CONECTOR
        conexao = CONEXAO.conector();
        
        // APOIO A CONEXÃO
        //System.out.println( conexao );
        
        //  ESTRUTURA DE DECISÃO - CONEXÃO SENDO VERDADEIRA
        if ( conexao != null )
        {
            // COMANDO PARA TROCAR O ÍCONE QUANDO CONECTADO COM SUCESSO
            lblStatus.setIcon( new javax.swing.ImageIcon ( getClass().getResource("/C_ICONES/database_go.png") ) );
        }
        
        //  ESTRUTURA DE DECISÃO - CONEXÃO SENDO FALSA
        else
        {
            // COMANDO PARA TROCAR O ÍCONE QUANDO CONECTADO COM SUCESSO
            lblStatus.setIcon( new javax.swing.ImageIcon ( getClass().getResource("/C_ICONES/database_error.png") ) );
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        txtSen = new javax.swing.JPasswordField();
        btnLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Acesso");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("USUÁRIO :");

        jLabel2.setText("SENHA :");

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/database_connect.png"))); // NOI18N

        txtUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLog.setText("LOGIN");
        btnLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsu)
                            .addComponent(txtSen, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(401, 208));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        //////////////////// MÉTODO INICIAR O LOGIN ////////////////////////////
        
        // ATRIBUTOS
        String sql;
        String perfil;

        // SELECIONE DO BANCO DE DADOS TUDO DA TABELA USUÁRIO ONDE O LOGIN = ? E SENHA = ?
        sql = " select * from tbusuario where login = ? and senha = ? ";

        try 
        {
            // CONECTANDO AO BANCO DE DADOS
            pst = conexao.prepareStatement( sql );
            
            // ANALISAR NO BANCO DE DADOS OS CAMPOS DE USUÁRIO E SENHA 
            pst.setString( 1, txtUsu.getText() );
            pst.setString( 2, String.valueOf( txtSen.getPassword() ) );

            // EXECUTAR A QUERY
            rs = pst.executeQuery();

            // ESTRUTURA DE DECISÃO - SE EXISTIR USUÁRIO E SENHA CORRESPONDENTE
            if ( rs.next() ) 
            {
                // OBTÉM O CONTEÚDO DO CAMPO DO "PERFIL" DA TABELA TBUSUARIO; 
                perfil = rs.getString( 6 );
                System.out.println( perfil );
                
                // ESTRUTURA DE DECISÃO - ANALISANDO O "PERFIL" DO USUÁRIO
                if( perfil.equals( "admin" ) )
                {
                    // TELA DE LOGIN AUTOMATICAMENTE FECHA
                    this.dispose();

                    // TELA PRINCIPAL ABRE
                    C_TELA_PRINCIPAL principal = new C_TELA_PRINCIPAL(); 
                    principal.setVisible( true );
                    
                    // MENREL, MENCADUSU, LBLUSU, SÃO VARIÁVEIS PÚBLICAS E ESTÁTICAS

                    // LIBERANDO CAMPOS MENREL E MENCADUSU
                    C_TELA_PRINCIPAL.MenRel.setEnabled( true );
                    C_TELA_PRINCIPAL.MenCadUsu.setEnabled( true );
                    
                    // COLOCANDO NA LBLUSU O ESCRITO NO BANCO DE DADOS CORRESPONDENTE AO CAMPO 2 E MUDAR A COR PARA VERMELHO
                    C_TELA_PRINCIPAL.lblUsu.setText( rs.getString( 2 ) );
                    C_TELA_PRINCIPAL.lblUsu.setForeground( Color.RED );
                }
                
                // ESTRUTURA DE DECISÃO - SE O USUÁRIO NÃO FOR ADMINISTRADOR
                else
                {
                    // TELA DE LOGIN AUTOMATICAMENTE FECHA
                    this.dispose();
                    
                    // TELA PRINCIPAL ABRE  
                    C_TELA_PRINCIPAL principal = new C_TELA_PRINCIPAL();  
                    principal.setVisible( true );
                    
                    // LBLUSU, LBLUSU SÃO VARIÁVEIS PÚBLICAS E ESTÁTICAS

                    // COLOCANDO NA LBLUSU O ESCRITO NO BANCO DE DADOS CORRESPONDENTE AO CAMPO 2 E MUDAR A COR PARA AZUL
                    C_TELA_PRINCIPAL.lblUsu.setText( rs.getString( 2 ) );
                    C_TELA_PRINCIPAL.lblUsu.setForeground( Color.BLUE );
                }
            }

            // ESTRUTURA DE DECISÃO - SE NÃO EXISTIR USUÁRIO E SENHA CORRESPONDENTE AO BANCO DE DADOS
            else
            {
                JOptionPane.showMessageDialog( null, " ACESSO NEGADO ", " ERRO DE ACESSO ", JOptionPane.ERROR_MESSAGE );
                cont ++;
            }
            
            // ESTRUTURA DE DECISÃO - SE O CONTADOR MAIOR QUE 3, ENTÃO O ACESSO SERÁ BLOQUEADO, A TELA LOGIN FECHA
            if ( cont > 3 )
            {
                JOptionPane.showMessageDialog( null," ACESSO BLOQUEADO ", " ERRO DE ACESSO ", JOptionPane.WARNING_MESSAGE );
                System.exit(0);
            }
            
            // ESTRUTURA DE DECISÃO - SE O CONTADOR FOR MENOR QUE 3, ENTÃO O ACESSO SERÁ BLOQUEADO, A TELA LOGIN FECHA
            else
            {
                
            }
        }
                
        catch ( SQLException | HeadlessException e ) 
        {
            // APOIO AO ERRO
            System.err.println( e );
        }
    }//GEN-LAST:event_btnLogActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        /////////////////// MÉTODO DE ESTILO ///////////////////////////////////
                
        // MUDAR DE ESTILO DA TELA DE LOGIN
        try 
        {
            PlasticLookAndFeel.setPlasticTheme( new SkyBlue () );
            
            try
            {
                // MUDANÇA DE ESTILO
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            }
            
            catch ( InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex )
            {
                // APOIO AO ERRO
                Logger.getLogger( C_TELA_PRINCIPAL.class.getName() ).log( Level.SEVERE, null, ex );
            }
        }
        
        catch ( ClassNotFoundException e )
        {
            // APOIO AO ERRO
            System.out.println( e );            
        }
                
        SwingUtilities.updateComponentTreeUI( this );
    }//GEN-LAST:event_formWindowOpened
    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) 
            {
                if ("Nimbus".equals(info.getName() ) )
                {
                    UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        }
        
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e ) 
        {
            Logger.getLogger( B_TELA_LOGIN.class.getName() ).log( java.util.logging.Level.SEVERE, null, e );
        }
        
        EventQueue.invokeLater( () ->
        {
            new B_TELA_LOGIN().setVisible( true );
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSen;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
package A_GUI;

// CLASSE
import B_CONEXAO_MYSQL.CONEXAO;

// EXCEÇÃO
import java.sql.SQLException;
import java.awt.HeadlessException;

// CONEXÃO
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

// SWING
import javax.swing.JOptionPane;

// TABELA DINÂMICA
import net.proteanit.sql.DbUtils;

public class D_TELA_USUARIO extends javax.swing.JInternalFrame
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
       
    public D_TELA_USUARIO()
    {
        initComponents();
 
        // CONEXÃO ABERTA 
        conexao = CONEXAO.conector();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnUsuIns = new javax.swing.JButton();
        btnUsuCon = new javax.swing.JButton();
        btnUsuAlt = new javax.swing.JButton();
        btnUsuExc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();
        txtUsuNom = new javax.swing.JTextField();
        txtUsuLog = new javax.swing.JTextField();
        txtUsuSen = new javax.swing.JPasswordField();
        txtUsuFon = new javax.swing.JFormattedTextField();
        cboUsuPer = new javax.swing.JComboBox<>();
        btnUsuLim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsuPesNom = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("USUÁRIO");
        setEnabled(false);
        setFocusTraversalPolicyProvider(true);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnUsuIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_add.png"))); // NOI18N
        btnUsuIns.setToolTipText("Inserir Usuário");
        btnUsuIns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuIns.setFocusable(false);
        btnUsuIns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuIns.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuInsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsuIns);

        btnUsuCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/magnifier.png"))); // NOI18N
        btnUsuCon.setToolTipText("Consultar Usuários");
        btnUsuCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuCon.setFocusable(false);
        btnUsuCon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuCon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuConActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsuCon);

        btnUsuAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_edit.png"))); // NOI18N
        btnUsuAlt.setToolTipText("Alterar Usuário");
        btnUsuAlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuAlt.setFocusable(false);
        btnUsuAlt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuAlt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuAltActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsuAlt);

        btnUsuExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_delete.png"))); // NOI18N
        btnUsuExc.setToolTipText("Excluir Usuário");
        btnUsuExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuExc.setFocusable(false);
        btnUsuExc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuExc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuExcActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUsuExc);
        jToolBar1.add(jSeparator1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setText("* Campos Obrigatórios");

        jLabel2.setText("* ID :");

        jLabel3.setText("* NOME :");

        jLabel4.setText("* TELEFONE :");

        jLabel5.setText("* LOGIN :");

        jLabel6.setText("* SENHA :");

        jLabel7.setText("* PERFIL :");

        txtUsuId.setToolTipText("Digite id do usuário");
        txtUsuId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtUsuNom.setToolTipText("Digite nome do usuário");
        txtUsuNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtUsuLog.setToolTipText("Digite login do usuário");

        txtUsuSen.setToolTipText("Digite senha do usuário");

        try {
            txtUsuFon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUsuFon.setToolTipText("Digite telefone do usuário");

        cboUsuPer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "admin", "user" }));
        cboUsuPer.setToolTipText("Selecione o perfil do usuário");

        btnUsuLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/wiping-swipe-for-floors.png"))); // NOI18N
        btnUsuLim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuLimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboUsuPer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(419, 419, 419))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUsuLim, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuLog, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuSen, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuNom, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuFon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUsuFon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUsuLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUsuSen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboUsuPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addComponent(btnUsuLim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE", "LOGIN", "PERFIL"
            }
        ));
        tblUsu.setToolTipText("Tabela do usuário");
        tblUsu.setEnabled(false);
        jScrollPane1.setViewportView(tblUsu);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel8.setText("Nome");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/folder_explore.png"))); // NOI18N

        txtUsuPesNom.setToolTipText("Pesquise os registros do usuário pelo nome");
        txtUsuPesNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuPesNomKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuPesNom, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsuPesNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        setBounds(0, 0, 915, 650);
    }// </editor-fold>//GEN-END:initComponents
    private void btnUsuInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuInsActionPerformed
      
        ////////////////// MÉTODO PARA ADICIONAR USUÁRIO ///////////////////////
 
        // ATRIBUTOS
        String sql;
        int adicionado = 0;

        // INSERIR DENTRO A TABELA USUÁRIO NOS CAMPOS( IDUSER, USUARIO, FONE, LOGIN, SENHA, PERFIL ) OS VALORES ( ?, ?, ?, ?, ?, ? ) ;    
        sql = " insert into tbusuario( iduser, usuario, fone, login, senha, perfil ) values ( ?, ?, ?, ?, ?, ? ) ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );
            
            // ANALISAR NO BANCO DE DADOS OS CAMPOS IDUSER, USUARIO, FONE, LOGIN, SENHA E PERFIL 
            pst.setString( 1, txtUsuId.getText() );
            pst.setString( 2, txtUsuNom.getText() );
            pst.setString( 3, txtUsuFon.getText() );
            pst.setString( 4, txtUsuLog.getText() );
            pst.setString( 5, String.valueOf( txtUsuSen.getPassword() ) );
            pst.setString( 6, cboUsuPer.getSelectedItem().toString() );
            
            // ESTRUTURA DE DECISÃO - CAMPOS OBRIGATÓRIOS ( EXTRA: cboUsuPer.getSelectedIndex() == 0 , txtUsuSen.getPassword()).equals("") )
            if ( txtUsuId.getText().isEmpty() || txtUsuNom.getText().isEmpty() || txtUsuLog.getText().isEmpty() || String.valueOf( txtUsuSen.getPassword()).equals("") || cboUsuPer.getSelectedIndex() == 0 )
            {
                JOptionPane.showMessageDialog( null, " POR FAVOR, PREENCHA OS CAMPOS OBRIGATÓRIOS " );
            } 
            
            // ESTRUTURA DE DECISÃO - VALIDAÇÃO DOS CAMPOS
            else
            {
                // CONEXÃO PARA INSERIR NO BANCO DE DADOS
                adicionado = pst.executeUpdate();

                // SAÍDA DE VALOR 1;  
                System.out.println( adicionado );
            }
            
            // ESTRUTURA DE DECISÃO - LIMPEZA DOS CAMPOS
            if( adicionado > 0 )
            {
                // LIMPAR CAMPOS
                txtUsuId.setText("");
                txtUsuNom.setText("");
                txtUsuFon.setText("");
                txtUsuLog.setText("");
                txtUsuSen.setText("");
                cboUsuPer.setSelectedIndex( 0 );
                
                JOptionPane.showMessageDialog( null, " USUÁRIO CADASTRADO ", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE );
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " USUÁRIO NÃO CADASTRADO ", "MENSAGEM", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        catch ( SQLException | HeadlessException e )
        {
            // ERRO DE LOGIN
            JOptionPane.showMessageDialog(null, " CADASTRO JÁ UTILIZADO " + " \n " + " VERIFICAR LOGIN OU ID ");
            
            // APOIO AO ERRO
            System.err.println( e );
        }         
    }//GEN-LAST:event_btnUsuInsActionPerformed
    private void btnUsuConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuConActionPerformed

        /////////////////// MÉTODO PARA CONSULTAR USUÁRIO //////////////////////
        
        // ATRIBUTOS
        int id;
        String sql;

        id = Integer.parseInt( JOptionPane.showInputDialog( null, " DIGITE O ID DO USUÁRIO " ) );
         
        // SELECIONE TUDO DA TABELA TBUSUARIO ONDE O IDUSERS = ID
        sql = " select * from tbusuario where iduser = " + id ;

        try 
        {
            // PREPARANDO CONEXAO
            pst = conexao.prepareStatement( sql );

            // CONVERTE O ID DIGITADO DE UM VALOR INTEIRO PARA UMA STRING
            txtUsuId.setText( String.valueOf( id ) );
      
            // EXECUTAR A QUERY      
            rs = pst.executeQuery();
            
            // ESTRUTURA DE DECISÃO - CASO SIM              
            if ( rs.next() )
            {
                // PEGAR NO BANCO DE DADOS DA TABELA USUÁRIO OS CAMPOS 2,3,4,5,6 E COLOCAR NA VARIÁVEL RS
                txtUsuNom.setText( rs.getString( 2 ) );
                txtUsuFon.setText( rs.getString( 3 ) );
                txtUsuLog.setText( rs.getString( 4 ) );
                txtUsuSen.setText( rs.getString( 5 ) );
                cboUsuPer.setSelectedItem( rs.getString( 6 ) );
            }
            
            // ESTRUTURA DE DECISÃO -  CASO NÃO
            else
            {
                // LIMPAR CAMPOS
                txtUsuNom.setText("");
                txtUsuFon.setText("");
                txtUsuLog.setText("");
                txtUsuSen.setText("");
                cboUsuPer.setSelectedIndex(0);

                // CAIXA DE TEXTO COM ERRO
                JOptionPane.showMessageDialog( null, " USUÁRIO NÃO CADASTRADO " , " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        catch ( SQLException | HeadlessException e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        } 
    }//GEN-LAST:event_btnUsuConActionPerformed
    private void btnUsuAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuAltActionPerformed
        
        ///////////////////////// MÉTODO EDITAR ////////////////////////////////
        
        // ATRIBUTOS
        String sql;
        int adicionado = 0;

        // ATUALIZAR A TABELA TBUSUARIO COLOCANDO USUARIO, FONE, LOGIN, SENHA, PERFIL ONDE O IDUSER = ?
        sql = " update tbusuario set usuario = ?, fone = ?, login = ?, senha = ?, perfil = ? where iduser = ? ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );
            
            // ANALISAR NO BANCO DE DADOS OS CAMPOS NOME DO USUARIO, FONE, LOGI, SENHA, PERFIL E IDUSERS 
            pst.setString( 1, txtUsuNom.getText() );
            pst.setString( 2, txtUsuFon.getText() );
            pst.setString( 3, txtUsuLog.getText() );
            pst.setString( 4, String.valueOf( txtUsuSen.getPassword() ) );
            pst.setString( 5, cboUsuPer.getSelectedItem().toString() );
            pst.setString( 6, txtUsuId.getText() );
            
            // ESTRUTURA DE DECISÃO - CAMPOS OBRIGATÓRIOS ( EXTRA: cboUsuPer.getSelectedIndex() == 0 , txtUsuSen.getPassword()).equals("") )
            if ( txtUsuNom.getText().isEmpty() || txtUsuLog.getText().isEmpty() || txtUsuSen.getPassword().equals("") || cboUsuPer.getSelectedIndex() == 0 || txtUsuId.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog( null, " POR FAVOR, PREENCHA OS CAMPOS OBRIGATÓRIOS " );
            }
            
            // ESTRUTURA DE DECISÃO - VALIDAÇÃO DOS CAMPOS
            else
            {
                // CONEXÃO PARA INSERIR NO BANCO DE DADOS
                adicionado = pst.executeUpdate();

                // SAÍDA DE VALOR 1;  
                System.out.println( adicionado );
            }
            
            // ESTRUTURA DE DECISÃO - LIMPEZA DOS CAMPOS
            if( adicionado > 0 )
            {
                // LIMPAR CAMPOS
                txtUsuId.setText("");
                txtUsuNom.setText("");
                txtUsuFon.setText("");
                txtUsuLog.setText("");
                txtUsuSen.setText("");
                cboUsuPer.setSelectedIndex( 0 );
                
                JOptionPane.showMessageDialog( null, " DADOS DO USUÁRIO ALTERADOS COM SUCESSO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " USUÁRIO NÃO ALTERADO ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }            
        }
        
        catch ( SQLException | HeadlessException e )
        {
            // APOIO A ERRO
            System.err.println( e );
        } 
    }//GEN-LAST:event_btnUsuAltActionPerformed
    private void btnUsuExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuExcActionPerformed

        /////////////////// MÉTODO EXCLUIR FUNCIONÁRIO /////////////////////////
        
        // ATRIBUTOS
        String sql;
        int decisao;
        int apagado = 0;

        // CAIXA DE DIÁLOGO
        decisao = JOptionPane.showConfirmDialog( null, " TEM CERTEZA QUE DESEJA REMOVER O USUÁRIO ? ", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO - CASO "SIM"
        if ( decisao == JOptionPane.YES_OPTION )
        {
            // MÉTODO EXCLUSÃO - DELETA DA TBUSUARIO ONDE O IDUSER = ?
            sql = " delete from tbusuario where iduser = ? ";
            
            try
            {
                // PREPARANDO CONEXÃO
                pst = conexao.prepareStatement(sql);
                
                // ANALISAR NO BANCO DE DADOS O CAMPO IDUSER
                pst.setString( 1, txtUsuId.getText() );
                
                // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS ( EXTRA: cboUsuPer.getSelectedIndex() == 0, txtUsuSen.getPassword()).equals("") )
                if ( txtUsuNom.getText().isEmpty() || txtUsuLog.getText().isEmpty() || txtUsuSen.getPassword().equals("") || cboUsuPer.getSelectedIndex() == 0 || txtUsuId.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog( null, " TODOS OS CAMPOS DEVEM ESTAR PREENCHIDOS PARA A EXCLUSÃO SER FEITA " );
                }
                
                // ESTRUTURA DE DECISÃO - VALIDAÇÃO DOS CAMPOS
                else
                {
                    // CONEXÃO PARA DELETAR NO BANCO DE DADOS
                    apagado = pst.executeUpdate();
                    
                    // SAÍDA DE VALOR 1; 
                    System.out.println( apagado );
                }
                     
                // ESTRUTURA DE DECISÃO - LIMPEZA DOS CAMPOS
                if( apagado > 0 )
                {
                    // LIMPAR CAMPOS  
                    txtUsuId.setText("");
                    txtUsuNom.setText("");
                    txtUsuFon.setText("");
                    txtUsuLog.setText("");
                    txtUsuSen.setText("");
                    cboUsuPer.setSelectedIndex( 0 );
                    
                    JOptionPane.showMessageDialog( null, " USUÁRIO REMOVIDO COM SUCESSO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
                } 
                
                // ESTRUTURA DE DECISÃO - CASO NÃO
                else
                {
                    JOptionPane.showMessageDialog( null, " USUÁRIO NÃO REMOVIDO ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
                }         
            }
            
            catch ( SQLException | HeadlessException e )
            {
                // APOIO AO ERRO
                System.err.println( e );
            }
        }
        
        else if ( decisao == JOptionPane.NO_OPTION )
        {
            JOptionPane.showMessageDialog( null, " ENTENDIDO " );
        }
    }//GEN-LAST:event_btnUsuExcActionPerformed
    private void txtUsuPesNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuPesNomKeyReleased
       
        //////////// MÉTODO EM TEMPO REAL DE PESQUISA PELO NOME ////////////////
        
        // ATRIBUTOS
        String sql;

        // SELECIONE IDUSER COMO ID, USUARIO COMO USUÁRIO, FONE COMO TELEFONE, LOGIN COMO LOGIN, PERFIL COMO PERFIL DA TBUUSÁRIO ONDE O USUARIO COMO ? ORDENADO PELO IDUSER
        sql = " select iduser as ID, usuario as USUÁRIO, fone as TELEFONE, login as LOGIN, perfil as PERFIL from tbusuario where usuario like ? order by iduser ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // ANALISAR NO BANCO DE DADOS O CAMPO NOME
            pst.setString( 1, txtUsuPesNom.getText() + "%" );
            
            // EXPOR OS RESULTADOS
            rs = pst.executeQuery();
            
            // TRAZENDO E COLOCANDO OS DADOS NA TABELA
            tblUsu.setModel( DbUtils.resultSetToTableModel( rs ) );
        }
        
        catch ( Exception e )
        {
            // APOIO AO ERRO
            System.err.println( e );            
        }
    }//GEN-LAST:event_txtUsuPesNomKeyReleased

    private void btnUsuLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuLimActionPerformed

        /////////////////////// MÉTODO DE LIMPAR CAMPOS ////////////////////////
        
        // ESTRUTURA DE DECISÃO - CAMPOS LIMPOS ( EXTRA : txtUsuSen.getPassword().equals(""), cboUsuPer.getSelectedIndex() == 0 )
        if ( txtUsuId.getText().isEmpty() && txtUsuNom.getText().isEmpty() && txtUsuFon.getText().isEmpty() && txtUsuLog.getText().isEmpty() && txtUsuSen.getPassword().equals("") && cboUsuPer.getSelectedIndex() == 0 && txtUsuPesNom.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog( null, " CAMPOS ENCONTRAM-SE LIMPOS " );
        }
        
        // ESTRUTURA DE DECISÃO - CAMPOS LIMPOS - CASO NÃO      
        else
        {
            // LIMPAR CAMPOS 
            txtUsuId.setText("");
            txtUsuNom.setText("");
            txtUsuFon.setText("");
            txtUsuLog.setText("");
            txtUsuSen.setText("");
            cboUsuPer.setSelectedIndex( 0 ); 
            txtUsuPesNom.setText("");
        }
    }//GEN-LAST:event_btnUsuLimActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuAlt;
    private javax.swing.JButton btnUsuCon;
    private javax.swing.JButton btnUsuExc;
    private javax.swing.JButton btnUsuIns;
    private javax.swing.JButton btnUsuLim;
    private javax.swing.JComboBox<String> cboUsuPer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblUsu;
    private javax.swing.JFormattedTextField txtUsuFon;
    private javax.swing.JTextField txtUsuId;
    private javax.swing.JTextField txtUsuLog;
    private javax.swing.JTextField txtUsuNom;
    private javax.swing.JTextField txtUsuPesNom;
    private javax.swing.JPasswordField txtUsuSen;
    // End of variables declaration//GEN-END:variables
}
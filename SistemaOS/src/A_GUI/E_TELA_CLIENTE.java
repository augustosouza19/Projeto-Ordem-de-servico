package A_GUI;

// CLASSE
import B_CONEXAO_MYSQL.CONEXAO;

// EXCEÇÕES
import java.sql.SQLException;
import java.awt.HeadlessException;

// CONEXÕES
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

// CLASSE SWING
import javax.swing.JOptionPane;

// TABELA DINÂMICA
import net.proteanit.sql.DbUtils;

public class E_TELA_CLIENTE extends javax.swing.JInternalFrame 
{
    // VARÍAVEIS ESPECIAIS DE CONEXÃO AO BANCO DE DADOS
    // CONEXÃO
    Connection conexao = null;
    
    // EXECUTA AS INSTRUÇÕES SQL 
    PreparedStatement pst = null; 
    
    // EXIBE O RESULTADO DAS INSTRUÇÕES SQL
    ResultSet rs = null; 
    
    public E_TELA_CLIENTE()
    {
        initComponents();
                 
        // CONEXÃO ABERTA 
        conexao = CONEXAO.conector();    
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCliPesId = new javax.swing.JTextField();
        txtCliPesNom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCliNom = new javax.swing.JTextField();
        txtCliEnd = new javax.swing.JTextField();
        txtCliEma = new javax.swing.JTextField();
        txtCliId = new javax.swing.JTextField();
        txtCliFon = new javax.swing.JFormattedTextField();
        btnCliLim = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnCliIns = new javax.swing.JButton();
        btnCliAlt = new javax.swing.JButton();
        btnCliExc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCli1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCli2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CLIENTE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/folder_explore.png"))); // NOI18N

        jLabel2.setText("Id :");

        jLabel3.setText("Nome :");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/folder_explore.png"))); // NOI18N

        txtCliPesId.setToolTipText("Pesquisar clientes pelo id");
        txtCliPesId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliPesIdKeyReleased(evt);
            }
        });

        txtCliPesNom.setToolTipText("Pesquisar clientes pelo nome");
        txtCliPesNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliPesNomKeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel5.setText("E-MAIL :");

        jLabel6.setText("* NOME :");

        jLabel7.setText("ENDEREÇO : ");

        jLabel8.setText("* TELEFONE :  ");

        jLabel9.setText("* Campos obrigatórios");

        jLabel10.setText("ID :");

        txtCliNom.setToolTipText("Digite o nome do cliente");

        txtCliEnd.setToolTipText("Digite o endereço do cliente");

        txtCliEma.setToolTipText("Digite o email do cliente");

        txtCliId.setToolTipText("Id do cliente");
        txtCliId.setEnabled(false);

        try {
            txtCliFon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCliFon.setToolTipText("Digite o telefone do cliente");
        txtCliFon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliFonActionPerformed(evt);
            }
        });

        btnCliLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/wiping-swipe-for-floors.png"))); // NOI18N
        btnCliLim.setToolTipText("Limpar campos");
        btnCliLim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliLimActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliFon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCliEma)
                                        .addGap(213, 213, 213)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCliLim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCliEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(txtCliNom, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliLim, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCliNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCliFon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCliEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnCliIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_add.png"))); // NOI18N
        btnCliIns.setToolTipText("Inserir Cliente");
        btnCliIns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliIns.setFocusable(false);
        btnCliIns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliIns.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliInsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCliIns);

        btnCliAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_edit.png"))); // NOI18N
        btnCliAlt.setToolTipText("Alterar Cliente");
        btnCliAlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliAlt.setFocusable(false);
        btnCliAlt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliAlt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliAltActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCliAlt);

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_delete.png"))); // NOI18N
        btnCliExc.setToolTipText("Excluir Cliente");
        btnCliExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliExc.setFocusable(false);
        btnCliExc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliExc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCliExc);
        jToolBar1.add(jSeparator1);

        tblCli1.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "NOME", "ENDEREÇO", "TELEFONE", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCli1.setToolTipText("Tabela de clientes 1");
        tblCli1.getTableHeader().setReorderingAllowed(false);
        tblCli1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCli1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCli1);

        tblCli2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "NOME"
            }
        ));
        tblCli2.setToolTipText("Tabela de clientes 2");
        jScrollPane2.setViewportView(tblCli2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliPesNom, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliPesId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliPesNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliPesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        setBounds(0, 0, 915, 650);
    }// </editor-fold>//GEN-END:initComponents
    private void btnCliInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliInsActionPerformed

        ////////////////////// MÉTODO PARA INSERIR CLIENTE /////////////////////
        
        // ATRIBUTOS
        String sql;
        int adicionado = 0;
        
        // INSERIR DENTRO DA TBLISNTES ( NOMECLI, ENDCLI, FONECLI, EMAILCLI ) OS VALORES ( ?, ?, ?, ? )
        sql = " insert into tbclientes( nomecli, endcli, fonecli, emailcli ) values ( ?, ?, ?, ? ) ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );
            
            // ANALISAR NO BANCO DE DADOS OS CAMPOS NOME, ENDEREÇO, TELEFONE, EMAIL 
            pst.setString( 1, txtCliNom.getText() );
            pst.setString( 2, txtCliEnd.getText() );
            pst.setString( 3, txtCliFon.getText() );
            pst.setString( 4, txtCliEma.getText() );
                
            // ESTRUTURA DE DECISÃO - CAMPOS OBRIGATÓRIOS
            if ( txtCliNom.getText().isEmpty() || txtCliFon.getText().isEmpty() )
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
                txtCliPesId.setText("");
                txtCliPesNom.setText("");
                txtCliId.setText("");
                txtCliNom.setText("");
                txtCliFon.setText("");
                txtCliEnd.setText("");
                txtCliEma.setText("");
               
                JOptionPane.showMessageDialog( null, " CLIENTE CADASTRADO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " CLIENTE NÃO CADASTRADO ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        catch ( SQLException | HeadlessException e )
        {            
            // APOIO AO ERRO
            System.err.println( e );
        }  
    }//GEN-LAST:event_btnCliInsActionPerformed
    private void txtCliPesNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliPesNomKeyReleased

        ///////////// MÉTODO PESQUISAR PELO NOME EM TEMPO REAL /////////////////
        
        // ATRIBUTOS
        String sql;

        // SELECIONE IDLCLI COMO ID, NOMECLI COMO NOME, ENDLI COMO ENDEREÇO, FONECLI COMO TELEFONE, EMAILCLI COMO EMAIL DA TBCLIENTES ONDE O NOMECLI COMO ? ORDENADO PELO IDCLI
        sql = " select idcli as ID, nomecli as NOME, endcli as ENDEREÇO, fonecli as TELEFONE, emailcli as EMAIL from tbclientes where nomecli like ? order by idcli ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement(sql);

            // ANALISAR NO BANCO DE DADOS O CAMPO NOME  
            pst.setString( 1, txtCliPesNom.getText() + "%");
           
            // CONEXÃO PARA PESQUISAR E INSERIR OS DADOS DO BANCO DE DADOS
            rs = pst.executeQuery();
           
            // TRAZENDO E COLOCANDO OS DADOS NA TABELA
            tblCli1.setModel( DbUtils.resultSetToTableModel( rs ) );
        }
        
        catch ( Exception e )
        {
            // APOIO AO ERRO
            System.err.println( e );            
        }         
    }//GEN-LAST:event_txtCliPesNomKeyReleased
    private void txtCliPesIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliPesIdKeyReleased
  
        ///////////// MÉTODO PESQUISAR PELO ID EM TEMPO REAL ///////////////////
        
        // ATRIBUTO
        String sql;

        // SELECIONE O NOMECLI COMO NOME DA TBCLIENTES ONDE IDCLI = ? ORDENADO PELO IDCLI
        sql = " select nomecli as NOME from tbclientes where idcli = ? order by idcli ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // ANALISAR NO BANCO DE DADOS O CAMPO IDCLI 
            pst.setString( 1, txtCliPesId.getText() );
            
            // CONEXÃO PARA PESQUISAR E INSERIR OS DADOS DO BANCO DE DADOS
            rs = pst.executeQuery();

            // TRAZENDO E COLOCANDO OS DADOS NA TABELA
            tblCli2.setModel( DbUtils.resultSetToTableModel( rs ) );
        }
        
        catch ( Exception e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        }
    }//GEN-LAST:event_txtCliPesIdKeyReleased
    private void tblCli1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCli1MouseClicked

        // EVENTO PARA SETAR NOS CAMPOS OS DADOS NA TABELA PELO CLIQUE DO MOUSE/
      
        // ATRIBUTOS
        int setar;
        
        // COLOCAR NAS CÉLULAS DA TABELA
        setar = tblCli1.getSelectedRow();
 
        // PEGANDO OS DADOS DA TABELA E COM UM CLIQUE COLOCANDO NO CAMPO DE TEXTO
        txtCliId.setText( tblCli1.getModel().getValueAt( setar, 0 ).toString() );
        txtCliNom.setText( tblCli1.getModel().getValueAt( setar, 1 ).toString() );
        txtCliEnd.setText( tblCli1.getModel().getValueAt( setar, 2 ).toString() );
        txtCliFon.setText( tblCli1.getModel().getValueAt( setar, 3 ).toString() );
        txtCliEma.setText( tblCli1.getModel().getValueAt( setar, 4 ).toString() );
        
        // INIBINDO O BOTÃO DE INSERIR CLIENTE
        btnCliIns.setEnabled( false );
    }//GEN-LAST:event_tblCli1MouseClicked
    private void btnCliAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliAltActionPerformed

        ///////////////////// MÉTODO PARA ALTERAR //////////////////////////////
        
        // ATRIBUTOS
        String sql;
        int adicionado = 0;
                       
        // ATUALIZANDO A TBCLIENTES COLOCANDO NOMECLI, FONECLI, ENDCLI, EMAILCLI ONDE IDCLI = ?
        sql = " update tbclientes set nomecli = ?, fonecli = ?, endcli = ?, emailcli = ? where idcli = ? ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );
            
            // ANALISAR NO BANCO DE DADOS OS CAMPOS NOME, FONE, ENDEREÇO, EMAIL, ID 
            pst.setString( 1, txtCliNom.getText() );
            pst.setString( 2, txtCliFon.getText() );
            pst.setString( 3, txtCliEnd.getText() );
            pst.setString( 4, txtCliEma.getText() );
            pst.setString( 5, txtCliId.getText() );
            
            // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS 
            if ( txtCliNom.getText().isEmpty() || txtCliFon.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog( null, " POR FAVOR, PREENCHA OS CAMPOS OBRIGATÓRIOS " );
            }
            
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
                txtCliPesId.setText("");
                txtCliPesNom.setText("");
                txtCliId.setText("");
                txtCliNom.setText("");
                txtCliFon.setText("");
                txtCliEnd.setText("");
                txtCliEma.setText("");
                
                JOptionPane.showMessageDialog( null, " DADOS DO USUÁRIO ALTERADOS COM SUCESSO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
                
                // REAPARECER O BOTÃO ADICIONAR
                btnCliIns.setEnabled( true );                
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " USUÁRIO NÃO ALTERADO ",  " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }            
        }
        
        catch ( SQLException | HeadlessException e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        }
    }//GEN-LAST:event_btnCliAltActionPerformed
    private void btnCliExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExcActionPerformed
      
        // MÉTODO PARA EXCLUIR
        int apagado = 0;
        int decisao;
        String sql;
        
        decisao = JOptionPane.showConfirmDialog( null, " TEM CERTEZA QUE DESEJA REMOVER O USUÁRIO ? ", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO - CASO SIM
        if ( decisao == JOptionPane.YES_OPTION )
        {
            // MÉTODO EXCLUSÃO - EXCLUIR USUÁRIO DA TABELA TBUSUARIO ONDE O IDUSER = ?
            sql = " delete from tbclientes where idcli = ? ";
            
            try
            {
                // PREPARANDO CONEXÃO
                pst = conexao.prepareStatement(sql);
                
                // ANALISAR NO BANCO DE DADOS O CAMPO ID 
                pst.setString( 1, txtCliId.getText() );
                
                // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS
                if ( txtCliNom.getText().isEmpty() || txtCliFon.getText().isEmpty() || txtCliEnd.getText().isEmpty() || txtCliEma.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog( null, " TODOS OS CAMPOS DEVEM ESTAR PREENCHIDOS PARA A EXCLUSÃO SER FEITA " );
                }
                
                else
                {
                    // EXECUTAR A QUERY
                    apagado = pst.executeUpdate();
                }
                
                // ESTRUTURA DE DECISÃO - LIMPEZA DOS CAMPOS
                if( apagado > 0 )
                {
                    // LIMPAR CAMPOS
                    txtCliPesId.setText("");
                    txtCliPesNom.setText("");
                    txtCliId.setText("");
                    txtCliNom.setText("");
                    txtCliFon.setText("");
                    txtCliEnd.setText("");
                    txtCliEma.setText("");
                
                    JOptionPane.showMessageDialog( null, " USUÁRIO REMOVIDO COM SUCESSO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
                } 

                // ESTRUTURA DE DECISÃO - CASO NÃO
                else
                {
                    JOptionPane.showMessageDialog( null, " USUÁRIO NÃO REMOVIDO COM SUCESSO ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
                }
            }
            
            catch ( SQLException | HeadlessException e )
            {
                // APOIO AO ERRO
                System.out.println( e );
            }
        }
        
        // ESTRUTURA DE DECISÃO - CASO NÃO
        else if ( decisao == JOptionPane.NO_OPTION )
        {
            JOptionPane.showMessageDialog( null, " ENTENDIDO " );
        }        
    }//GEN-LAST:event_btnCliExcActionPerformed
    private void btnCliLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliLimActionPerformed
       
        // ESTRUTURA DE DECISÃO - CAMPOS OBRIGATÓRIOS TODOS LIMPOS
        if ( txtCliId.getText().isEmpty() && txtCliNom.getText().isEmpty() && txtCliEnd.getText().isEmpty() && txtCliFon.getText().isEmpty() && txtCliEma.getText().isEmpty() && txtCliPesNom.getText().isEmpty() && txtCliPesId.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog( null, " CAMPOS ENCONTRAM-SE LIMPOS " );
        }
        
        // ESTRUTURA DE DECISÃO - CASO OS CAMPOS NÃO ESTEJAM LIMPOS
        else
        {
            // LIMPAR CAMPOS 
            txtCliId.setText("");
            txtCliNom.setText("");
            txtCliEnd.setText("");
            txtCliFon.setText("");
            txtCliEma.setText("");
            txtCliPesNom.setText("");
            txtCliPesId.setText("");
            
            // REAPARECER O BOTÃO DE INSERIR BOTÃO
            btnCliIns.setEnabled( true );
        }
    }//GEN-LAST:event_btnCliLimActionPerformed

    private void txtCliFonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliFonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliFonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliAlt;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JButton btnCliIns;
    private javax.swing.JButton btnCliLim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblCli1;
    private javax.swing.JTable tblCli2;
    private javax.swing.JTextField txtCliEma;
    private javax.swing.JTextField txtCliEnd;
    private javax.swing.JFormattedTextField txtCliFon;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliNom;
    private javax.swing.JTextField txtCliPesId;
    private javax.swing.JTextField txtCliPesNom;
    // End of variables declaration//GEN-END:variables
}
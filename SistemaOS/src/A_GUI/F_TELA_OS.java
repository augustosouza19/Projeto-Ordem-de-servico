package A_GUI;

// CLASSE
import B_CONEXAO_MYSQL.CONEXAO;

// CONEXÃO
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

// EXCEÇÃO
import java.sql.SQLException;
import java.awt.HeadlessException;

// TABELA DINÂMICA
import net.proteanit.sql.DbUtils;

// CLASSE SWING
import javax.swing.JOptionPane;

// CLASSE UTIL
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;

// CLASSE JASPER
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class F_TELA_OS extends javax.swing.JInternalFrame 
{
    // VARÍAVEIS ESPECIAIS DE CONEXÃO AO BANCO DE DADOS
    // CONEXÃO
    Connection conexao = null;
    
    // EXECUTA AS INSTRUÇÕES SQL 
    PreparedStatement pst = null; 
    
    // EXIBE O RESULTADO DAS INSTRUÇÕES SQL
    ResultSet rs = null; 

    // CONSTRUTOR
    public F_TELA_OS()
    {
        initComponents();
        
        // CONEXÃO ABERTA 
        conexao = CONEXAO.conector();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbtOsOrc = new javax.swing.JRadioButton();
        rbtOsOrd = new javax.swing.JRadioButton();
        txtOsNum = new javax.swing.JTextField();
        txtOsDat = new javax.swing.JTextField();
        cboOsSit = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOs1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOs2 = new javax.swing.JTable();
        txtOsPesNom = new javax.swing.JTextField();
        txtOsCliId = new javax.swing.JTextField();
        txtOsPesId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnOsIns = new javax.swing.JButton();
        btnOsCon = new javax.swing.JButton();
        btnOsAl = new javax.swing.JButton();
        btnOsExc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnOsImp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOsEqui = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOsSer = new javax.swing.JTextField();
        txtOsDef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOsTec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOsVal = new javax.swing.JTextField();
        btnOsLim = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ORDEM DE SERVIÇO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        jLabel6.setText("Nº OS : ");

        jLabel7.setText("DATA :");

        buttonGroup1.add(rbtOsOrc);
        rbtOsOrc.setText("ORÇAMENTO");

        buttonGroup1.add(rbtOsOrd);
        rbtOsOrd.setText("ORDEM DE SERVIÇO");

        txtOsNum.setEditable(false);
        txtOsNum.setBackground(new java.awt.Color(255, 255, 255));
        txtOsNum.setToolTipText("Número da OS");
        txtOsNum.setEnabled(false);

        txtOsDat.setEditable(false);
        txtOsDat.setBackground(new java.awt.Color(255, 255, 255));
        txtOsDat.setToolTipText("Data da OS");
        txtOsDat.setEnabled(false);

        cboOsSit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "ENTREGA OK", "ORCAMENTO REPROVADO", "AGUARDANDO APROVACAO", "AGUARDANDO PECAS", "ABANDONADO PELO CLIENTE", "NA BANCADA", "RETORNOU" }));
        cboOsSit.setToolTipText("Situação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboOsSit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtOsDat))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtOsNum))
                    .addComponent(rbtOsOrc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtOsOrd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOsNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbtOsOrc)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOsDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbtOsOrd)
                .addGap(18, 18, 18)
                .addComponent(cboOsSit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel8.setText("Nome");

        jLabel9.setText("* Id");

        jLabel10.setText("Id");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/folder_explore.png"))); // NOI18N

        tblOs1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE"
            }
        ));
        tblOs1.setToolTipText("Tabela do cliente 1");
        tblOs1.getTableHeader().setReorderingAllowed(false);
        tblOs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOs1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOs1);

        tblOs2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOME", "OS"
            }
        ));
        tblOs2.setToolTipText("Tabela do cliente 2");
        tblOs2.setEnabled(false);
        tblOs2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblOs2);

        txtOsPesNom.setToolTipText("Pesquisar pelo nome do cliente");
        txtOsPesNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtOsPesNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOsPesNomActionPerformed(evt);
            }
        });
        txtOsPesNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOsPesNomKeyReleased(evt);
            }
        });

        txtOsCliId.setEditable(false);
        txtOsCliId.setBackground(new java.awt.Color(255, 255, 255));
        txtOsCliId.setToolTipText("ID do cliente");
        txtOsCliId.setEnabled(false);
        txtOsCliId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOsCliIdActionPerformed(evt);
            }
        });

        txtOsPesId.setToolTipText("Pesquisar pelo id do cliente");
        txtOsPesId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtOsPesId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOsPesIdActionPerformed(evt);
            }
        });
        txtOsPesId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOsPesIdKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/folder_explore.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOsPesNom, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtOsCliId))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(txtOsPesId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtOsPesNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtOsCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOsPesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btnOsIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_add.png"))); // NOI18N
        btnOsIns.setToolTipText("Inserir OS");
        btnOsIns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOsIns.setFocusable(false);
        btnOsIns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOsIns.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOsIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsInsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOsIns);

        btnOsCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/magnifier.png"))); // NOI18N
        btnOsCon.setFocusable(false);
        btnOsCon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOsCon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOsCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsConActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOsCon);

        btnOsAl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_edit.png"))); // NOI18N
        btnOsAl.setToolTipText("Alterar OS");
        btnOsAl.setFocusable(false);
        btnOsAl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOsAl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOsAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsAlActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOsAl);

        btnOsExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/group_delete.png"))); // NOI18N
        btnOsExc.setToolTipText("Excluir OS");
        btnOsExc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOsExc.setFocusable(false);
        btnOsExc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOsExc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOsExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsExcActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOsExc);
        jToolBar1.add(jSeparator1);

        btnOsImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/Impressora.png"))); // NOI18N
        btnOsImp.setToolTipText("Imprimir relatório");
        btnOsImp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOsImp.setFocusable(false);
        btnOsImp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOsImp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOsImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsImpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOsImp);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel1.setText("* EQUIPAMENTO :");

        jLabel2.setText("* DEFEITO :");

        txtOsEqui.setToolTipText("Digite o equipamento do cliente");

        jLabel3.setText("SERVIÇO :");

        txtOsSer.setToolTipText("Digite o serviço");

        txtOsDef.setToolTipText("Digite o defeito do equipamento do cliente");

        jLabel4.setText("TÉCNICO :");

        txtOsTec.setToolTipText("Digite o nome do(s) técnico(s)");

        jLabel5.setText("TOTAL  ( R$ ) :");

        txtOsVal.setText("0");
        txtOsVal.setToolTipText("Digite o valor do serviço");

        btnOsLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/wiping-swipe-for-floors.png"))); // NOI18N
        btnOsLim.setToolTipText("Limpar campos");
        btnOsLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsLimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOsLim, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtOsEqui, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtOsSer))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOsDef))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOsVal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOsTec))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOsLim, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtOsEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtOsDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOsSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtOsTec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtOsVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setBounds(0, 0, 915, 650);
    }// </editor-fold>//GEN-END:initComponents
    private void txtOsPesNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOsPesNomKeyReleased
      
        /////////// MÉTODO DE PESQUISAR PELO NOME EM TEMPO REAL ////////////////
        
        // ATRIBUTOS
        String sql;

        // SELECIONE IDLCI COMO ID, NOMECLI COMO NOME, FONECLI COMO TELEFONE DA TBCLIENTES ONDE NOMECLI COMO ? ORDENADO PELO IDCLI
        sql = " select idcli as ID, nomecli as NOME, fonecli as TELEFONE from tbclientes where nomecli like ? order by idcli ";
        
        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // ANALISANDO NO BANCO DE DADOS O CAMPO NOME
            pst.setString( 1, txtOsPesNom.getText() + "%");
           
            // CONEXÃO PARA PESQUISAR E INSERIR OS DADOS DO BANCO DE DADOS
            rs = pst.executeQuery();
            
            // TRAZENDO E COLOCANDO OS DADOS NA TABELA
            tblOs1.setModel( DbUtils.resultSetToTableModel( rs ) );
        }
        
        catch ( Exception e )
        {
            System.out.println( e );            
        }    
    }//GEN-LAST:event_txtOsPesNomKeyReleased
    private void tblOs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOs1MouseClicked
       
        // EVENTO PARA SETAR NOS CAMPOS OS DADOS NA TABELA PELO CLIQUE DO MOUSE/
       
        // ATRIBUTOS
        int setar;
        
        // COLOCAR NAS CÉLULA DA TABELA
        setar = tblOs1.getSelectedRow();
 
        // PEGANDO OS DADOS DA TABELA E COM UM CLIQUE COLOCANDO NO CAMPO DE TEXTO - CAMPO 0 = ID
        txtOsCliId.setText( tblOs1.getModel().getValueAt( setar, 0 ).toString() );        
    }//GEN-LAST:event_tblOs1MouseClicked
    private void btnOsInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsInsActionPerformed

        //////////////////////// MÉTODO PARA INSERIR OS ////////////////////////
        
        // ATRIBUTOS 
        String sql;
        int adicionado = 0;

        // INSERIR DENTRO DA TBOS ( TIPO, SUTAÇÃO, EQUIPAMENTO, DEFEITO, SERVIÇO, TÉCNICO, VALOR, IDCLI ) VALORES ( ?, ?, ?, ?, ?, ?, ?, ? )
        sql = " insert into tbos( tipo, situacao, equipamento, defeito, servico, tecnico, valor, idcli ) values ( ?, ?, ?, ?, ?, ?, ?, ? ) ";

        try
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // ESTRUTURA DE DECISÃO DOS RADIO BUTTON - ANALISANDO JUNTO AO BANCO DE DADOS
            if( rbtOsOrc.isSelected() )
            {
                pst.setString( 1, rbtOsOrc.getText() );
            }

            else if ( rbtOsOrd.isSelected() )
            {
                pst.setString( 1, rbtOsOrd.getText() );
            }

            else
            {
                JOptionPane.showMessageDialog( null, " POR GENTILEZA, SELECIONE ORDEM DE SERVIÇO " + " \n " + "\t                      OU " + " \n " + " ORDEM DE PAGAMENTO ");
            }

            // ANALISANDO NO BANCO DE DADOS OS CAMPOS SITUAÇÃO, EQUIPAMENTO, DEFEITO, SERVIÇO, TÉCNICO, VALOR, ID DO CLIENTE           
            pst.setString( 2, cboOsSit.getSelectedItem().toString() );
            pst.setString( 3, txtOsEqui.getText() );
            pst.setString( 4, txtOsDef.getText() );
            pst.setString( 5, txtOsSer.getText() );
            pst.setString( 6, txtOsTec.getText() );
            pst.setString( 7, txtOsVal.getText().replace( "," , "." ) ); // REPLACE SUBSTITUI A VÍRGULA PELO PONTO
            pst.setString( 8, txtOsCliId.getText() );

            // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS
            if ( cboOsSit.getSelectedIndex() == 0 ||  txtOsEqui.getText().isEmpty() || txtOsDef.getText().isEmpty() || txtOsCliId.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog( null, " POR FAVOR, VERIFIQUE OS CAMPOS OBRIGATÓRIOS " );
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
            if ( adicionado > 0 )
            {
                // LIMPAR CAMPOS
                txtOsNum.setText("");
                txtOsDat.setText("");  
                cboOsSit.setSelectedIndex(0);
                txtOsPesNom.setText("");
                txtOsPesId.setText("");
                txtOsCliId.setText("");
                txtOsEqui.setText("");        
                txtOsDef.setText("");
                txtOsSer.setText("");
                txtOsTec.setText("");
                txtOsVal.setText("");
                              
                JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO EMITIDA ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO NÃO EMITIDA ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }
        }

        catch ( SQLException e )
        {
            System.out.println( e );
        }
    }//GEN-LAST:event_btnOsInsActionPerformed
    private void btnOsAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsAlActionPerformed

        ///////////////////// MÉTODO DE ALTERAR OS /////////////////////////////

        // MÉTODO PARA ALTERAR OS
        String sql;
        int adicionado = 0;

        // ALTERAR DADOS NA TABELA TBOS COLOCANDO TIPO, SITUACAO, EQUIPAMENTO, DEFEITO, SERVICO, TECNICO, VALOR ONDE OS = ?
        sql = " update tbos set tipo = ? , situacao = ?, equipamento = ? , defeito = ? , servico = ?, tecnico = ?, valor = ? where os = ? ";

        try
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // ESTRUTURA DE DECISÃO DOS RADIO BUTTON
            if( rbtOsOrc.isSelected() )
            {
                pst.setString( 1, rbtOsOrc.getText() );
            }

            else if ( rbtOsOrd.isSelected() )
            {
                pst.setString( 1, rbtOsOrd.getText() );
            }

            else
            {
                JOptionPane.showMessageDialog( null, " POR GENTILEZA, SELECIONE ORDEM DE SERVIÇO " + " \n " + "\t                      OU " + " \n " + " ORDEM DE PAGAMENTO ");
            }

            // ANALISANDO NO BANCO DE DADOS OS CAMPOS SITUAÇÃO, EQUIPAMENTO, DEFEITO, SERVIÇO, TÉCNICO, VALOR, NÚMERO DA OS E COLOCANDO NO BANCO DE DADOS
            pst.setString( 2, cboOsSit.getSelectedItem().toString() );
            pst.setString( 3, txtOsEqui.getText() );
            pst.setString( 4, txtOsDef.getText() );
            pst.setString( 5, txtOsSer.getText() );
            pst.setString( 6, txtOsTec.getText() );
            pst.setString( 7, txtOsVal.getText().replace( "," , "." ) ); // REPLACE SUBSTITUI A VÍRGULA PELO PONTO
            pst.setString( 8, txtOsNum.getText() );

            // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS
            if ( cboOsSit.getSelectedIndex() == 0 || txtOsEqui.getText().isEmpty() || txtOsDef.getText().isEmpty() || txtOsCliId.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog( null, " POR FAVOR, VERIFIQUE OS CAMPOS OBRIGATÓRIOS " );
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
            if ( adicionado > 0 )
            {
                // LIMPAR CAMPOS
                txtOsNum.setText("");
                txtOsDat.setText("");  
                cboOsSit.setSelectedIndex(0);
                txtOsPesNom.setText("");
                txtOsPesId.setText("");
                txtOsCliId.setText("");
                txtOsEqui.setText("");        
                txtOsDef.setText("");
                txtOsSer.setText("");
                txtOsTec.setText("");
                txtOsVal.setText("0");
                
                //EVITANDO PROBLEMAS - ATIVANDO BOTÕES, CAMPOS E TABELAS
                btnOsIns.setEnabled( true );
                txtOsPesId.setEnabled( true );
                txtOsPesNom.setEnabled(true);
                tblOs1.setEnabled( true );
                
                JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO ALTERADA ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO
            else
            {
                JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO NÃO ALTERADA ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
            }
        }

        catch ( SQLException e )
        {
            // APOIO AO ERRO        
            System.out.println( e );
        }
    }//GEN-LAST:event_btnOsAlActionPerformed
    private void btnOsExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsExcActionPerformed

        ///////////////////// MÉTODO PARA EXCLUIR OS /////////////////////////////

        // ATRIBUTOS
        String sql;
        int apagado = 0;
        int decisao;
        
        decisao = JOptionPane.showConfirmDialog( null, " TEM CERTEZA QUE DESEJA REMOVER O USUÁRIO ? ", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO
        if ( decisao == JOptionPane.YES_OPTION )
        {
            // MÉTODO EXCLUSÃO - EXCLUIR USUÁRIO DA TABELA TBUSUARIO ONDE O IDUSER = ?
            sql = " delete from tbos where idcli = ? ";
            
            try
            {
                // PREPARANDO CONEXÃO
                pst = conexao.prepareStatement(sql);
                
                // PEGAR ID DO CLIENTE NOS CAMPOS DE TEXTO E COLOCAR BANCO DE DADOS
                pst.setString( 1, txtOsCliId.getText() );
                
                // VALIDAÇÃO DOS CAMPOS OBRIGATÓRIOS
                if ( txtOsNum.getText().isEmpty() || txtOsDat.getText().isEmpty() || cboOsSit.getSelectedIndex() == 0 || txtOsEqui.getText().isEmpty() || txtOsDef.getText().isEmpty() || txtOsCliId.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog( null, " TODOS OS CAMPOS DEVEM ESTAR PREENCHIDOS PARA A EXCLUSÃO SER FEITA " );
                }
                
                // ESTRUTURA DE DECISÃO - VALIDAÇÃO DOS CAMPOS
                else
                {
                    // CONEXÃO PARA INSERIR NO BANCO DE DADOS
                    apagado = pst.executeUpdate();
                    
                    // SAÍDA DE VALOR 1;
                    System.out.println( apagado );
                }

                // ESTRUTURA DE DECISÃO - LIMPEZA DOS CAMPOS
                if( apagado > 0 )
                {
                    // LIMPAR CAMPOS
                    txtOsNum.setText("");
                    txtOsDat.setText("");  
                    cboOsSit.setSelectedIndex(0);
                    txtOsPesNom.setText("");
                    txtOsPesId.setText("");
                    txtOsCliId.setText("");
                    txtOsEqui.setText("");        
                    txtOsDef.setText("");
                    txtOsSer.setText("");
                    txtOsTec.setText("");
                    txtOsVal.setText("");
                
                    JOptionPane.showMessageDialog( null, " OS REMOVIDO COM SUCESSO ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
                } 
                
                // ESTRUTURA DE DECISÃO - CASO NÃO
                else
                {
                    JOptionPane.showMessageDialog( null, " OS REMOVIDA COM SUCESSO ", " MENSAGEM ", JOptionPane.ERROR_MESSAGE );
                }
            }
            
            catch ( SQLException | HeadlessException e )
            {
                // APOIO AO ERRO
                System.out.println( e );
            }
        }
        
        else if ( decisao == JOptionPane.NO_OPTION )
        {
            JOptionPane.showMessageDialog( null, " ENTENDIDO " );
        }  
        
    }//GEN-LAST:event_btnOsExcActionPerformed
    private void btnOsConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsConActionPerformed

        ///////////// MÉTODO PARA PESQUISAR ORDEM DE SERVIÇO - OS //////////////
        
        // ATRIBUTOS
        String tipo;
        String sql;
        int num_os;

        // CAIXA DE ENTRADA
        num_os = Integer.parseInt( JOptionPane.showInputDialog( null, " NÚMERO DA OS : ") ) ;

        //sql = " select O.os, data_os, tipo, situacao, equipamento, defeito, servico, tecnico, valor, C.idcli, nomecli from tbos as O inner join tbclientes as C where os = " + num_os;
        
        // SELECIONE TUDO DA TBOS ONDE OS = ( DIGITADO NA CAIXA DE DIÁLOGO ) 
        sql = " select * from tbos where os = " + num_os  ;

        try
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // TRAZENDO AS INFORMAÇÕES DO BANCO DE DADOS
            rs = pst.executeQuery();

            if( rs.next() )
            {
                // TRAZENDO NÚMERO DA OS E DATA DO BANCO DE DADOS PARA O CAMPO DE TEXTO
                txtOsNum.setText( rs.getString( 1 ) );
                txtOsDat.setText( rs.getString( 2 ) );

                // VARÍAVEL TIPO RECEBE VALORES DO CAMPO 3 DO BANCO DE DADOS OS BOTÕES RADIO BUTTON
                tipo = rs.getString(3);

                if( tipo.equals( "ORÇAMENTO" ) )
                {
                    rbtOsOrc.setSelected( true );
                }

                else if ( tipo.equals( "ORDEM DE SERVIÇO" ) )
                {
                    rbtOsOrd.setSelected( true );
                }
                
                // EXPONDO RESULTADOS
                cboOsSit.setSelectedItem( rs.getString( 4 ) );
                txtOsEqui.setText( rs.getString( 5 ) );
                txtOsDef.setText( rs.getString( 6 ) );
                txtOsSer.setText( rs.getString( 7 ) );
                txtOsTec.setText( rs.getString( 8 ) );
                txtOsVal.setText( rs.getString( 9 ) );
                txtOsCliId.setText( rs.getString( 10 ) );

                //EVITANDO PROBLEMAS - DESATIVANDO BOTÕES, CAMPOS E TABELAS
                btnOsIns.setEnabled(false);
                txtOsPesId.setEnabled(false);
                txtOsPesNom.setEnabled(false);
                tblOs1.setEnabled(false);
            }
            
            // ESTRUTURA DE DECISÃO - CASO NÃO 
            else
            {
                JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO NÃO CADASTRADA ");
            }
        }
        
        catch( SQLException | NumberFormatException | ArrayIndexOutOfBoundsException e )
        {
            JOptionPane.showMessageDialog( null, " ORDEM DE SERVIÇO INVÁLIDA ");
            
            // APOIO AO ERRO
            System.err.println( e );
        }
    }//GEN-LAST:event_btnOsConActionPerformed
    private void txtOsPesIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOsPesIdKeyReleased

        ///////////// MÉTODO PARA PESQUISAR EM TEMPO REAL PELO NOME ////////////
        
        // ATRIBUTOS
        String sql;

        // SELECIONE NOMECLI COMO NOME, OS DA TABELA TBOS COMO "O" JUNTADO COM TBCLIENTES COMO "C" SENDO QUE ( IDCLI DA "O" = IDCLI DA "C" ) ONDE IDCLI DA "O" = ? ORDENADO PELO OS DA "O"
        // sql = " select C.idcli as ID, O.os as OS from tbclientes as C inner join tbos as O on ( O.idcli = C.idcli ) where C.nomecli like ? ";
        // sql = " select C.nomecli as NOME, O.os as OS from tbos as O inner join tbclientes as C on ( O.idcli = C.idcli ) where C.nomecli like ? order by os";
           sql = " select C.nomecli as NOME, O.os as OS from tbos as O inner join tbclientes as C on ( O.idcli = C.idcli ) where O.idcli = ? order by O.os ";

        try 
        {
            // PREPARANDO CONEXÃO
            pst = conexao.prepareStatement( sql );

            // PEGANDO O NÚMERO DA OS DO BANCO DE DADOS E COLOCANDO NOS CAMPOS
            //pst.setString( 1, txtOsPesId.getText() );
            pst.setString( 1, txtOsPesId.getText() );
            
            // CONEXÃO PARA PESQUISAR E INSERIR OS DADOS DO BANCO DE DADOS
            rs = pst.executeQuery();
            
            // TRAZENDO E COLOCANDO OS DADOS NA TABELA
            tblOs2.setModel( DbUtils.resultSetToTableModel( rs ) );
        }
        
        catch ( Exception e )
        {
            // APOIO AO ERRO
            System.out.println( e );            
        }  
    }//GEN-LAST:event_txtOsPesIdKeyReleased
    private void btnOsLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsLimActionPerformed

        /////////////////// MÉTODO DE LIMPAR CAMPOS ////////////////////////////
      
        // ESTRUTURA DE DECISÃO - CASO TODOS OS CAMPOS LIMPOS
        if ( txtOsNum.getText().isEmpty() && txtOsDat.getText().isEmpty() && cboOsSit.getSelectedIndex() == 0 && txtOsPesNom.getText().isEmpty() && txtOsPesId.getText().isEmpty() && txtOsCliId.getText().isEmpty() && txtOsEqui.getText().isEmpty() && txtOsDef.getText().isEmpty() && txtOsSer.getText().isEmpty() && txtOsTec.getText().isEmpty() && btnOsIns.isEnabled() && txtOsPesId.isEnabled() && tblOs1.isEnabled() )
        {
            JOptionPane.showMessageDialog( null, " CAMPOS ENCONTRAM-SE LIMPOS " );
        }
        
        // ESTRUTURA DE DECISÃO - CASO NÃO
        else
        {
            // LIMPAR CAMPOS
            txtOsNum.setText("");
            txtOsDat.setText("");  
            cboOsSit.setSelectedIndex(0);
            txtOsPesNom.setText("");
            txtOsPesId.setText("");
            txtOsCliId.setText("");
            txtOsEqui.setText("");        
            txtOsDef.setText("");
            txtOsSer.setText("");
            txtOsTec.setText("");
            txtOsVal.setText("0");
            
            //EVITANDO PROBLEMAS - ATIVANDO BOTÕES, CAMPOS E TABELAS
            btnOsIns.setEnabled( true );
            txtOsPesId.setEnabled( true );
            txtOsPesNom.setEnabled(true);
            tblOs1.setEnabled( true );           
        }
    }//GEN-LAST:event_btnOsLimActionPerformed
    private void btnOsImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsImpActionPerformed
        

        // GERANDO UM RELATÓRIO DE CLIENTES
        int confirma;
        
        confirma = JOptionPane.showConfirmDialog( null, " CONFIRMA A IMPRESSÃO DA ORDEM DE SERVIÇO ?", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // IMPRIMINDO RELATÓRIO COM JASPER REPORTS
        if ( confirma == JOptionPane.YES_OPTION )
        {
            try 
            {
                // CLASSE HASHMAP PARA CRIAR UM FILTRO
                HashMap filtro = new HashMap();
                filtro.put("os", Integer.parseInt(txtOsNum.getText() ) );                
                
                // CLASSE JASPER PRINT PARA PREPARAR A IMPRESSÃO DE UM RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:\\relatorios\\RELATORIO_OS.jasper ", filtro, conexao );
              
                //EXIBIÇÃO DE RELATÓRIO
                JasperViewer.viewReport( print, false );
            }
            
            catch ( NumberFormatException | JRException e ) 
            {
                System.out.println( e );                
            }  
        }
    }//GEN-LAST:event_btnOsImpActionPerformed

    private void txtOsPesIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOsPesIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOsPesIdActionPerformed

    private void txtOsPesNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOsPesNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOsPesNomActionPerformed

    private void txtOsCliIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOsCliIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOsCliIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOsAl;
    private javax.swing.JButton btnOsCon;
    private javax.swing.JButton btnOsExc;
    private javax.swing.JButton btnOsImp;
    private javax.swing.JButton btnOsIns;
    private javax.swing.JButton btnOsLim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboOsSit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rbtOsOrc;
    private javax.swing.JRadioButton rbtOsOrd;
    private javax.swing.JTable tblOs1;
    private javax.swing.JTable tblOs2;
    private javax.swing.JTextField txtOsCliId;
    private javax.swing.JTextField txtOsDat;
    private javax.swing.JTextField txtOsDef;
    private javax.swing.JTextField txtOsEqui;
    private javax.swing.JTextField txtOsNum;
    private javax.swing.JTextField txtOsPesId;
    private javax.swing.JTextField txtOsPesNom;
    private javax.swing.JTextField txtOsSer;
    private javax.swing.JTextField txtOsTec;
    private javax.swing.JTextField txtOsVal;
    // End of variables declaration//GEN-END:variables
}
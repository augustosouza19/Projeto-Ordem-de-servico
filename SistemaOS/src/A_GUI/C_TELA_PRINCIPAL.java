package A_GUI;

// CLASSE
import B_CONEXAO_MYSQL.CONEXAO;

// CONEXÃO
import java.sql.Connection;

// DATAS
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// IMPORTAÇÃO JGOODIES - ESTILO DO JAVA
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.SkyBlue;

// LINKS
import java.net.URI;

// TRATAMENTO DE EXCEÇÕES
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URISyntaxException;
import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import javax.swing.UnsupportedLookAndFeelException;

// POCOTE SWING
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

// CAMINHO 
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.Desktop;

// PDF
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.EventQueue;

// RELATÓRIO
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class C_TELA_PRINCIPAL extends javax.swing.JFrame 
{
    // ATRIBUTO
    private File file;
    
    // VARÁVEIS ESPECIAIS DE CONEXÃO AO BANCO DE DADOS
    Connection conexao = null; 

    // CONSTRUTOR
    public C_TELA_PRINCIPAL()
    {
        initComponents();

        // MÉTODO CONECTOR
        conexao = CONEXAO.conector();
        System.out.println( conexao );

        // INSTANCIAÇÃO DE UM RELÓGIO EM TEMPO REAL
        Thread relogioThread = new Thread( new C_TELA_PRINCIPAL.HoraThread () );
        relogioThread.start();
    }
    
    // CLASSE CONTENDO A HORA EM TEMPO REAL
    class HoraThread implements Runnable
    {
        // REESCRIÇÃO DE UM MÉTODO
        @Override
        public void run() 
        {
           while ( true )
           {
               // INSTANCIANDO HORA EM TEMPO REAL
               DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
               
               // COLOCANDO HORA NA LBLHORATEMREA
               lblHoraNov.setText( formatoHora.format( new Date() ) );
            
               try
               {
                    Thread.sleep( 1000 );
               }
               
               catch ( InterruptedException e )
               {
                   // APOIO AO ERRO
                   System.err.println( e );                   
               }
           }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        lblDat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDataNov = new javax.swing.JLabel();
        lblHoraNov = new javax.swing.JLabel();
        Men = new javax.swing.JMenuBar();
        MenCad = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadOs = new javax.swing.JMenuItem();
        MenCadUsu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenOpcSai = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        MenRelCli = new javax.swing.JMenuItem();
        MenRelSer = new javax.swing.JMenuItem();
        MenRelVal = new javax.swing.JMenuItem();
        MenAju = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();
        MenAjuTel = new javax.swing.JMenuItem();
        MenAjuLem = new javax.swing.JMenuItem();
        MenAjuLin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ordem de Serviço SOS - IWorld");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_IMAGENS/Logo Tela Inicial.jpg"))); // NOI18N

        lblUsu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsu.setText("USUÁRIO");

        lblDat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDat.setText("DATA");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        lblDataNov.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataNov.setText("DATA");

        lblHoraNov.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHoraNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraNov.setText("HORA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDataNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHoraNov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataNov)
                .addGap(18, 18, 18)
                .addComponent(lblHoraNov)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        MenCad.setText("CADASTRO");

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenCadCli.setText("Cliente");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        MenCad.add(MenCadCli);

        MenCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenCadOs.setText("OS");
        MenCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadOsActionPerformed(evt);
            }
        });
        MenCad.add(MenCadOs);

        MenCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        MenCadUsu.setText("Usuários");
        MenCadUsu.setEnabled(false);
        MenCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadUsuActionPerformed(evt);
            }
        });
        MenCad.add(MenCadUsu);
        MenCad.add(jSeparator1);

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenOpcSai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C_ICONES/cancel.png"))); // NOI18N
        MenOpcSai.setText("Sair");
        MenOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSaiActionPerformed(evt);
            }
        });
        MenCad.add(MenOpcSai);

        Men.add(MenCad);

        MenRel.setText("RELATÓRIO");
        MenRel.setEnabled(false);

        MenRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        MenRelCli.setText("Clientes");
        MenRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelCliActionPerformed(evt);
            }
        });
        MenRel.add(MenRelCli);

        MenRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenRelSer.setText("Serviços");
        MenRelSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelSerActionPerformed(evt);
            }
        });
        MenRel.add(MenRelSer);

        MenRelVal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        MenRelVal.setText("Total de Ganhos");
        MenRelVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelValActionPerformed(evt);
            }
        });
        MenRel.add(MenRelVal);

        Men.add(MenRel);

        MenAju.setText("AJUDA");

        MenAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        MenAjuSob.setText("Sobre");
        MenAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuSob);

        MenAjuTel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        MenAjuTel.setText("Telefones");
        MenAjuTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuTelActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuTel);

        MenAjuLem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        MenAjuLem.setText("Lembretes");
        MenAjuLem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuLemActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuLem);

        MenAjuLin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenAjuLin.setText("Link de Ajuda");
        MenAjuLin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuLinActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuLin);

        Men.add(MenAju);

        setJMenuBar(Men);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(lblDat, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDat)
                .addGap(61, 61, 61)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addComponent(DesktopPanel)
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        /////////////////// MÉTODO DE ESTILO ///////////////////////////////////
        
        // CÓDIGO PARA A TELA PRINCIPAL MUDAR DE DE ESTILO QUANDO ABRIR
        try 
        {
            // MUDANÇA DE ESTILO
            PlasticLookAndFeel.setPlasticTheme( new SkyBlue () );
            
            try
            {
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            }
            
            catch ( InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e )
            {
                Logger.getLogger( C_TELA_PRINCIPAL.class.getName() ).log( Level.SEVERE, null, e );
            }
        }
        
        catch ( ClassNotFoundException e )
        {
            // APOIO AO ERRO
            System.out.println( e );            
        }
        
        SwingUtilities.updateComponentTreeUI( this );
        
        // DATA NO FORMATO - 25/12/2019
        Date dataSistema = new Date();
        
        // INSTANCIAÇÃO DO OBJETO
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // COLOCANDO NA LBLDATANOV A HORA 
        lblDataNov.setText( formato.format( dataSistema ) ); 
    }//GEN-LAST:event_formWindowOpened
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        // SUBSTITUIÇÃO DA LBLDAT PELA DATA ATUAL DO SISTEMA AO INICIALIZAR O FORM - JANELA ATIVADA //
        
        // INSTANCIAÇÃO DO OBJETO DATA E A SUA FORMATAÇÃO
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance( DateFormat.FULL );
        
        // COLOCAR DENTRO DA VARIÁVEL LBLDAT
        lblDat.setText( formatador.format( data ) ); 
    }//GEN-LAST:event_formWindowActivated
    private void MenOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcSaiActionPerformed

        //////////////////// MÉTODO DE SAÍDA ///////////////////////////////////
      
        // CAIXA DE DIÁLOGO
        int sair;
        
        sair = JOptionPane.showConfirmDialog( null, " TEM CERTEZA QUE DESEJA SAIR ? ", " ATENÇÃO !", JOptionPane.YES_NO_OPTION );

        // ESTRUTURA DE DECISÃO - SE SIM
        if( sair == JOptionPane.YES_OPTION )
        {
            System.exit(0);           
        }
        
        // ESTRUTURA DE DECISÃO - SE NÃO
        else
        {
            // APOIO AO ERRO
            System.err.println();
        }        
    }//GEN-LAST:event_MenOpcSaiActionPerformed
    private void MenAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobActionPerformed

        //////////////// MÉTODO PARA CHAMAR A TELA SOBRE ///////////////////////
        
        // INSTANCIAÇÃO DA TELA SOBRE
        G_TELA_SOBRE tl = new G_TELA_SOBRE();
        
        // TORNAR A TELA SOBRE VISÍVEL E DENTRO DO DESKTOP
        tl.setVisible( true );        
        DesktopPanel.add( tl );      
    }//GEN-LAST:event_MenAjuSobActionPerformed
    private void MenCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadUsuActionPerformed
       
        //////////////// MÉTODO PARA CHAMAR A TELA USUÁRIO /////////////////////
        
        // INSTANCIAÇÃO DA TELA USUÁRIO
        D_TELA_USUARIO tu = new D_TELA_USUARIO();
        
        // TORNAR A TELA USUÁRIO VISÍVEL E DENTRO DO DESKTOP
        tu.setVisible( true );        
        DesktopPanel.add( tu ); 
    }//GEN-LAST:event_MenCadUsuActionPerformed
    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed

        //////////////// MÉTODO PARA CHAMAR A TELA CLIENTE /////////////////////
        
        // INSTANCIAÇÃO DA TELA CLIENTE
        E_TELA_CLIENTE tc = new E_TELA_CLIENTE();
        
        // TORNAR A TELA CLIENTE VISÍVEL E DENTRO DO DESKTOP
        tc.setVisible( true );        
        DesktopPanel.add( tc );
    }//GEN-LAST:event_MenCadCliActionPerformed
    private void MenCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadOsActionPerformed
       
        //////////////// MÉTODO PARA CHAMAR A TELA SOBRE ///////////////////////
        
        // INSTANCIAÇÃO DA TELA SOBRE
        F_TELA_OS tp = new F_TELA_OS();
        
        // TORNAR A TELA SOBRE VISÍVEL E DENTRO DO DESKTOP
        tp.setVisible( true );        
        DesktopPanel.add( tp );
    }//GEN-LAST:event_MenCadOsActionPerformed
    private void MenAjuLinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuLinActionPerformed

        ///////////////// MÉTODO DE LINK PARA A AJUDA -  /////////////////
        try
        {
            URI link = new URI("https://www.api.whatsapp.com/send?phone=5521972885858");
            Desktop.getDesktop().browse( link );
        }
        
        catch( URISyntaxException | IOException e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        }        
    }//GEN-LAST:event_MenAjuLinActionPerformed
    private void MenAjuTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuTelActionPerformed

        //////////////// MÉTODO PARA SALVAR UM PDF /////////////////////////////
      
        // INSTANCIAÇÃO DE UM OBJETO
        Document document = new Document();
        
        try
        {
            // SAÍDA DO ARQUIVO COM O NOME "LISTA"
            PdfWriter.getInstance( document, new FileOutputStream( "LISTA.pdf" ) );
            
            // ABRIR DOCUMENTO 
            document.open();
            
            // TEXTO DO PDF
            document.add( new Paragraph("----- CONTATOS -----"));
            document.add( new Paragraph(" WHATSAPP: (21) 97288-5858 "));
            document.add( new Paragraph(" FACEBOOK: https://www.facebook.com/augustosouza19 "));
            document.add( new Paragraph(" INSTAGRAM: otaviodevelop "));
            document.add( new Paragraph(" SKYPE: otaviodevelop "));
        }
        
        catch ( DocumentException | FileNotFoundException e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        }
        
        // FECHANDO DOCUMENTO
        finally
        {
            document.close();
        } 
        
        // GERANDO UM ARQUIVO PDF
        try
        {
            Desktop.getDesktop().open( new File( "LISTA.pdf") );
        }
        
        catch( IOException e )
        {
            // APOIO AO ERRO
            System.err.println( e );           
        }    
    }//GEN-LAST:event_MenAjuTelActionPerformed
    private void MenAjuLemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuLemActionPerformed

        //////////////// MÉTODO PARA SALVAR EM TXT /////////////////////////////

        // ESCREVENDO UM LEMBRETE RÁPIDO NA CAIXA DE DIÁLOGO
        String texto;
        Path caminho;
        byte[] textoemByte;

        // CAMINHO
        caminho = Paths.get("C:\\SISTEMA_ORDEM_SERVICO-SOS\\Lembrete.txt");
      
        // CAIXA DE DIÁLOGO       
        texto = JOptionPane.showInputDialog( null, " ESCREVA AS SUAS ANOTAÇÕES ? ", " MENSAGEM ", JOptionPane.INFORMATION_MESSAGE );
        textoemByte = texto.getBytes();
        
        try
        {
            Files.write( caminho, textoemByte );
        }
        
        catch ( IOException e )
        {
            // APOIO AO ERRO
            System.err.println( e );           
        }    
    }//GEN-LAST:event_MenAjuLemActionPerformed
    private void MenRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelCliActionPerformed

        //////////// MÉTODO PARA GERAR UM RELATÓRIO DE CLIENTES ////////////////
      
        // ATRIBUTOS
        int confirma;
        
        confirma = JOptionPane.showConfirmDialog( null, " CONFIRMA A IMPRESSÃO DO RELATÓRIO DE CLIENTES ?", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO SIM
        if ( confirma == JOptionPane.YES_OPTION )
        {
            try 
            {
                // CLASSE JASPERPRINT PARA PREPARAR A IMPRESSÃO DE UM RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:\\relatorios\\RELATORIO_CLIENTES.jasper", null, conexao );
              
                // EXIBIÇÃO DE RELATÓRIO
                JasperViewer.viewReport( print, false );
            }
            
            catch ( Exception e ) 
            {
                // APOIO AO ERRO
                System.out.println( e );                
            }            
        }
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO NÃO
        else
        {
            
        }   
    }//GEN-LAST:event_MenRelCliActionPerformed
    private void MenRelSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelSerActionPerformed
       
        //////////// MÉTODO PARA GERAR UM RELATÓRIO DE SERVIÇOS ////////////////

        // ATRIBUTOS
        int confirma;
        
        confirma = JOptionPane.showConfirmDialog( null, " CONFIRMA A IMPRESSÃO DESTE RELATÓRIO DE SERVIÇOS ?", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO SIM
        if ( confirma == JOptionPane.YES_OPTION )
        {
            try 
            {
                // CLASSE JASPERPRINT PARA PREPARAR A IMPRESSÃO DE UM RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:\\relatorios\\RELATORIO_SERVICO.jasper", null, conexao );
              
                // EXIBIÇÃO DE RELATÓRIO
                JasperViewer.viewReport( print, false );
            }
            
            catch ( Exception e ) 
            {
                // APOIO AO ERRO               
                System.err.println( e );                
            }
            
        }
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO NÃO
        else
        {
            
        }     }//GEN-LAST:event_MenRelSerActionPerformed
    private void MenRelValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelValActionPerformed

        // GERANDO UM RELATÓRIO DE CLIENTES
        int confirma;
        
        confirma = JOptionPane.showConfirmDialog( null, " CONFIRMA A IMPRESSÃO DESTE RELATÓRIO DE VALOR ?", " ATENÇÃO ", JOptionPane.YES_NO_OPTION );
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO SIM
        if ( confirma == JOptionPane.YES_OPTION )
        {
            try 
            {
                // CLASSE JASPER PRINT PARA PREPARAR A IMPRESSÃO DE UM RELATÓRIO
                JasperPrint print = JasperFillManager.fillReport("C:\\relatorios\\RELATORIO_VALOR.jasper", null, conexao );
              
                //EXIBIÇÃO DE RELATÓRIO
                JasperViewer.viewReport( print, false );
            }
            
            catch ( Exception e ) 
            {
                // APOIO AO ERRO               
                System.err.println( e );                
            }
        }
        
        // ESTRUTURA DE DECISÃO - IMPRIMINDO RELATÓRIO COM JASPER REPORTS - CASO NÃO
        else
        {
            
        }
    }//GEN-LAST:event_MenRelValActionPerformed
    public static void main( String args[] )
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) 
            {
                if ("Nimbus".equals( info.getName() ) ) 
                {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        }
        
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e )
        {
            Logger.getLogger(C_TELA_PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, e );
        }
        
        EventQueue.invokeLater( () -> 
        {
            new C_TELA_PRINCIPAL().setVisible( true );
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanel;
    private javax.swing.JMenuBar Men;
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenAjuLem;
    private javax.swing.JMenuItem MenAjuLin;
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenuItem MenAjuTel;
    private javax.swing.JMenu MenCad;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadOs;
    public static javax.swing.JMenuItem MenCadUsu;
    private javax.swing.JMenuItem MenOpcSai;
    public static javax.swing.JMenu MenRel;
    private javax.swing.JMenuItem MenRelCli;
    private javax.swing.JMenuItem MenRelSer;
    private javax.swing.JMenuItem MenRelVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDat;
    private javax.swing.JLabel lblDataNov;
    private javax.swing.JLabel lblHoraNov;
    public static javax.swing.JLabel lblUsu;
    // End of variables declaration//GEN-END:variables
}
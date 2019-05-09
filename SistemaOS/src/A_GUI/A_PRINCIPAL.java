package A_GUI;

public class A_PRINCIPAL 
{
    // MÉTODO PRINCIPAL PARA INICIAR O LOGIN   
    public static void main( String[] args )  
    {         
        // INSTANCIAÇÃO DO DA TELA SPLASH
        H_TELA_SPLASH splash = new H_TELA_SPLASH();
        
        // TELA SPLASH APARECE NO CENTRO
        splash.setLocationRelativeTo(null); 
        splash.setVisible(true);
   
        try
        {
            // TEMPO DE DURAÇÃO DO SPLASH
            Thread.sleep(7000); 
        }
        
        catch ( NullPointerException | InterruptedException e )
        {
            // APOIO AO ERRO
            System.err.println( e );
        }
        
        // TELA SPLASH FECHA
        splash.dispose();
        
        // TELA PRINCIPAL APARECE
        new B_TELA_LOGIN().setVisible(true);
    }
}
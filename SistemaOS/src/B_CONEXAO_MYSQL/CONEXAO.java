package B_CONEXAO_MYSQL;

// IMPORTAÇÕES PARA A CONEXÃO
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXAO
{
    // MÉTODO RESPONSÁVEL POR ESTABELECER A CONEXÃO COM O BANCO DE DADOS
    public static Connection conector() 
    {
        Connection conexao;
        String driver;
        String url;
        String password;
        
        // CHAMAR O DRIVER JDBC
        driver = "com.mysql.jdbc.Driver";
        
        // ARMAZENANDO INFORMAÇÕES REFERENTES AO BANCO DE DADOS
        url = "jdbc:mysql://localhost:3306/dbsos";
        String user = "root";
        password = "";
        
        // TRATANDO EXCEÇÕES E ESTABELECENDO A CONEXÃO COM O BANCO DE DADOS
        try 
        {
            Class.forName( driver );
            
            conexao = DriverManager.getConnection( url, user, password );
            
            return conexao;
        }
                
        catch ( SQLException | ClassNotFoundException  e )
        {
            // APOIO PARA ESCLARECER O ERRO
            System.out.println( e );
            
            return null;   
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Principal {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USUARIO = "admin";
    private static final String SENHA = "admin";
   
    public static Connection getConexao() throws SQLException{
        try{
            Class.forName(DRIVER);
                return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(ClassNotFoundException cnfex){
            throw new SQLDataException(cnfex.getMessage());
        }
    }
    
    public static void main(String[] args){
        try{
            getConexao();
            System.out.println("Banco de Dados acessado com sucesso!");
        }catch(SQLException sqlex){
            System.out.println("Impossível acessar o Banco de Dados.\n "
                    + "ERRO: " + sqlex.getMessage());
        }
    }
}
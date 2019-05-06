package koneksi;
import java.sql.*;


public class Koneksi {

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection cc;
    public Statement ss;
    public ResultSet rr;

    
public void Class(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
        System.out.println("koneksisukses");
    }
    catch(Exception e){
        System.out.println(e);
    }
}

    public ResultSet UpdateJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



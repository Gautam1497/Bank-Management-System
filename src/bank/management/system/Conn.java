package bank.management.system;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try {
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","gautam");
            s=c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

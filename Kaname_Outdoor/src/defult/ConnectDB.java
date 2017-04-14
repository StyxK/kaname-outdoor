package defult;
import java.sql.*;
public class ConnectDB {
    private static Connection mySqlCon;
    public static void ConnectDaB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/kanameoutdoor";
            mySqlCon = DriverManager.getConnection(url+"?useUnicode=true&characterEncoding=UTF-8","root","root");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getMySqlConnect(){
        return mySqlCon;
    }
}
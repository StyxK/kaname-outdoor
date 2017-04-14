package Model;
import defult.ConnectDB;
import java.sql.*;
public class ModelMaps {
    public static int id;
    public String location;
    public static String accountId;
    public ModelMaps(){}
    
    public ModelMaps(int id,String location){
        this.id = id;
        this.location = location;
    }
    public static int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    public static String getAccountId() {
        return accountId;
    }
    
    public static void setAccountId(String accId) {
        accountId = accId;
    }
    
    public ResultSet findByName(String s){
        setLocation(s);
        ResultSet rs = null;
        try{
            String sql = "select * from location_outdoor where locationName like '%"+getLocation()+"%'";
            PreparedStatement ps = ConnectDB.getMySqlConnect().prepareStatement(sql);
            rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
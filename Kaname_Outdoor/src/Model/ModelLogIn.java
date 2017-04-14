package Model;
import defult.ConnectDB;
import java.sql.*;
public class ModelLogIn {
    private String mail;
    private String password;
    private static String accName;
    
    public ModelLogIn(){
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public static String getAccountId(){
        return accName;
    }
    
    public boolean check(){
        boolean member = false;
        try{
            System.out.println(mail);
            String sql = "select * from member_outdoor where email like "+"\""+mail+"\"";
            System.out.println(sql);
            PreparedStatement pt = ConnectDB.getMySqlConnect().prepareStatement(sql);
            ResultSet rs = pt.executeQuery();
            if(rs.next()){
                if(password.equals(rs.getString("password")) && rs.getInt("account_type_outdoor_account_type_id")!=2){
                        ModelMaps.setAccountId(rs.getString("memberId"));
                        ModelProblemList.setAccountId(rs.getString("memberId"));
                        ModelProblemReport.setAccountId(rs.getString("memberId"));
                        member = true;
                    }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return member;
    } 
}

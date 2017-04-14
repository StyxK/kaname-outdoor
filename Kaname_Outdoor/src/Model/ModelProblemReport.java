package Model;
import java.sql.*;
import defult.ConnectDB;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ModelProblemReport {
    private static int problemId;
    private static int pictureId;
    private static int categoryId;
    private static int locationId;
    private static String accountId;
    private String PicPath;
    private String problemName;
    private String detail;
    private String date;
    private String time;
    
    public ModelProblemReport() {}
    
    
    public ModelProblemReport(String problemName, String detail, String date, String time) {
        this.problemName = problemName;
        this.detail = detail;
        this.date = date;
        this.time = time;
    }
    
    
    public int getProblemId() {
        return problemId;
    }
    
    public static void setAccountId(String id){
        accountId = id;
    }
    
    public void setLocationId(){
        locationId =  ModelProblemList.getLocationId();
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }
    
    public void setCategoryId(String id){
        if(id.equals("ระบบน้ำ"))categoryId=1;
        else if(id.equals("ระบบไฟฟ้า"))categoryId=2;
        else categoryId=3;
    }
    
    public void setDateAndTime() {
        LocalDateTime ld = LocalDateTime.now();
        date = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        time = ld.format(DateTimeFormatter.ofPattern("hh.mm a"));
    }
    
    public String getTime() {
        return time;
    }
    
    public static void setProblemId(){
        try{
            String sql = "select * from problem_outdoor";
            PreparedStatement ps = ConnectDB.getMySqlConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                problemId = rs.getInt("problemId")+1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void setPictureId(){
        try{
            String sql = "select * from picture_outdoor";
            PreparedStatement ps = ConnectDB.getMySqlConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pictureId = rs.getInt("pictureId")+1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void excuteID(){
        setProblemId();
        setPictureId();
    }
    public void insertProblem(){
        try{
            String sql = "insert into problem_outdoor "
                    + "(problemId,problemName,"
                    + "detail,date,time,"
                    + "category_outdoor_categoryId,"
                    + "location_outdoor_locationId,status_outdoor_statusId,member_outdoor_memberId)"
                    + " values ("+problemId+","
                    +"'"+problemName+"'"+","
                    +"'"+detail+"'"+","
                    +"'"+date+"'"+","
                    +"'"+time+"'"+","
                    +categoryId+","
                    +locationId+","
                    +2+","
                    +"'"+accountId+"'"+")";
            ConnectDB.getMySqlConnect().createStatement().executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void insertPicture(){
        try{
            String sql = "insert into picture_outdoor (pictureId,pictureProblem,problem_outdoor_problemId,problem_outdoor_category_outdoor_categoryId)"
                    + " values ("+pictureId+","
                    +"'"+PicPath+"'"+","
                    +problemId+","+
                    +categoryId+")";
            ConnectDB.getMySqlConnect().createStatement().executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void setPicPath(String path){
        String filePath = path.replace("\\","\\\\");
        this.PicPath = filePath;
    }
    public String getPicPath(){
        return PicPath;
    }
    public static void setLocationId(int id){
        ModelProblemReport.locationId = id;
    }
    
    public void formToDB(){
        setDateAndTime();
        excuteID();
        insertPicture();
        insertProblem();
    }
}

package Model;
import java.sql.*;
import defult.ConnectDB;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ModelProblemList {
    private ArrayList<String> namePro;
    private ArrayList<String> picPro;
    private ArrayList<String> detailPro;
    private ArrayList<String> timePro;
    private ArrayList<String> member;
    private static String accountId;
    private static ArrayList<Integer> problemId;
    private static String filter;
    private static int locationId;
    
    public ModelProblemList(String filter){
        this.filter = filter;
        setProblemId();
        setName();
        setDetail();
        setPicture();
        setTime();
        setMember();
    }
    
    public static void setAccountId(String id){
        accountId = id;
    }
    public static String getAccountId(){
        return accountId;
    }
    //== overloading ==//
    public void setName(String warn){
        namePro = null;
    }
    public static void setProblemId(int id){
        problemId = null;
    }
    //=================//
    
    public static void setProblemId(){
        ArrayList <Integer> id = new ArrayList<Integer>();
        try{
            int count=0;
            String sqlName = "select * from problem_outdoor where location_outdoor_locationId = '"+locationId+"'";
            PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
            ResultSet rs = pt.executeQuery();
            while(rs.next()){
                id.add(count,rs.getInt("problemId"));
                count++;
                problemId = id;
            }
            for(int i =0;i<id.size();i++){
                for(int j=0;j<id.size()-1;j++){
                    int tmp = id.get(j);
                    if(id.get(i)>id.get(j)){
                        id.set(j,id.get(i));
                        id.set(i,tmp);
                    }
                }
            }
            if(filter.equalsIgnoreCase("old-new")){
                Collections.sort(id);
            }
        }catch(Exception e){}
    }
    
    public void setDetail(){
        ArrayList <String> detail = new ArrayList<String>();
        try{
            int count=0;
            for(int i=0;i<problemId.size();i++){
                String sqlName = "select * from problem_outdoor where problemId = '"+problemId.get(i)+"'";
                PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
                ResultSet rs = pt.executeQuery();
                if(rs.next()){
                    detail.add(count,rs.getString("detail"));
                    count++;
                    detailPro = detail;
                }
            }
        }catch(Exception e){}
    }
    
    public void setMember(){
        ArrayList <String> acc = new ArrayList<String>();
        try{
            int count=0;
            for(int i=0;i<problemId.size();i++){
                String sqlName = "select * from problem_outdoor where problemId = '"+problemId.get(i)+"'";
                PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
                ResultSet rs = pt.executeQuery();
                if(rs.next()){
                    String sqlMember = "select * from member_outdoor where memberId = '"+rs.getString("member_outdoor_memberId")+"'";
                    ResultSet rs2 = ConnectDB.getMySqlConnect().prepareStatement(sqlMember).executeQuery();
                    if(rs2.next()){
                        acc.add(count,rs2.getString("name")+"  "+rs2.getString("surname"));
                        count++;
                        member = acc;
                    }
                }
            }
        }catch(Exception e){}
    }
    
    public void setTime(){
        ArrayList <String> time = new ArrayList<String>();
        LocalDateTime now = LocalDateTime.now();
        String dateNow = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        try{
            int count=0;
            for(int i=0;i<problemId.size();i++){
                String sqlName = "select * from problem_outdoor where problemId = '"+problemId.get(i)+"'";
                PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
                ResultSet rs = pt.executeQuery();
                while(rs.next()){
                    if(rs.getString("date").equals(dateNow)){
                        time.add(count,rs.getString("time"));
                        count++;
                        timePro = time;
                    }
                    else{
                        time.add(count,rs.getString("date")+"   "+rs.getString("time"));
                        count++;
                        timePro = time;
                    }
                }
            }
        }catch(Exception e){}
    }
    public void setName(){
        ArrayList <String> name = new ArrayList<String>();
        try{
            int count=0;
            for(int i=0;i<problemId.size();i++){
                String sqlName = "select * from problem_outdoor where problemId = '"+problemId.get(i)+"'";
                PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
                ResultSet rs = pt.executeQuery();
                while(rs.next()){
                    name.add(count,rs.getString("problemName"));
                    count++;
                    namePro = name;
                }
            }
        }catch(Exception e){}
    }
    public void setPicture(){
        ArrayList <String> pic = new ArrayList<String>();
        try{
            int count=0;
            for(int i=0;i<problemId.size();i++){
                String sqlName = "select * from picture_outdoor where problem_outdoor_problemId = '"+problemId.get(i)+"'";
                PreparedStatement pt =  ConnectDB.getMySqlConnect().prepareStatement(sqlName);
                ResultSet rs = pt.executeQuery();
                while(rs.next()){
                    pic.add(count,rs.getString("pictureProblem"));
                    count++;
                    picPro = pic;
                }
            }
        }catch(Exception e){}
    }
    public ArrayList<String> getName(){
        return namePro;
    }
    public ArrayList<String> getPicture(){
        return picPro;
    }
    public ArrayList<String> getDetail(){
        return detailPro;
    }
    public ArrayList<String> getTime(){
        return timePro;
    }
    public static ArrayList<Integer> getProblemId(){
        return problemId;
    }
    public static void setLocationId(int id){
        ModelProblemList.locationId = id;
    }
    public static int getLocationId(){
        return locationId;
    }
    public ArrayList<String> getMember(){
        return member;
    }
    
    public static void main(String[] args) {
        ConnectDB.ConnectDaB();
        ModelProblemList con = new ModelProblemList("new-old");
        con.setProblemId();
        con.setName();
        con.setPicture();
        con.setMember();
        System.out.println(con.getName());
        System.out.println(con.getMember());
        for(int i: problemId){
            System.out.println(i);
        }
        System.out.println(con.getPicture());
    }
}

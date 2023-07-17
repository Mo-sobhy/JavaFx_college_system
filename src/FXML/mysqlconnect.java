package FXML;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
public class mysqlconnect {
    Connection conn=null;
    public static Connection ConnectDb(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
                  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
                  return conn;
        }catch(Exception e){
                  JOptionPane.showMessageDialog(null,e);
                  return null;
        }
    }
    
    public static ObservableList<Doctors_Class> getDatausers(){
        Connection conn=ConnectDb();
        ObservableList<Doctors_Class> list=FXCollections.observableArrayList();
        try{
            PreparedStatement ps=conn.prepareStatement("select * from doctors");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                list.add(new Doctors_Class(Integer.parseInt(rs.getString("Doctor_id")),rs.getString("Doctor_name"),rs.getString("Doctor_sub"),rs.getString("Doctor_Level_1"),rs.getString("Doctor_Level_2"),rs.getString("Doctor_Level_3"),rs.getString("Doctor_Level_4"),rs.getString("Time_Id"),rs.getString("Place_id")));
            }
        }catch(Exception e){
            
        }
        return list;
    }
}

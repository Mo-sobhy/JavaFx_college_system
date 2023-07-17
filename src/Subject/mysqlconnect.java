package Subject;
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
    
    public static ObservableList<Subject_class> getDatausers(){
        Connection conn=ConnectDb();
        ObservableList<Subject_class> list=FXCollections.observableArrayList();
        try{
            PreparedStatement ps=conn.prepareStatement(" select * from subjects");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                list.add(new Subject_class(Integer.parseInt(rs.getString("Subject_id")),rs.getString("Subject_name"),rs.getString("Doctor_name"),rs.getString("Engineer_name"),rs.getString("Subject_level_1"),rs.getString("Subject_level_2"),rs.getString("Subject_level_3"),rs.getString("Subject_level_4"),rs.getString("Lec_time"),rs.getString("Lec_place"),rs.getString("Sec_time"),rs.getString("Sec_place"),rs.getString("Subject_dept")));
            }
        }catch(Exception e){
            
        }
        return list;
    }
}

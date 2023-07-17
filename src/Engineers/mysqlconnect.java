package Engineers;
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
    
    public static ObservableList<Engineer_class> getDatausers(){
        Connection conn=ConnectDb();
        ObservableList<Engineer_class> list=FXCollections.observableArrayList();
        try{
            PreparedStatement ps=conn.prepareStatement("Select * from engineers");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                list.add(new Engineer_class(Integer.parseInt(rs.getString("Engineer_id")),rs.getString("Engineer_name"),rs.getString("Engineer_sub"),rs.getString("Engineer_Level_1"),rs.getString("Engineer_Level_2"),rs.getString("Engineer_Level_3"),rs.getString("Engineer_Level_4"),rs.getString("Place_id"),rs.getString("Time_Id")));
            }
        }catch(Exception e){
            
        }
        return list;
    }
}

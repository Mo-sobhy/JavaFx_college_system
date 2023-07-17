
package FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.*;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
public class DoctorsController implements Initializable {

   @FXML
    private TableColumn<Doctors_Class, String> Doctor_Level_1;

    @FXML
    private TableColumn<Doctors_Class, String> Doctor_Level_2;

    @FXML
    private TableColumn<Doctors_Class, String> Doctor_Level_3;

    @FXML
    private TableColumn<Doctors_Class, String> Doctor_Level_4;

    @FXML
    private TableColumn<Doctors_Class, Integer> Doctor_id;

    @FXML
    private TableColumn<Doctors_Class, String> Doctor_name;

    @FXML
    private TableColumn<Doctors_Class, String> Doctor_sub;

    @FXML
    private TableColumn<Doctors_Class, String> Place_id;

    @FXML
    private TableView<Doctors_Class> Table_id_Doctor;

    @FXML
    private TableColumn<Doctors_Class, String> Time_Id;
    
    
    @FXML
    private TextField txt_doctor_Place;

    @FXML
    private TextField txt_doctor_Time;

    @FXML
    private TextField txt_doctor_id;

    @FXML
    private TextField txt_doctor_level_1;

    @FXML
    private TextField txt_doctor_level_2;

    @FXML
    private TextField txt_doctor_level_3;

    @FXML
    private TextField txt_doctor_level_4;

    @FXML
    private TextField txt_doctor_name;

    @FXML
    private TextField txt_doctor_subject;
    
    ObservableList<Doctors_Class> listM;
    
    int index =-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void Add(){
     
        conn=mysqlconnect.ConnectDb(); 
        
        String sql="insert into doctors (Doctor_id  , Doctor_name , Doctor_sub , Doctor_Level_1,Doctor_Level_2,Doctor_Level_3,Doctor_Level_4 , Time_Id,Place_id ) Values(?,?,?,?,?,?,?,?,?)";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1,txt_doctor_id.getText() );
           pst.setString(2,txt_doctor_name.getText() );
           pst.setString(3,txt_doctor_subject.getText() );
           pst.setString(4,txt_doctor_level_1.getText() );
           pst.setString(5,txt_doctor_level_2.getText() );
           pst.setString(6,txt_doctor_level_3.getText() );
           pst.setString(7,txt_doctor_level_4.getText() );
           pst.setString(8,txt_doctor_Time.getText() );
           pst.setString(9,txt_doctor_Place.getText() );
           pst.execute();
           
           JOptionPane.showMessageDialog(null,"Doctors Add succes");
           UpdateTable();
        }catch(Exception ev){
                  JOptionPane.showMessageDialog(null,ev);

        }
    }
  @FXML
    void getSelected(MouseEvent event){
        index=Table_id_Doctor.getSelectionModel().getSelectedIndex();
        if(index<=-1){
         return;   
        }
        txt_doctor_id.setText(Doctor_id.getCellData(index).toString());
        txt_doctor_name.setText(Doctor_name.getCellData(index).toString());
        txt_doctor_subject.setText(Doctor_sub.getCellData(index).toString());
        txt_doctor_level_1.setText(Doctor_Level_1.getCellData(index).toString());
        txt_doctor_level_2.setText(Doctor_Level_2.getCellData(index).toString());
        txt_doctor_level_3.setText(Doctor_Level_3.getCellData(index).toString());
        txt_doctor_level_4.setText(Doctor_Level_4.getCellData(index).toString());
        txt_doctor_Time.setText(Time_Id.getCellData(index).toString());
        txt_doctor_Place.setText(Place_id.getCellData(index).toString());


    }
    public void Edit(){
        try{
            conn =mysqlconnect.ConnectDb();
            String value1=txt_doctor_id.getText();
            String value2=txt_doctor_name.getText();
            String value3=txt_doctor_subject.getText();
            String value4=txt_doctor_level_1.getText();
            String value5=txt_doctor_level_2.getText();
            String value6=txt_doctor_level_3.getText();
            String value7=txt_doctor_level_4.getText();
            String value8=txt_doctor_Time.getText();
            String value9=txt_doctor_Place.getText();
            
            String sql="update doctors set Doctor_id= '"+value1+"',Doctor_name= '"+value2+"',Doctor_sub= '"+value3+"',Doctor_Level_1= '"+value4+"',Doctor_Level_2= '"+value5+"',Doctor_Level_3= '"+value6+"',Doctor_Level_4= '"+value7+"',Time_Id= '"+value8+"',Place_id= '"+
                    value9+"'where Doctor_id='"+value1+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, " record Update");
            UpdateTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }
    
    public void Back(Event e){
          try{
      
        Parent root = FXMLLoader.load(getClass().getResource("/home/home.fxml"));
         Scene scene=new Scene(root);
        Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Home page");
       
        
        }catch(Exception ev){
        }
    }
    
    
    public void Delete(){
        conn=mysqlconnect.ConnectDb();
        String sql="delete from doctors where Doctor_id= ? ";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_doctor_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");
            UpdateTable();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }
    
    
    public void UpdateTable(){
         Doctor_id.setCellValueFactory(new PropertyValueFactory<Doctors_Class,Integer>("Doctor_id"));
        Doctor_name.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_name"));
        Doctor_sub.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_sub"));
        Doctor_Level_1.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_Level_1"));
        Doctor_Level_2.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_Level_2"));
        Doctor_Level_3.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_Level_3"));
        Doctor_Level_4.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Doctor_Level_4"));
        Time_Id.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Time_Id"));
        Place_id.setCellValueFactory(new PropertyValueFactory<Doctors_Class,String>("Place_id"));
     
     
       listM =mysqlconnect.getDatausers();
       Table_id_Doctor.setItems(listM);
    }
       public void entered(Event e){
        ((Button)e.getSource()).setScaleX(1.1);
          ((Button)e.getSource()).setScaleY(1.1);
    }
      public void exit(Event e){
        ((Button)e.getSource()).setScaleX(1);
          ((Button)e.getSource()).setScaleY(1);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       UpdateTable();
    }
}

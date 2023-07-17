package Engineers;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class EngineersController implements Initializable {

    @FXML
    private TableColumn<Engineer_class, String> Engineer_Level_1;

    @FXML
    private TableColumn<Engineer_class, String> Engineer_Level_2;

    @FXML
    private TableColumn<Engineer_class, String> Engineer_Level_3;

    @FXML
    private TableColumn<Engineer_class, String> Engineer_Level_4;

    @FXML
    private TableColumn<Engineer_class, Integer> Engineer_id;

    @FXML
    private TableColumn<Engineer_class, String> Engineer_name;

    @FXML
    private TableColumn<Engineer_class, String> Engineer_sub;

    @FXML
    private TableColumn<Engineer_class, String> Place_id;

    @FXML
    private TableView<Engineer_class> Table_id_Engineer;

    @FXML
    private TableColumn<Engineer_class, String> Time_Id;

    @FXML
    private TextField txt_Engineer_Place;

    @FXML
    private TextField txt_Engineer_Time;

    @FXML
    private TextField txt_Engineer_id;

    @FXML
    private TextField txt_Engineer_level_1;

    @FXML
    private TextField txt_Engineer_level_2;

    @FXML
    private TextField txt_Engineer_level_3;

    @FXML
    private TextField txt_Engineer_level_4;

    @FXML
    private TextField txt_Engineer_name;

    @FXML
    private TextField txt_Engineer_sub;
    
    ObservableList<Engineer_class> listM;
    
    int index =-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void Add(){
     
        conn=mysqlconnect.ConnectDb(); 
        
        String sql="insert into engineers (Engineer_id  , Engineer_name , Engineer_sub , Engineer_Level_1,Engineer_Level_2,Engineer_Level_3,Engineer_Level_4 , Time_Id,Place_id ) Values(?,?,?,?,?,?,?,?,?)";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1,txt_Engineer_id.getText() );
           pst.setString(2,txt_Engineer_name.getText() );
           pst.setString(3,txt_Engineer_sub.getText() );
           pst.setString(4,txt_Engineer_level_1.getText() );
           pst.setString(5,txt_Engineer_level_2.getText() );
           pst.setString(6,txt_Engineer_level_3.getText() );
           pst.setString(7,txt_Engineer_level_4.getText() );
           pst.setString(8,txt_Engineer_Time.getText() );
           pst.setString(9,txt_Engineer_Place.getText() );
           pst.execute();
           
           JOptionPane.showMessageDialog(null,"Engineer Add succes");
           UpdateTable();
        }catch(Exception ev){
           JOptionPane.showMessageDialog(null,ev);
        }
    }
  @FXML
    void getSelected(MouseEvent event){
        index=Table_id_Engineer.getSelectionModel().getSelectedIndex();
        if(index<=-1){
         return;   
        }
        txt_Engineer_id.setText(Engineer_id.getCellData(index).toString());
        txt_Engineer_name.setText(Engineer_name.getCellData(index).toString());
        txt_Engineer_sub.setText(Engineer_sub.getCellData(index).toString());
        txt_Engineer_level_1.setText(Engineer_Level_1.getCellData(index).toString());
        txt_Engineer_level_2.setText(Engineer_Level_2.getCellData(index).toString());
        txt_Engineer_level_3.setText(Engineer_Level_3.getCellData(index).toString());
        txt_Engineer_level_4.setText(Engineer_Level_4.getCellData(index).toString());
        txt_Engineer_Time.setText(Time_Id.getCellData(index).toString());
        txt_Engineer_Place.setText(Place_id.getCellData(index).toString());


    }
    public void Edit(){
        try{
            conn =mysqlconnect.ConnectDb();
            String value1=txt_Engineer_id.getText();
            String value2=txt_Engineer_name.getText();
            String value3=txt_Engineer_sub.getText();
            String value4=txt_Engineer_level_1.getText();
            String value5=txt_Engineer_level_2.getText();
            String value6=txt_Engineer_level_3.getText();
            String value7=txt_Engineer_level_4.getText();
            String value8=txt_Engineer_Time.getText();
            String value9=txt_Engineer_Place.getText();
            
            String sql="update engineers set Engineer_id= '"+value1+"',Engineer_name= '"+value2+"',Engineer_sub= '"+value3+"',Engineer_Level_1= '"+value4+"',Engineer_Level_2= '"+value5+"',Engineer_Level_3= '"+value6+"',Engineer_Level_4= '"+value7+"',Time_Id= '"+value8+"',Place_id= '"+
                    value9+"'where Engineer_id='"+value1+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null," record Update");
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
        String sql="delete from engineers where Engineer_id= ? ";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_Engineer_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");
            UpdateTable();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }
    public void UpdateTable(){
        Engineer_id.setCellValueFactory(new PropertyValueFactory<Engineer_class,Integer>("Engineer_id"));
        Engineer_name.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_name"));
        Engineer_sub.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_sub"));
        Engineer_Level_1.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_Level_1"));
        Engineer_Level_2.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_Level_2"));
        Engineer_Level_3.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_Level_3"));
        Engineer_Level_4.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Engineer_Level_4"));
        Time_Id.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Time_Id"));
        Place_id.setCellValueFactory(new PropertyValueFactory<Engineer_class,String>("Place_id"));
    
       listM=mysqlconnect.getDatausers();
       Table_id_Engineer.setItems(listM);
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

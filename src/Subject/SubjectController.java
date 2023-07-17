package Subject;
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

public class SubjectController implements Initializable {
    @FXML
    private TableColumn<Subject_class, String> Doctor_name;

    @FXML
    private TableColumn<Subject_class, String> Engineer_name;

    @FXML
    private TableColumn<Subject_class, String> Lec_place;

    @FXML
    private TableColumn<Subject_class, String> Lec_time;

    @FXML
    private TableColumn<Subject_class, String> Sec_place;

    @FXML
    private TableColumn<Subject_class, String> Sec_time;

    @FXML
    private TableColumn<Subject_class, String> Subject_dept;

    @FXML
    private TableColumn<Subject_class, Integer> Subject_id;

    @FXML
    private TableColumn<Subject_class, String> Subject_name;

    @FXML
    private TableView<Subject_class> Table_id_Subject;

    @FXML
    private TableColumn<Subject_class, String> Subject_level_1;

    @FXML
    private TableColumn<Subject_class, String> Subject_level_2;

    @FXML
    private TableColumn<Subject_class, String> Subject_level_3;

    @FXML
    private TableColumn<Subject_class, String> Subject_level_4;

    @FXML
    private TextField txt_Dept;

    @FXML
    private TextField txt_Doctor_name;

    @FXML
    private TextField txt_Engineer_name;

    @FXML
    private TextField txt_Lec_Place;

    @FXML
    private TextField txt_Lec_Time;

    @FXML
    private TextField txt_Sec_Place;

    @FXML
    private TextField txt_Sec_Time;

    @FXML
    private TextField txt_Subject_id;

    @FXML
    private TextField txt_Subject_name;

    @FXML
    private TextField txt_level_1;

    @FXML
    private TextField txt_level_2;

    @FXML
    private TextField txt_level_3;

    @FXML
    private TextField txt_level_4;

    ObservableList<Subject_class> listM;
    
    int index =-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public void Add(){
     
        conn=mysqlconnect.ConnectDb(); 
        
        String sql="insert into subjects (Subject_id  , Subject_name , Doctor_name , Engineer_name,Subject_level_1,Subject_level_2,Subject_level_3 , Subject_level_4,Lec_time,Lec_place,Sec_time,Sec_place,Subject_dept ) Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
           pst=conn.prepareStatement(sql);
           pst.setString(1,txt_Subject_id.getText() );
           pst.setString(2,txt_Subject_name.getText() );
           pst.setString(3,txt_Doctor_name.getText() );
           pst.setString(4,txt_Engineer_name.getText() );
           pst.setString(5,txt_level_1.getText() );
           pst.setString(6,txt_level_2.getText() );
           pst.setString(7,txt_level_3.getText() );
           pst.setString(8,txt_level_4.getText() );
           pst.setString(9,txt_Lec_Time.getText() );
           pst.setString(10,txt_Lec_Place.getText() );
           pst.setString(11,txt_Sec_Time.getText() );
           pst.setString(12,txt_Sec_Place.getText() );
           pst.setString(13,txt_Dept.getText() );
           pst.execute();
           
           JOptionPane.showMessageDialog(null,"Subject Add succes");
           UpdateTable();
        }catch(Exception ev){
                  JOptionPane.showMessageDialog(null,ev);

        }
    }
  @FXML
    void getSelected(MouseEvent event){
        index=Table_id_Subject.getSelectionModel().getSelectedIndex();
        if(index<=-1){
         return;   
        }
        txt_Subject_id.setText(Subject_id.getCellData(index).toString());
        txt_Subject_name.setText(Subject_name.getCellData(index).toString());
        txt_Doctor_name.setText(Doctor_name.getCellData(index).toString());
        txt_Engineer_name.setText(Engineer_name.getCellData(index).toString());
        txt_level_1.setText(Subject_level_1.getCellData(index).toString());
        txt_level_2.setText(Subject_level_2.getCellData(index).toString());
        txt_level_3.setText(Subject_level_3.getCellData(index).toString());
        txt_level_4.setText(Subject_level_4.getCellData(index).toString());
        txt_Lec_Time.setText(Lec_time.getCellData(index).toString());
        txt_Lec_Place.setText(Lec_place.getCellData(index).toString());
        txt_Sec_Time.setText(Sec_time.getCellData(index).toString());
        txt_Sec_Place.setText(Sec_place.getCellData(index).toString());
        txt_Dept.setText(Subject_dept.getCellData(index).toString());


    }
    public void Edit(){
        try{
            conn =mysqlconnect.ConnectDb();
            String value1=txt_Subject_id.getText();
            String value2=txt_Subject_name.getText();
            String value3=txt_Doctor_name.getText();
            String value4=txt_Engineer_name.getText();
            String value5=txt_level_1.getText();
            String value6=txt_level_2.getText();
            String value7=txt_level_3.getText();
            String value8=txt_level_4.getText();
            String value9=txt_Lec_Time.getText();
            String value10=txt_Lec_Place.getText();
            String value11=txt_Sec_Time.getText();
            String value12=txt_Sec_Place.getText();
            String value13=txt_Dept.getText();
            
            String sql="update subjects set Subject_id= '"+value1+"',Subject_name= '"+value2+"',Doctor_name= '"+value3+"',Engineer_name= '"+value4+"',Subject_level_1= '"+value5+"',Subject_level_2= '"+value6+"',Subject_level_3= '"+value7+"',Subject_level_4= '"+value8+"',Lec_time= '"+value9+"',Lec_place= '"+value10+"',Sec_time= '"+value11+"',Sec_place= '"+value12+"',Subject_dept= '"+value13
                    +"'where Subject_id='"+value1+"' ";
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
        String sql="delete from subjects where Subject_id= ? ";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_Subject_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");
            UpdateTable();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }
    
    
    public void UpdateTable(){
        Subject_id.setCellValueFactory(new PropertyValueFactory<Subject_class,Integer>("Subject_id"));
        Subject_name.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_name"));
        Doctor_name.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Doctor_name"));
        Engineer_name.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Engineer_name"));
        Subject_level_1.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_level_1"));
        Subject_level_2.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_level_2"));
        Subject_level_3.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_level_3"));
        Subject_level_4.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_level_4"));
        Lec_time.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Lec_time"));
        Lec_place.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Lec_place"));
        Sec_time.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Sec_time"));
        Sec_place.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Sec_place"));
        Subject_dept.setCellValueFactory(new PropertyValueFactory<Subject_class,String>("Subject_dept"));
     
     
       listM=mysqlconnect.getDatausers();
       Table_id_Subject.setItems(listM);
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

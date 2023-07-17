package home;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
     public void entered(Event e){
        ((Button)e.getSource()).setScaleX(1.1);
          ((Button)e.getSource()).setScaleY(1.1);
       ((Button)e.getSource()).setStyle("-fx-background-color:White");
    }
      public void exit(Event e){
        ((Button)e.getSource()).setScaleX(1);
          ((Button)e.getSource()).setScaleY(1);
           ((Button)e.getSource()).setStyle("-fx-background-color:orange");
    }
      
      public void Doctors(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/FXML/Doctors.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Doctors page");
      }
      
        public void Engineers(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Engineers/Engineers.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Engineers page");
      }
        
         public void Subjects(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Subject/Subject.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Subjects page");
      }
         
       public void Levels(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Level/Level.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Level page");
      }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

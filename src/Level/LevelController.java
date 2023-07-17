
package Level;

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

public class LevelController implements Initializable {
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
    public void Level1(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Level/Level_1.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Level_1 page");
      }
     public void Level2(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Level/Level_2.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Level_2 page");
      }
      public void Level3(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/Level/Level_3.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Level_3 page");
      }
        public void Home(Event e) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("/home/home.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Level_3 page");
      }
           public void Back(Event e) throws Exception {
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

package FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
public class LoginpageController implements Initializable {

    @FXML
    TextField username;
    
     @FXML
    PasswordField password;
    public void login(Event e){
        try{
        if(username.getText().trim().matches("[aA]dmin")&&password.getText().equals("1234")){
                     Parent root = FXMLLoader.load(getClass().getResource("/home/home.fxml"));
                  Scene scene=new Scene(root);
                 Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
                 stage.setScene(scene);
                 stage.setTitle("Home page");
        } else{
                    JOptionPane.showMessageDialog(null,"invalid Username or Password");
        }
        }catch(Exception ex){
            
        }
    }
    public void exit(){
        Platform.exit();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}

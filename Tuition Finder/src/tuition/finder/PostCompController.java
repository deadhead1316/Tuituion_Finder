
package tuition.finder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class PostCompController implements Initializable {

    @FXML
    private Label areatext;
    @FXML
    private Label timetext;
    @FXML
    private Label salarytext;
    @FXML
    private Label institutetext;
    @FXML
    private Label classtext;
    @FXML
    private Label prefinstext;
    @FXML
    private TextArea subjectext;
    @FXML
    private Label posttimetext;
    @FXML
    private Label postdatetext;
    

    public void setAreatext(String areatext){
        this.areatext.setText(areatext);
    }

    public void setTimetext(String areatext) {
        this.timetext.setText(areatext);
    }

    public void setSalarytext(String areatext) {
        this.salarytext.setText(areatext);
    }

    public void setInstitutetext(String areatext) {
        this.institutetext.setText(areatext);
    }

    public void setClasstext(String areatext) {
        this.classtext.setText(areatext);
    }

    public void setPrefinstext(String areatext) {
        this.prefinstext.setText(areatext);
    }

    public void setSubjectext(String areatext) {
        this.subjectext.setText(areatext);
    }

    public void setPosttimetext(String areatext) {
        this.posttimetext.setText(areatext);
    }

    public void setPostdatetext(String areatext) {
        this.postdatetext.setText(areatext);
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {            
    }    
    
}

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HorrorBoxController {

    @FXML
    private Button leftPath;

    @FXML
    private Button rightPath;

    @FXML
    private Button straightPath;

    @FXML
    private Button cry;

    @FXML
    private TextArea userTxt;

    @FXML
    private ImageView pathPhoto;

    @FXML
    private Label narrator;

    Image gameOver = new Image("images/GameOVer.jpg");
    
    
    
    @FXML
    void cryButton(MouseEvent event) {

    }

    @FXML
    void walkLeftButton(MouseEvent event) {

    }

    @FXML
    void walkRightButton(MouseEvent event) {

    }

    @FXML
    void walkStraightButton(MouseEvent event) {

    }

}

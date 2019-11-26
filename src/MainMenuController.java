import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import sample.*;

/**
 * View controller class - bridge between FXML and actual data
 */
public class MainMenuController {
    @FXML
    private Button mainMenu_loadProfile;
    @FXML
    private Text mainMenu_profileName;
    private static MainMenu mainMenu;
    private MainMenu anotherMenu;

    static {
        mainMenu = new MainMenu("Name here");
    }

    public void initialize(){
        this.anotherMenu = mainMenu;

        mainMenu_loadProfile.setOnAction(event -> {
            mainMenu_profileName.setText(mainMenu.getProfileName());
            this.anotherMenu.setProfileName("Dave");
        });
    }
}

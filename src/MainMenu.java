/**
 * General data class (backend)
 */
public class MainMenu {
    private String profileName;

    public MainMenu(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName(){
        return this.profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}

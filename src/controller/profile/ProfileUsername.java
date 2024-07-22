package src.controller.profile;

public class ProfileUsername {
    private String userName;
    public ProfileUsername(String userName){
        this.userName = userName.toString().toLowerCase();
    }
    public boolean validateUsername(ProfileUsername userName){
        return validateUsername(userName);
    }
}
package src.controller.profile;

public class ProfileName {
    private String name;
    public ProfileName(String name){
        this.name = name;
    }
    public static boolean validateName(ProfileName name){
        validateName(name);
        return false;
    }
}
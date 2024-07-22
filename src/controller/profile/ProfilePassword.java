package src.controller.profile;

import src.validates.ValidatePassword;

public class ProfilePassword {
    private String password;
    public ProfilePassword(String password){
        this.password = password;
    }
    public boolean validateSenha(ProfilePassword profilePassword){
        ValidatePassword.validatePassword(profilePassword);
        return true;
    }
}
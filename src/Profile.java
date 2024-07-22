package src;

import src.controller.profile.ProfileName;
import src.controller.profile.ProfilePassword;
import src.controller.profile.ProfileUsername;

import javax.naming.Name;

public interface Profile {
    public void Register(ProfileUsername username, ProfilePassword password, ProfileName name);
    public boolean login(ProfileUsername username, ProfilePassword password);
}

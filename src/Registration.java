package src;

public class Registration {
    String registration;
    public Registration(int registration){
        this.registration = String.valueOf(registration);
    }
    public static boolean validateRegistration(String registration){
        if(registration.isEmpty()){
            return false;
        }
        return true;
    }
}

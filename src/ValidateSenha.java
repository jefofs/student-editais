package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSenha {
    static Pattern pattern = Pattern.compile("[a-zA-Z]+[1-9]+");

    public static boolean validateSenha(Senha senha) {
        Matcher matcher = pattern.matcher(senha.toString());
        return matcher.find();
    }
}
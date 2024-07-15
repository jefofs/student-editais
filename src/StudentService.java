package src;

import java.util.List;

public class StudentService implements FacadeStudent{
    @Override
    public boolean login(String userName, Senha senha) {
        return false;
    }

    @Override
    public List<String> listarEditais() {
        return null;
    }

    @Override
    public void inscreverNoEdital() {

    }
}

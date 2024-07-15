package src;

import java.util.List;

public class Student implements FacadeStudent {
    Name name;
    Registration registration;
    Senha senha;

    public Student(Name name, Registration registration, Senha senha){
        this.name = name;
        this.registration = registration;
        this.senha = senha;

    }
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

package src;

import java.util.List;

public interface FacadeStudent {
        boolean login(String userName, Senha senha);
        List<String> listarEditais();
        void inscreverNoEdital();
}

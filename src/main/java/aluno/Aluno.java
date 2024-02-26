package aluno;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
    private String nome;
    private int qntDiscMatriculado;

    public Aluno(String nome, int qntDiscMatriculado) {
        this.nome = nome;
        this.qntDiscMatriculado = qntDiscMatriculado;
    }

    public boolean vefDiscMatriculado() {
        if (this.qntDiscMatriculado >= 5) {
            return false;
        } else {
            setQntDiscMatriculado(getQntDiscMatriculado() + 1);
            return true;
        }
    }
}

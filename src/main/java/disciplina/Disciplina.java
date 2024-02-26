package disciplina;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Disciplina {
    private String nomeDisciplina;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

}

package professor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

}

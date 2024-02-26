package turma;

import aluno.Aluno;
import disciplina.Disciplina;
import professor.Professor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Turma {
    private Aluno[] Alunos;
    private Professor Professor;
    private Disciplina Disciplina;
    private int QntMaxAlunos;

    public Turma(Professor professor, Disciplina disciplina, int qntMaxAlunos) {
        this.Alunos = new Aluno[qntMaxAlunos];
        this.Professor = professor;
        this.Disciplina = disciplina;
        this.QntMaxAlunos = qntMaxAlunos;
    }

    public void AdicionarAluno(Aluno aluno) {
        if(!aluno.vefDiscMatriculado()) {
            System.out.println("Numero máximo de turmas matriculadas excedido.");
        } else {
            for (var i = 0; i < Alunos.length; i++) {
                if(Alunos[i] == null) {
                    Alunos[i] = aluno;
                    System.out.println("Aluno adicionado com sucesso!");
                    return;
                }
            }
        }
    }

    public void AlunosMatriculados() {
        for (Aluno aluno : Alunos) {
            if (aluno != null) {
                System.out.println(aluno.getNome());
            }
        }
    }
}

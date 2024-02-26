package org.example;

import aluno.Aluno;
import disciplina.Disciplina;
import professor.Professor;
import turma.Turma;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Gabriel", 5);
        Professor professor1 = new Professor("Joao");
        Disciplina disciplina1 = new Disciplina("Java Maven");
        Turma turma1 = new Turma(professor1, disciplina1, 2);

        turma1.AdicionarAluno(aluno1);

        turma1.AlunosMatriculados();
        }
    }

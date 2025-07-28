package entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SistemaAlunos {

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

    public boolean alterarNomeAluno(String cpf, String novoNome) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCpf().equals(cpf)) {
                aluno.setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public boolean alterarIdadeAluno(String cpf, int novaIdade) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCpf().equals(cpf)) {
                aluno.setIdade(novaIdade);
                return true;
            }
        }
        return false;
    }
}

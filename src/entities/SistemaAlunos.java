package entities;

import java.util.ArrayList;

public class SistemaAlunos {

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void listarAlunos() {
        if (!listaAlunos.isEmpty()) {
            System.out.println("Todos os alunos já cadastrados: ");
            for (Aluno aluno : listaAlunos) {
                System.out.println(aluno);
            }
        }
        else {
            System.out.println("Não há alunos cadastrados!");
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

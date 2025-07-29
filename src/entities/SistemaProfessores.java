package entities;

import java.util.LinkedList;
import java.util.List;

public class SistemaProfessores {

    public List<Professor> listaProfessores = new LinkedList<>();

    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void listarProfessores() {
        if (!listaProfessores.isEmpty()) {
            System.out.println("Todos os professores já cadastrados: ");
            for (Professor professor : listaProfessores) {
                System.out.println(professor);
            }
        }
        else {
            System.out.println("Não há professores cadastrados!");
        }
    }

    public boolean alterarNomeProfessor(String cpf, String novoNome) {
        for (Professor professor : listaProfessores) {
            if (professor.getCpf().equals(cpf)) {
                professor.setNome(novoNome);
                return true;
            }
        }
        return false;
    }

    public boolean alterarIdadeProfessor(String cpf, int novaIdade) {
        for (Professor professor : listaProfessores) {
            if (professor.getCpf().equals(cpf)) {
                professor.setIdade(novaIdade);
                return true;
            }
        }
        return false;
    }

    public boolean alterarCpfProfessor(String cpf, String novoCpf) {
        for (Professor professor : listaProfessores) {
            if (professor.getCpf().equals(cpf)) {
                professor.setCpf(novoCpf);
                return true;
            }
        }
        return false;
    }

    public boolean alterarRfProfessor(String cpf, int rf) {
        for (Professor professor : listaProfessores) {
            if (professor.getCpf().equals(cpf)) {
                professor.setRf(rf);
                return true;
            }
        }
        return false;
    }

    public boolean alterarSalario(String cpf, double novoSalario) {
        for (Professor professor : listaProfessores) {
            if (professor.getCpf().equals(cpf)) {
                professor.setSalario(novoSalario);
                return true;
            }
        }
        return false;
    }
}

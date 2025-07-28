package entities;

import java.util.ArrayList;

public class SistemaProfessores {

    public ArrayList<Professor> listaProfessores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void listarProfessores() {
        if (!listaProfessores.isEmpty()) {
            System.out.println("Todos os alunos já cadastrados: ");
            for (Professor professor : listaProfessores) {
                System.out.println(professor);
            }
        }
        else {
            System.out.println("Não há professores cadastrados!");
        }
    }
}

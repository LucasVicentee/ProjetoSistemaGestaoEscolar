package entities;

import java.util.ArrayList;

public class SistemaProfessores {

    public ArrayList<Professor> listaProfessores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void listarProfessor() {
        for (Professor professor : listaProfessores) {
            System.out.println(professor);
        }
    }
}

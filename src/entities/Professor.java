package entities;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private ArrayList<String> materias;
    private int rf;


    public Professor(String nome, int idade, String cpf, int rf) {
        super(nome, idade, cpf);
        this.materias = new ArrayList<>();
        this.rf = rf;
    }

    public void AdicionarMateria(String materias) {
        this.materias.add(materias);
    }

    public void removerMateria(String materias) {
        this.materias.add(materias);
    }

    public ArrayList<String> getMateria() {
        return materias;
    }

    public int getRf() {
        return rf;
    }

    public void setRf(int rf) {
        this.rf = rf;
    }

    @Override
    public String toString() {
        return String.format("Informações do professor: " +
                "\nNome: %s, " +
                "\nIdade: %d, " +
                "\nCPF: %s, " +
                "\nNúmero do RF: %d", nome, idade, cpf, rf);
    }
}

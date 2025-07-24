package entities;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<String> materias;
    private double nota;
    private int ra;

    public Aluno(String nome, int idade, String cpf, double nota, int ra) {
        super(nome, idade, cpf);
        this.materias = new ArrayList<>();
        this.nota = nota;
        this.ra = ra;
    }

    public Aluno(String nome, int idade, String cpf, int ra) {
        super(nome, idade, cpf);
        this.materias = new ArrayList<>();
        this.ra = ra;
    }

    public void adicionarMateria(String materias) {

        this.materias.add(materias);
    }

    public void removerMateria(String materias) {

        this.materias.remove(materias);
    }

    public ArrayList<String> getMateria() {
        return materias;
    }

    public double getNota() {

        return nota;
    }

    public void setNota(double nota) {

        this.nota = nota;
    }

    public int getRa() {

        return ra;
    }

    public void setRa(int ra) {

        this.ra = ra;
    }

    @Override
    public String toString() {
        return String.format("Informações do Aluno: " +
                "\nNome: %s, " +
                "\nIdade: %d, " +
                "\nCPF: %s, " +
                "\nNúmero do RA: %d", nome, idade, cpf, ra);
    }
}

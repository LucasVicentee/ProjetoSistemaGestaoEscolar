package entities;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private double nota;
    private int ra;

    public Aluno(String nome, int idade, String cpf, double nota, int ra) {
        super(nome, idade, cpf);
        this.nota = nota;
        this.ra = ra;
    }

    public Aluno(String nome, int idade, String cpf, int ra) {
        super(nome, idade, cpf);
        this.ra = ra;
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
                "\nNome: %s " +
                "\nIdade: %d " +
                "\nCPF: %s " +
                "\nNúmero do RA: %d", nome, idade, cpf, ra);
    }
}

package entities;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private ArrayList<String> materias;
    private int rf;
    private double salario;


    public Professor(String nome, int idade, String cpf, int rf, double salario) {
        super(nome, idade, cpf);
        this.materias = new ArrayList<>();
        this.rf = rf;
        this.salario = salario;
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

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public double getSalario() {

        return salario;
    }

    @Override
    public String toString() {
        return String.format("Informações do professor: " +
                "\nNome: %s, " +
                "\nIdade: %d, " +
                "\nCPF: %s, " +
                "\nNúmero do RF: %d" +
                "\nSalário: %f", nome, idade, cpf, rf, salario);
    }
}

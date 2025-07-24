package application;

import entities.Aluno;
import entities.Professor;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        System.out.print("Informe a opção desejada: ");
        System.out.print("1 - Para cadastrar um aluno");
        System.out.print("2 - Para cadastrar um professor");
        System.out.print("3 - Para listar os alunos já cadastrados");
        System.out.print("4 - Para listar os professores já cadastrados");
        int opcao;
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Informe os dados do aluno: ");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                sc.nextLine();
                System.out.print("RA: ");
                int ra = sc.nextInt();

                Aluno aluno = new Aluno(nome, idade, cpf, ra);
                break;

            case 2:
                System.out.println("Informe os dados do professor: ");
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("Idade: ");
                idade = sc.nextInt();
                sc.nextLine();
                System.out.print("CPF: ");
                cpf = sc.nextLine();
                sc.nextLine();
                System.out.print("RF: ");
                int rf = sc.nextInt();
                sc.nextLine();
                System.out.print("Salário: ");
                double salario = sc.nextDouble();

                Professor professor = new Professor(nome, idade, cpf, rf, salario);
                break;
        }


        sc.close();
    }
}
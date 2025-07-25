package application;

import entities.Aluno;
import entities.Professor;
import entities.SistemaAlunos;
import entities.SistemaProfessores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SistemaAlunos sistemaAlun = new SistemaAlunos();
        SistemaProfessores sistemaProf = new SistemaProfessores();

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        char repeticao;
        do {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Para cadastrar um aluno");
            System.out.println("2 - Para cadastrar um professor");
            System.out.println("3 - Para listar os alunos já cadastrados");
            System.out.println("4 - Para listar os professores já cadastrados");
            System.out.println("5 - Para modificar as informações de um aluno");
            System.out.println("6 - Para Sair");
            System.out.print("Opção: ");

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
                    System.out.print("RA: ");
                    int ra = sc.nextInt();

                    Aluno aluno = new Aluno(nome, idade, cpf, ra);
                    listaAlunos.add(aluno);
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
                    System.out.print("RF: ");
                    int rf = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();

                    Professor professor = new Professor(nome, idade, cpf, rf, salario);
                    listaProfessores.add(professor);
                    break;
                case 3:
                    System.out.println("Todos os alunos já cadastrados: ");
                    sistemaAlun.listarAlunos();
                    break;
                case 4:
                    System.out.println("Todos os professores já cadastrados: ");
                    sistemaProf.listarProfessor();
                    break;
                case 5:
                    System.out.println("Informe o que deseja ser mudado das informações do aluno: ");
                    System.out.println("1 - Para modificar o nome");
                    System.out.println("2 - Para modificar a idade");
                    System.out.println("3 - Para modificar o CPF");
                    System.out.println("4 - Para modificar o RA");
                    int opMudarInfoAluno = sc.nextInt();
                    sc.nextLine();
                    if (opMudarInfoAluno == 1) {
                        System.out.print("Informe o CPF do aluno que deseja alterar: ");
                        String cpfAluno = sc.nextLine();
                        boolean encontrado = false;
                        for (Aluno a: listaAlunos) {
                            if (a.getCpf().equals(cpfAluno)) {
                                System.out.print("Novo nome: ");
                                String novoNomeAluno = sc.nextLine();
                                a.setNome(novoNomeAluno);
                                System.out.println("Nome atualizado com sucesso!");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Aluno do CPF" + cpfAluno + " não encontrado!");
                        }
                    }
                case 6:
                    System.out.println("Obrigado!");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.print("Deseja entrar novamente no menu de interação?: (S/N)");
            repeticao = sc.next().charAt(0);
        } while (repeticao == 'S' || repeticao == 's');

        sc.close();
    }
}
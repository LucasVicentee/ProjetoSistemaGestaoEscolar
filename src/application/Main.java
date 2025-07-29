package application;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LeitorDeDados leitor = new LeitorDeDados(sc);
        SistemaAlunos sistemaAlun = new SistemaAlunos();
        SistemaProfessores sistemaProf = new SistemaProfessores();

        char repeticao;
        do {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Para cadastrar um aluno");
            System.out.println("2 - Para cadastrar um professor");
            System.out.println("3 - Para listar os alunos já cadastrados");
            System.out.println("4 - Para listar os professores já cadastrados");
            System.out.println("5 - Para modificar as informações de um aluno");
            System.out.println("6 - Para modificar as informações de um professor");
            System.out.println("7 - Para Sair");
            int opcao = leitor.lerInt("Opção: ");

            switch (opcao) {
                case 1: {
                    System.out.println("Informe os dados do aluno: ");
                    String nome = leitor.lerString("Nome: ");
                    int idade = leitor.lerInt("Idade: ");
                    String cpf = leitor.lerString("CPF: ");
                    int ra = leitor.lerInt("RA: ");
                    sistemaAlun.adicionarAluno(new Aluno(nome, idade, cpf, ra));
                    break;
                }
                case 2: {
                    System.out.println("Informe os dados do professor: ");
                    String nome = leitor.lerString("Nome: ");
                    int idade = leitor.lerInt("Idade: ");
                    String cpf = leitor.lerString("CPF: ");
                    int ra = leitor.lerInt("RA: ");
                    int rf = leitor.lerInt("RF: ");
                    double salario = leitor.lerDouble("Salário: ");
                    sistemaProf.adicionarProfessor(new Professor(nome, idade, cpf, rf, salario));
                    break;
                }
                case 3:
                    sistemaAlun.listarAlunos();
                    break;
                case 4:
                    sistemaProf.listarProfessores();
                    break;
                case 5:
                    System.out.println("Informe o que deseja ser mudado das informações do aluno: ");
                    System.out.println("1 - Para modificar o nome");
                    System.out.println("2 - Para modificar a idade");
                    System.out.println("3 - Para modificar o CPF");
                    System.out.println("4 - Para modificar o RA");
                    int opMudarInfoAluno = leitor.lerInt("Opção escolhida: ");
                    String cpfAluno = leitor.lerString("Informe o Cpf do aluno: ");

                    switch (opMudarInfoAluno) {
                        case 1:
                            String novoNome = leitor.lerString("Informe o novo nome: ");
                            if (sistemaAlun.alterarNomeAluno(cpfAluno, novoNome)) {
                                System.out.println("Nome alterado com sucesso!");
                            }
                            else {
                                System.out.println("Aluno com o CPF " + cpfAluno + " não encontrado.");
                            }
                            break;
                        case 2:
                            int novaIdade = leitor.lerInt("Nova idade: ");
                            if (sistemaAlun.alterarIdadeAluno(cpfAluno, novaIdade)) {
                                System.out.println("Idade alterada com sucesso!");
                            }
                            else {
                                System.out.println("Aluno com o CPF " + cpfAluno + " não encontrado.");
                            }
                            break;
                        case 3:
                            String novoCpf = leitor.lerString("Informe o novo CPF: ");
                            if (sistemaAlun.alterarCpfAluno(cpfAluno, novoCpf)) {
                                System.out.println("CPF alterado com sucesso!");
                            }
                            else {
                                System.out.println("Aluno com o CPF " + cpfAluno + " não encontrado.");
                            }
                            break;
                        case 4:
                            int novoRa = leitor.lerInt("Informe o novo RA: ");
                            if (sistemaAlun.alterarRaAluno(cpfAluno, novoRa)) {
                                System.out.println("RA alterado com sucesso!");
                            }
                            else {
                                System.out.println("Aluno com o CPF " + cpfAluno + " não encontrado.");
                            }
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Informe o que deseja ser mudado das informações do professor: ");
                    System.out.println("1 - Para modificar o nome");
                    System.out.println("2 - Para modificar a idade");
                    System.out.println("3 - Para modificar o CPF");
                    System.out.println("4 - Para modificar o RF");
                    System.out.println("5 - Para modificar o salário");
                    int opMudarInfoProfessor = leitor.lerInt("Informe a opção desejada: ");
                    String cpfProfessor = leitor.lerString("Informe o CPF do professor: ");

                    switch (opMudarInfoProfessor) {
                        case 1:
                            String novoNome = leitor.lerString("Informe o novo nome: ");
                            if (sistemaProf.alterarNomeProfessor(cpfProfessor, novoNome)) {
                                System.out.println("Nome alterado com sucesso!");
                            }
                            else {
                                System.out.println("Professor com o CPF " + cpfProfessor + " não encontrado.");
                            }
                            break;
                        case 2:
                            int novaIdade = leitor.lerInt("Informe a nova idade: ");
                            if (sistemaProf.alterarIdadeProfessor(cpfProfessor, novaIdade)) {
                                System.out.println("Idade alterada com sucesso!");
                            }
                            else {
                                System.out.println("Professor com o CPF " + cpfProfessor + " não encontrado.");
                            }
                            break;
                        case 3:
                            String novoCpf = leitor.lerString("Informe o novo CPF: ");
                            if (sistemaProf.alterarCpfProfessor(cpfProfessor, novoCpf)) {
                                System.out.println("CPF atualizado com sucesso!");
                            }
                            else {
                                System.out.println("Professor com o CPF " + cpfProfessor + " não encontrado.");
                            }
                            break;
                        case 4:
                            int novoRf = leitor.lerInt("Informe o novo RF: ");
                            if (sistemaProf.alterarRfProfessor(cpfProfessor, novoRf)) {
                                System.out.println("RF alterado com sucesso!");
                            }
                            else {
                                System.out.println("Professor com o CPF " + cpfProfessor + " não encontrado.");
                            }
                            break;
                        case 5:
                            double novoSalario = leitor.lerDouble("Informe o novo salário: ");
                            if (sistemaProf.alterarSalario(cpfProfessor, novoSalario)) {
                                System.out.println("Salário alterado com sucesso!");
                            }
                            else {
                                System.out.println("Professor com o CPF " + cpfProfessor + " não encontrado.");
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            repeticao = leitor.lerChar("Deseja entrar novamente no menu de interação?: (S/N)");
        } while (repeticao == 'S' || repeticao == 's');
        System.out.println("Obrigado!");

        sc.close();
        //Feliz pelo meu desenvolvimento e determinação na Área da TI :)
    }
}
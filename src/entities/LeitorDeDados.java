package entities;

import java.util.Scanner;

public class LeitorDeDados {

    private Scanner sc;

    public LeitorDeDados(Scanner sc) {
        this.sc = sc;
    }

    public String lerString(String dado) {
        System.out.print(dado);
        return sc.nextLine();
    }

    public int lerInt(String dado) {
        System.out.print(dado);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public double lerDouble(String dado) {
        System.out.print(dado);
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    public char lerChar(String dado) {
        System.out.print(dado);
        return sc.nextLine().charAt(0);
    }
}

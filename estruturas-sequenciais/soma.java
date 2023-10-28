// Problema "soma"
// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar
// na tela o valor da soma destes números.

import java.util.Locale;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número:");
        int n2 = sc.nextInt();

        System.out.println("SOMA = " + (n1 + n2));

        sc.close();
    }
}

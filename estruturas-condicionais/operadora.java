// Problema "operadora"
// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a
// 100 minutos de telefone.Cada minuto que exceder a franquia de 100 minutos custa
// R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa
// consumiu, daí mostrar o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double minutosBase = 100.00;
        double valorBase = 50.00;

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        if (minutos > minutosBase) {
            double aPagar = (minutos - minutosBase) * 2;
            System.out.println("valor a pagar = " + String.format("%.2f", (aPagar + valorBase)) + "R$");
        } else {
            System.out.println("valor a pagar = " + String.format("%.2f", valorBase) + "R$");
        }

        sc.close();
    }
}

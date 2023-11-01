// Problema "glicose"
// Fazer um programa para ler a quantidade de glicose
// no sangue de uma pessoa e depois mostrar na tela a
// classificação desta glicose de acordo com a tabela de referência.

// Classificação | Glicose
// Normal   | Até 100 mg/dl
// Elevado  | Maior que 100 até 140 mg/dl
// Diabetes | Maior de 140 mg/dl 

import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int normal = 100;
        int elevado = 140;

        System.out.println("Digite a medida da glicose: ");
        float glicose = sc.nextFloat();

        if (glicose < normal) {
            System.out.println("Classificação: normal.");
        } else if (glicose > normal && glicose <= elevado) {
            System.out.println("Classificação: elevado.");
        } else {
            System.out.println("Classificação: diabetes.");
        }
        sc.close();
    }
}

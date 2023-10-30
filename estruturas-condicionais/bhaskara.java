// Problema "bhaskara"
// Fazer um programa para ler os três coeficientes de uma equação do segundo grau.
// Usando a fórmula de Bhaskara, calcular e mostrar os valores das raízes x1 e x2
// da equação com quatro casas decimais, conforme exemplo. Se a equação não
// possuir raízes reais, mostrar uma mensagem.

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class bhaskara {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        float a = sc.nextFloat();

        System.out.print("Digite o valor de b: ");
        float b = sc.nextFloat();
    
        System.out.print("Digite o valor de c: ");
        float c = sc.nextFloat();

        float delta = (b * b) - 4 *(a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1 = " + String.format("%.4f", x1));
            System.out.println("x2 = " + String.format("%.4f", x2));
        }

        sc.close();
    }
}

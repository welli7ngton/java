// Problema "medidas"
// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e
// mostrar (imprimir os dados com quatro casas decimais):
// a) a área do quadrado que tem lado A
// b) a área do triângulo retângulo que base A e altura B
// c) a área do trapézio que tem bases A e B, e altura C

import java.util.Locale;
import java.util.Scanner;

public class medidas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três medidas:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.println("Áre do quadrado:");
        System.out.println(String.format("%.4f", (a * a)));

        System.out.println("Área do triângulo:");
        System.out.println(String.format("%.4f", ((a * b)) / 2));

        System.out.println("Área do trapézio");
        System.out.println(String.format("%.4f", ((a + b) * c) / 2));

        sc.close();
    }
}



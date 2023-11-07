// Problema "multiplos" (adaptado de URI 1044)
// Fazer um programa para ler dois números inteiros, e dizer se um número
// é múltiplo do outro. Os números podem ser digitados em qualquer ordem.

import java.util.Locale;
import java.util.Scanner;

public class multipĺos {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = sc.nextInt();
        
        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("Multiplos.");
        } else {
            System.out.println("Não multiplos.");
        }
        sc.close();
    }
}

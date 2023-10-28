// Problema "idades"
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
// uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
// decimal, conforme exemplo.

import java.util.Scanner;
import java.util.Locale;

public class idades {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nomeP1 = sc.next();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idadeP1 = sc.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nomeP2 = sc.next();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idadeP2 = sc.nextInt();
        float media = (idadeP1 + idadeP2) / 2;
        System.out.println("A idade média entre " + nomeP1.toUpperCase() + " e " + nomeP2.toUpperCase() + " é: " + String.format("%.2f", media));

        sc.close();
    }
}

// Problema "menor_de_tres"
// Fazer um programa para ler três números inteiros. Em seguida
// mostrar qual o menor dentre os três números lidos. Em caso de empate
// mostrar apenas uma vez. 

import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite três números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        if (n1 < n2 && n1 < n3){
            System.out.println("menor = " + n1);
        } else if (n2 < n3){
            System.out.println("menor = " + n2);
        } else {
            System.out.println("menor = " + n3);
        }

    }
}
// Problema "duracao"
// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na
// tela esta duração no formato horas:minutos:segundos.

import java.util.Locale;
import java.util.Scanner;

public class duracao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma quantidade de tempo em segundos: ");
        int tempoSegundos = sc.nextInt();

        int tempoHora = tempoSegundos / 3600;

        int resto = tempoSegundos % 3600;

        int tempoMinutos = resto / 60;

        tempoSegundos %= 60;

        System.out.println(tempoHora + ":" + tempoMinutos + ":" + tempoSegundos);

        sc.close();
    }
}

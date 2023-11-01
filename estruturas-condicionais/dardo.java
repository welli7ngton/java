// Problema "dardo"
// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
// distância que conseguir. Você deve criar um programa para, dadas as
// medidas das três tentativas de lançamento, informar qual foi a maior.

import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float maiorDistancia = 0;
        float distancia = 0;
        System.out.println("Digite as três distâncias: ");
        for (int i = 0; i < 3; i++) {
            distancia = sc.nextFloat();
            if (distancia > maiorDistancia){
                maiorDistancia = distancia;
            }
        }
        System.out.println("Maior distância: " + maiorDistancia);
        sc.close();
    }
}

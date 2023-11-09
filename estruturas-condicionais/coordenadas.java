// Problema "coordenadas" (adaptado de URI 1041)
// Leia os valores das coordenadas X e Y de um ponto no plano
// cartesiano. A seguir, determine qual o quadrante ao qual pertence o
// ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
// mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
// “Eixo X” ou “Eixo Y”, conforme for a situação. 

import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a coordenada x: ")
        int x = sc.nextInt();
        System.out.println("Digite a coordenada y: ")
        int y = sc.nextInt();
        sc.close();
    }
}
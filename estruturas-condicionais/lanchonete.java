// Problema "lanchonete" (adaptado de URI 1038)
// Uma lanchonete possui vários produtos. Cada produto possui um código
// e um preço. Você deve fazer um programa para ler o código e a
// quantidade comprada de um produto (suponha um código válido), e daí
// informar qual o valor a ser pago, com duas casas decimais, conforme
// tabela de produtos. 

// Código do |  Preço do   |
// produto   |  produto    |
// 1 R$      |   5.00      |
// 2 R$      |   3.50      |
// 3 R$      |   4.80      |
// 4 R$      |   8.90      |
// 5 R$      |   7.32      | 

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        double cod = sc.nextInt();
        double preco;
        if (cod >= 1 && cod <= 5){
            if (cod == 1 ) {
                preco = 5.0;
            } else if (cod == 2){
                preco = 4.8;
            } else if (cod == 3){
                preco = 3.5;
            } else if (cod == 4){
                preco = 8.9;
            } else if (cod == 5){
                preco = 7.32;
            } else {
                preco = 0.0;
            }
            System.out.println("Digite a quantidade: ");
            int qtd = sc.nextInt();
            double valoTotal = qtd * preco;
            System.out.println("Valor a ser pago: " + String.format("%.2f", valoTotal));
        } else {
            System.out.println("Código inválido.");
        }
        sc.close();
    }
}

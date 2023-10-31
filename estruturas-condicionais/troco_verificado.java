// Problema "troco_verificado"
// Fazer um programa para calcular o troco no processo de pagamento de um
// produto de uma mercearia. O programa deve ler o preço unitário do produto
// a quantidade de unidades compradas deste produto, e o valor em dinheiro dado
// pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
// ao cliente. Se o dinheiro dado pelo cliente não for suficiente
// mostrar uma mensagem informando o valor restante conforme exemplo.

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Informe a quantidade de produtos: ");
        double quantidade = sc.nextDouble();
        System.out.print("Informe o valor dado pelo cliente: ");
        double valorCliente = sc.nextDouble();

        double valorTotal = precoUnitario * quantidade;

        if (valorCliente < valorTotal) {
            System.out.println("Valor insuficiente: faltam " + String.format("%.2f", (valorTotal - valorCliente)) + "R$");
        } else {
            System.out.println("Troco: " + String.format("%.2f", (valorCliente - valorTotal)) + "R$");
        }

        sc.close();
    }
}

// Problema "troco"
// Fazer um programa para calcular o troco no processo de pagamento de um produto
// de uma mercearia.O programa deve ler o preço unitário do produto, a quantidade
// de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente
// (suponha que haja dinheiro suficiente). Seu programa deve mostrar o valor do
// troco a ser devolvido ao cliente.

import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("preço do produto: ");
        float preco = sc.nextFloat();

        int qtd = sc.nextInt();

        float valorTotal = preco * qtd;

        System.out.print("pagamento do cliente: ");
        float pagamentoCliente = sc.nextInt();

        System.out.println("o troco é: " + (pagamentoCliente - valorTotal));

        sc.close();
    }
}

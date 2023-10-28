// Fazer um programa para ler as medidas da largura e comprimento de um terreno
// retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
// com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
// terreno, bem como o valor do preço do terreno, ambos com duas casas decimais
// conforme exemplo.
import java.util.Scanner;
import java.util.Locale;

public class terreno {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura: ");
        float largura = sc.nextFloat();
        System.out.print("Digite o comprimento: ");
        float comprimento = sc.nextFloat();
        System.out.print("Digite o valor do metro quadrado: ");
        float valorMetro = sc.nextFloat();
        
        float area = largura * comprimento;
        float valorTotal = area * valorMetro;

        System.out.println("A área total do terreno é: " + String.format("%.2f", area));
        System.out.println("O valor total do terreno é: " + String.format("%.2f", valorTotal));

        sc.close();
    }
}
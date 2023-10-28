// Problema "pagamento"
// Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a)
// recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final,
// mostrar o valor do pagamento do funcionário com uma mensagem explicativa
// conforme exemplo.
import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite quanto ele recebe por hora: ");
        float valorHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        float valorTotal = valorHora * horasTrabalhadas;
        System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", valorTotal));
        sc.close();
    }
}

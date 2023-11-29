import java.util.Locale;
import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();
        double novoSalario = 0.0;
        double p = 0.0;

        if (salario <= 1000) {
            p = 0.2;
            novoSalario = salario + (salario * p);
        } else if (salario > 1000 && salario <= 3000) {
            p = 0.15;
            novoSalario = salario + (salario * p);
        } else if (salario > 3000 && salario <= 8000) {
            p = 0.10;
            novoSalario = salario + (salario * p);
        } else if (salario > 8000) {
            p = 0.05;
            novoSalario = salario + (salario * p);
        }

        System.out.println("Novo salário: " + novoSalario);
        System.out.println("Aumento: " + (novoSalario - salario));
        System.out.println("Porcentagem: " + (p * 100) + "%");

        sc.close();
    }
}

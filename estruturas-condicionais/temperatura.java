// Problema "temperatura"
// Deseja-se converter uma medida de temperatura da escala Celsius para
// Fahrenheit ou vice-versa. Para isso, você deve construir um programa
// que leia a letra "C" ou "F" indicando em qual escala vai ser informada
// uma temperatura. Em seguida o programa deve mostrar a temperatura na
// outra escala com duas casas decimais. A seguir é dada a fórmula para
// converter de Fahrenheit para Celsius (você devededuzir a fórmula de
// Celsius para Fahrenheit): C = 5/9(f - 32)

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a escala (C para Celsius ou F para Fahrenheit): ");
        char escala = scanner.next().charAt(0);

        System.out.print("Informe a temperatura: ");
        double temperatura = scanner.nextDouble();

        double temperaturaConvertida = 0.0;

        if (escala == 'C' || escala == 'c') {
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", temperaturaConvertida);
        } else if (escala == 'F' || escala == 'f') {
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.printf("A temperatura em Celsius é: %.2f°C%n", temperaturaConvertida);
        } else {
            System.out.println("Escala inválida. Use 'C' ou 'F'.");
        }

        scanner.close();
    }
}


// Problema "notas"
// Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
// segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final
// que o aluno obteve (com uma casa decimal) no ano juntamente com um texto
// explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
// mensagem "REPROVADO", conforme exemplos. 
import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Nota final = " + String.format("%.1f", media));

        if (media < 60) {
            System.out.println("Reprovado.");
        }else {
            System.out.println("Aprovado.");
        }
        sc.close();
    }
}
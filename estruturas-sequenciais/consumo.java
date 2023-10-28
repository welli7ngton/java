// Problema "consumo"
// Fazer um programa para ler a distância total (em km) percorrida por um carro
// bem como o total de combustível gasto por este carro ao percorrer tal distância.
// Seu programa deve mostrar o consumo médio do carro, com três casas decimais. 
import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        float distancia = sc.nextFloat();

        System.out.print("Digite o combustível gasto na viagem: ");
        float combustivelGasto = sc.nextFloat();

        System.out.println("A média de combustível gasto é: " + String.format("%.3f",(distancia / combustivelGasto)));
        sc.close();
    }
}

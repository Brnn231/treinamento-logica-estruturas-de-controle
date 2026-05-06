
import java.util.Scanner;

public class somaAteNegativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n;
        double soma = 0; 
       do {
        System.out.println("Digite os números positivos para somar e qualquer negativo para sair:");
        n = ler.nextDouble();

        if (n < 0){
             break;
        }else{
        soma += n;
        System.out.printf("A soma é: %.2f\n",soma);
            }
        }while (n >= 0);
        ler.close();
    }
}
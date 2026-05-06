
import java.util.Scanner;

public class verificarMaior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double maior = -999999999, valor;
        for (int i = 1; i <= 10; ++i) {
            valor = ler.nextDouble();
            if (valor > maior)
                maior = valor;
        }
        System.out.println(maior + " é o número maior");
        ler.close();
    }
}

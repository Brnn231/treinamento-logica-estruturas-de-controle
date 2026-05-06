
import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if (n >= 0 && n <= 10) {
            System.out.println("Seu número está entre 0 e 10");
            if (n % 2 == 0)
                System.out.printf("Seu número: %d é par\n", n);
            else
                System.out.printf("Seu número: %d é ímpar\n", n);
        } else {
            System.out.println("Seu número não está entre 0 e 10");
            if (n % 2 == 0)
                System.out.printf("Seu número: %d é par\n", n);
            else
                System.out.printf("Seu número: %d é ímpar\n", n);
        }
        ler.close();
    }
}

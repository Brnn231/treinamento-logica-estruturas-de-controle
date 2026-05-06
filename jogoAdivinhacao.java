
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhação {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        int tentativas, numGer, numUser;
        System.out.println("Número gerado entre 0 e 100!!!!");
        numGer = gerador.nextInt(101);
        for (tentativas = 10; tentativas >= 1; --tentativas) {
            System.out.printf("Você tem %d tentiva(s)\n", tentativas);
            System.out.println("Tente adivinhar!!!!");
            numUser = ler.nextInt();
            if (numUser > numGer) {
                System.out.println("O número gerado é menor\n");
            } else if (numUser < numGer) {
                System.out.println("O número gerado é maior\n");
            } else {
                System.out.println("Parabéns você acertou o número!!!!!");
                break;
            }

        }
        if (tentativas == 0)
            System.out.println("Acabou suas chances!!!!\nVocê perdeu!!!!!!!!!!!");
        ler.close();
    }
}

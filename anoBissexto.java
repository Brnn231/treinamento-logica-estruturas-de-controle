
import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano = ler.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.printf("O ano %d é bissexto\n",ano);
        }else
            System.out.printf("O ano %d não é bissexto\n",ano);
    }
}

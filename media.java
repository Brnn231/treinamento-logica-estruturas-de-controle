
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        double nota, media = 0;
        for(; i < 2; i++){
            nota = ler.nextDouble();
            media += nota;
        }
        media /= i;
        if (media >= 7){
            System.out.println("Aprovado");
            System.out.printf("Media final: %.2f",media);
        }
        else if (media >= 4 && media < 7){
            System.out.println("Recuperação");
            System.out.printf("Media final: %.2f",media);
        }
        else{
            System.out.println("Reprovado");
            System.out.printf("Media final: %.2f",media);
        }
        ler.close();
    }
}

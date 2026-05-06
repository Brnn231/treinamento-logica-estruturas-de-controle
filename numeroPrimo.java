
import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int primo = ler.nextInt(), div = 2;
        boolean ePrimo = true;
        while(div <= Math.sqrt(primo) && ePrimo){
            ePrimo = true;
            if(primo % div == 0){
                ePrimo = false;
                System.out.println("O número não é primo");
            }
            ++div;
        }
        if (primo <= 1) 
            System.out.println("O número não é primo");
        else if (ePrimo)
            System.out.println("O número é primo");
    }
}

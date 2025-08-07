package exercises2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int initialNumber,nNumber;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Insira um número inicial: ");
            initialNumber = scanner.nextInt();

            while (true){
                System.out.println("Insira outro número: ");
                nNumber = scanner.nextInt();

            if (nNumber <= initialNumber){
                System.out.printf("O segundo número deve ser maior que %s.",initialNumber);
            }else if (nNumber%initialNumber == 0){
                System.out.println("O resto da divisão é igual a zero. Tente novamente");
            }else{
                break;
            }    
            }

            if (nNumber%initialNumber != 0) {
                System.out.printf("Os números informados são válidos, pois tem o resto da divisão: %s. O valor é diferente de zero.\n",nNumber%initialNumber);
            }
    }
    
}

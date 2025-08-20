package exercises2;

import java.util.Scanner;

public class WageTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tax;

        System.out.println("Insira o salário bruto do funcionário: ");
            float bruteWage = scanner.nextFloat();
        System.out.println("Insira o adicional de benefícios: ");
            float addit = scanner.nextFloat();

        if (bruteWage >= 0 && bruteWage <= 1100){
             tax = 0.05f * bruteWage;
        } else if (bruteWage >= 1100.01 && bruteWage <= 2500.00){
             tax = 0.10f * bruteWage;
        } else {
             tax = 0.15f * bruteWage;
        }   

        float lwage = (bruteWage - tax) + addit;

        System.out.printf("%.2f",lwage);
    }
}

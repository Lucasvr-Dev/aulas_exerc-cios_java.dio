package exercises2;

import java.util.Scanner;

public class SmartDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double productValue = scanner.nextDouble();
        double discountPercentage = scanner.nextDouble();
        
        if (discountPercentage < 0 || discountPercentage > 100){
          System.out.println("Desconto inválido!");
        }else{
            double valorFinal = productValue - ((discountPercentage/100)*productValue);  
            System.out.printf("%.2f",valorFinal);
        }
    }
}
package exercises2;

import java.util.Scanner;

public class ImcCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        var height = scanner.nextFloat();
        System.out.println("Informe o seu peso: ");
        var weight = scanner.nextFloat();

        var imc = weight/(height*height);

        if (imc <= 18.5){
            System.out.printf("Seu IMC é de: %.2f, você está abaixo do peso!\n",imc);

        } else if(imc >= 18.5 && imc <= 24.99) {
            System.out.printf("Seu IMC é de: %.2f, você está com o peso ideal!\n",imc);

        } else if(imc >= 25 && imc <= 29.99) {
            System.out.printf("Seu IMC é de: %.2f, você está levemente acima do peso!\n",imc);

        } else if(imc >= 30 && imc <= 34.99) {
            System.out.printf("Seu IMC é de: %.2f, você está com obesidade grau I\n",imc);

        } else if(imc >= 35 && imc <= 39.99) {
            System.out.printf("Seu IMC é de: %.2f, você está com obesidade grau II (Severa)\"\n",imc);

        } else {
            System.out.printf("Seu IMC é de: %.2f, você está com obesidade grau III (Mórbida)\"\n",imc);
        }  
    }
}

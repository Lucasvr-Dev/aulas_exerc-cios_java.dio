package exercises_web;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var firstNumber = scanner.nextInt();
        System.out.println("informe o segundo número: ");
        var secondNumber = scanner.nextInt();
        
        if (firstNumber > secondNumber) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (secondNumber > firstNumber) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}

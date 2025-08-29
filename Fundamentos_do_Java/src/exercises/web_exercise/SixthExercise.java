package exercises.web_exercise;

import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var firstNumber = scanner.nextFloat();
        System.out.println("Informe o segundo número: ");
        var secondNumber = scanner.nextFloat();
        System.out.println("Informe a operação desejada (+,-,*,/); ");
        switch (scanner.next()) {

            case "+" -> System.out.printf("O resultado de: %s + %s é %s \n", firstNumber, secondNumber,firstNumber + secondNumber);
            case "-" -> System.out.printf("O resultado de: %s - %s é: %s\n",firstNumber,secondNumber,firstNumber - secondNumber);
            case "*" -> System.out.printf("O resultado de: %s * %s é: %s\n",firstNumber,secondNumber,firstNumber * secondNumber);
            case "/" -> {

                if (secondNumber == 0) {
                    System.out.println("A divisão por zero não é permitida. ");
                } else {
                    System.out.printf("O resultado de: %s / %s é: %.2f\n",firstNumber,secondNumber, firstNumber / secondNumber);
                }
            }

            default -> System.out.println("Operação inválida.");
        }
    }       
}

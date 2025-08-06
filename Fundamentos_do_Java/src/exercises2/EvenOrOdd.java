package exercises2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int firstNumber,secondNumber; //deve declarar antes do laço interno.
        String decision;

        while (true) {

        System.out.println("Informe o primeiro número: ");
        firstNumber = scanner.nextInt();
        System.out.println("Informe o segundo número (deve ser maior que o primeiro): ");
        secondNumber = scanner.nextInt();

        if (secondNumber <= firstNumber) {
            System.out.println("O segundo número deve ser maior! Por favor, tente novamente.");
        
        }else{
            break;
        }
        }   

        while (true){

        System.out.println("Escolha entre Par ou Impar: ");
        decision = scanner.next();

        if (
            !decision.equalsIgnoreCase("par") &&
            !decision.equalsIgnoreCase("impar")
           ) {
            System.out.println("Você deve escolher entre par ou impar ");    
        } else {
            break;
        }
        }
        
        if (decision.equalsIgnoreCase("par")){
            for (var inicial = secondNumber; inicial >= firstNumber; inicial--){
                if (inicial%2 == 0 || inicial == inicial || inicial == firstNumber){
                    System.out.println(inicial);
                } else {
                    continue;
                }
            }
        }else{
            for (var inicial = secondNumber; inicial >= firstNumber; inicial--){
                if(inicial%2 == 1 || inicial == inicial ||inicial == firstNumber){
                    System.out.println(inicial);
                }else{
                    continue;
                }
            }
        }
    }
}


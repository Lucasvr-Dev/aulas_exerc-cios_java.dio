package exercises.web_exercise;

import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Até quanto você quer contar?");
        var input = scanner.nextLine();

        int count;

        try{
            count = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um número válido");
            return;
        }

        for ( var number = 1; number <= count; number++){
            System.out.println(number);
        }

        /*outra forma de fazer:

        for (var number = 1; number <= count; number++)
            System.out.println(number); MAIS RÁPIDO E PRÁTICO
        */
        
    }
}

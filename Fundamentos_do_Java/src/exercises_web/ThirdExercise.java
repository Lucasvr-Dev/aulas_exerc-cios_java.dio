package exercises_web;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        
        if (number % 2 == 0){
            System.out.printf("O número %s é par.\n", number);
        }else{
            System.out.printf("O número %s é impar.\n", number);
        }


    }
}
    

package exercises.web_exercise;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        var raio = scanner.nextInt();
        var area = 3.14 * (raio * raio);
        System.out.printf("A área do círculo é igual a: %.2f\n",area);

        /*outra forma de fazer:

        var scanner = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        var raio = scanner.nextInt();
        var area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é igual a: %.2f\n",area);
        
        */
    }
}

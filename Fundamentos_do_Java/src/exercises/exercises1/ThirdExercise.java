package exercises.exercises1;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retângulo: ");
        var base = scanner.nextFloat();
        System.out.println("informe a altura do retângulo: ");
        var height = scanner.nextFloat();
        var area = base * height;
        System.out.printf("A área do retângulo é %s. \n", area);
    }
}

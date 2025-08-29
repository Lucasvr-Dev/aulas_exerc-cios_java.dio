package exercises.exercises1;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanhao do lado de um quadrado: ");
        var side = scanner.nextFloat();
        var area = side * side;
        System.out.printf("A área do quadrado é %s.\n", area);

    }
}

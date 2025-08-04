package exercises1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);

        System.out.println("Olá! informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe seu ano de nascimento: ");
        var yearOfBirth = scanner.nextInt();

        var age = baseYear - yearOfBirth;

        System.out.printf("Olá %s, você tem %s anos.\n", name, age);
    }
}

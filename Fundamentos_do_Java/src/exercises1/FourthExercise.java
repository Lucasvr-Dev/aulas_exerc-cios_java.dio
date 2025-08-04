package exercises1;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a idade da primeira pessoa: ");
        var age1 = scanner.nextInt();
        System.out.println("Informe a idade da segunda pessoa: ");
        var age2 = scanner.nextInt();
        var dif = Math.abs(age1 - age2);
        System.out.printf("A diferença de idade é de %s anos. \n",dif);
    }
}

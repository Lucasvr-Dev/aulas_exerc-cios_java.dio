package exercises.web_exercise;

import java.util.Scanner;

public class FifithExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        var firstNote = scanner.nextFloat();
        System.out.println("Informe a segunda nota do aluno: ");
        var secondNote = scanner.nextFloat();

        var avg = (firstNote + secondNote) / 2;

         if (avg >= 6) {
            System.out.printf("O aluno foi aprovado com média : %s \n" ,avg);
         }else {
            System.out.printf("O aluno foi reprovado com média: %s \n ",avg);
         }

    }
}

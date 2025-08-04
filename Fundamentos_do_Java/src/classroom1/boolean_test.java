package classroom1;
import java.util.Scanner;

public class boolean_test {

    private final static String AGE_STRING = "Quantos anos você tem?";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(AGE_STRING);
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated && age >=16;
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}

//this code demonstrates the use of logical operators (|| <Or> and && <and>) in Java to determine if a person can drive based on their age and emancipation status.
// The code checks if the person is at least 18 years old or if they are emancipated and at least 16 years old.
// It then prints whether the person can drive based on these conditions.


/* 
!= diferente
== igual
> maior que
< menor que
>= maior ou igual
<= menor ou igual
*/
package classrooms.classroom1;
import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe o primeiro número: ");
        var firstNumber = scanner.nextFloat();
        System.out.println("informe o primeiro número: ");
        var secondNumber = scanner.nextFloat();
        var sum = firstNumber + secondNumber;
        System.out.printf("%s + %s = %s \n", firstNumber, secondNumber, firstNumber / secondNumber);
        
        }
}
        

/*  This code prompts the user to input two numbers and then calculates and prints their sum.  

var value = 5;
value += 10; //value = value + 10;

System.out.printf("O resultado da soma de %s e %s é: %s \n", firstNumber,secondNumber,sum); 
//This line formats the output to display the sum of the two numbers entered by the user.

System.out.println(firstNumber + " + "  +secondNumber+ " = " +(firstNumber+secondNumber));
//This code prompts the user to input two numbers and then calculates their sum.)

*/

package exercises_web;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius: ");
        var celsius =  scanner.nextFloat();
        var fahrenheit = (celsius * 1.8 )+ 32;
        System.out.printf("A temperatura em fahrenheit é %.2f\n",fahrenheit);
    }
}
package classrooms.classroom1;
import java.util.Scanner;

public class imc_calculator {
    public static void main(String[] args) { 
        var scanner = new Scanner(System.in); 
        System.out.print("Olá, informe o seu nome: ");
        var name = scanner.next();
        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s! sua idade é %s anos\n ",name,age);

       System.out.println("Informe seu peso: ");
        var weight = scanner.nextDouble();
       System.out.println("Informe sua altura: ");
       var height = scanner.nextDouble();
         var imc = weight / (height * height);
        
        if (imc < 18.5) {
            System.out.printf("Seu IMC é: %.2f\n",imc);
            System.out.println("Você está abaixo do peso;");
        } else if (imc >= 18.5 && imc < 24.99) {
            System.out.printf("Seu IMC é: %.2f\n",imc);
            System.out.println("Você está com o peso ideal");
            } else if (imc >= 25 && imc < 29.99) {
                System.out.printf("Seu IMC é: %.2f\n",imc);
                System.out.println("Você está com sobrepeso");
            }  else {
                System.out.printf("Seu IMC é: %.2f\n",imc);
                System.out.println("Você está com obesidade");
            
            }
    }
}
                
    
     
        

   

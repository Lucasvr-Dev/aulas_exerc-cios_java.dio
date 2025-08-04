package classroom2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
                name + ", você pode dirigir!":
                name + ", vcê não pode dirigir!"; 
        
        System.out.println(message);
        System.out.println("Fim da execução");
    }
}

/* 
 if ((age >= 18) || (age >= 16 && isEmancipated)) { (uma forma de fazer)
        System.out.printf("%s, você tem %s anos e pode dirigir!\n",name);

}else if (age >= 16 && isEmancipated){ (outra forma de fazer a mesma coisa)
        System.out.printf("%s, apesar de ser menor, você é emancipado e pode dirigir!\n",name);

} else {
       System.out.printf("%s, você não pode dirigir!\n",name);
      }
*/            
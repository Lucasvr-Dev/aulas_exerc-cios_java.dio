package classroom2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        var message = switch(option){

            case 1, 7 -> {
                var day = option == 1 ? 
                "Domingo" :
                "Sábado";
                yield String.format("Hoje é %s, fim de semana uhuul \\o/",day);
            }
            //Usando yield para retornar uma string
            //O yield é usado para retornar um valor de um bloco de código dentro do switch.
            //O yield é necessário quando se usa blocos de código com chaves.
            //Caso contrário, pode-se retornar diretamente uma string.
            
            case 2 -> ("Segunda");
            case 3 -> ("Terça");
            case 4 -> ("Quarta");
            case 5 -> ("Quinta");
            case 6 -> ("Sexta");
            default -> ("Opção inválida");

        };    
            System.out.println(message);


            /* 
            case 1, 7 -> System.out.println("Fim de semana uhuul \\o/");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opção inválida");

            //Dessa forma não precisa do break, pois o switch já termina aqui.
            */
            
            /* 
            case 1:
            case 7:
                System.out.println("Fim de semana uhuul \\o/");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida");
        
            */
        

    }
}

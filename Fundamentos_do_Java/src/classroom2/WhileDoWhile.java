package classroom2;

import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var name = "";
        while (!name.equalsIgnoreCase("exit")){
            System.out.println("Informe um nome:");
            name = scanner.next();
            System.out.println(name);
        }


    }
}

/*
    do {
        System.out.println("Informe um nome:");
        name = scanner.next();
        System.out.println(name);

    } while (!name.equalsIgnoreCase("exit"));



    while (true) {
        System.out.println("Informe um nome:");
        name = scanner.next();
        System.out.println(name);

        if (name.equalsIgnoreCase("exit")) break;
    }



    while (!name.equals("exit")) {
        System.out.println("Informe um nome");
        name = scanner.next();
        System.out.println(name);
            
    } 
 */
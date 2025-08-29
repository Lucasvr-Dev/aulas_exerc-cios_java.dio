package poo.exercise_car;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();
        int test;
        
        System.out.println("Criando seu carro...");
        myCar.createCar();
        System.out.println("Carro criado!");

        while (true) {
            System.out.println("Teste seu carro:\n ");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar carro");
            System.out.println("4 - Frear carro");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar de marcha");
            System.out.println("0 - Sair");
            test = scanner.nextInt();

            switch (test) {
                case 0 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
                case 1 -> myCar.turnCarOn();
                case 2 -> myCar.turnCarOff();
                case 3 -> myCar.accelerateCar();
                case 4-> myCar.slowDown();
                case 5 -> myCar.turnCarRL();
                case 6 -> myCar.verifySpeed();
                case 7 -> myCar.switchMarch();
            }

        }

    }
    
}

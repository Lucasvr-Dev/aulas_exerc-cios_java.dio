package poo.exercise_car;

import java.util.Scanner;

public class car extends vehicle {

    private int speed,march;
    private boolean turnOnOff,turnLeft,turnRight; //Declarando variáveis que usarei no projeto (atributos)
    Scanner scanner = new Scanner(System.in);

    //Construtores

    public car() {

    }

    public car(int speed, int march, boolean turnOnOff, boolean turnLeft, boolean turnRight, Scanner scanner) {
        this.speed = speed;
        this.march = march;
        this.turnOnOff = turnOnOff;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
        this.scanner = scanner;
    }

    //Getters e Setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMarch() {
        return march;
    }

    public void setMarch(int march) {
        this.march = march;
    }

    public boolean isTurnOnOff() {
        return turnOnOff;
    }

    public void setTurnOnOff(boolean turnOnOff) {
        this.turnOnOff = turnOnOff;
    }

    public boolean isTurnLeft() {
        return turnLeft;
    }

    public void setTurnLeft(boolean turnLeft) {
        this.turnLeft = turnLeft;
    }

    public boolean isTurnRight() {
        return turnRight;
    }

    public void setTurnRight(boolean turnRight) {
        this.turnRight = turnRight;
    }

    //Métodos

    public void createCar(){ //Criando carro

        System.out.println("Insira o ano do carro: "); //Inserindo valores aos atributos extendidos 
        ano = scanner.nextInt();
        System.out.println("Insira o modelo do carro: ");
        model = scanner.nextLine();
        System.out.println("Insira a marca do seu carro: ");
        marca =  scanner.nextLine();

        this.turnOnOff = false; //Declarando valores aos atributos da classe
        this.march = 0;  
        this.speed = 0;      

    }

    public void turnCarOn(){ //Ligando carro
        if (turnOnOff != true){ //Se a variável retornar o valor booleano diferente de true (false), então o sistema entende que ele está desligado.
            System.out.println("Ligando carro!...");
        }else{
            System.out.println("Seu carro já está desligado!");
        }

    }

    public void turnCarOff(){ //Desligando carro
        if (turnOnOff == true && march == 0){
            System.out.println("Desligando carro!... ");
        }else{
            System.out.println("Seu carro já está desligado!");//Se a variável retornar o valor booleano diferente de false (true), então o sistema entende que ele está ligado.
        }
    }

    public void accelerateCar(){ //Acelerando carro
        if (speed >= 0 && speed <= 120){ //Checa se a velocidade está dentro dos parâmetros (min e max)
            speed += 1; //Caso a velocidade esteja de acordo, acrescenta +1 na variável de velocidade.
            System.out.println("Acelerando...");
        }else{
            System.out.println("Limite de velocidade!");
        }
    }

    public void slowDown(){ //Desacelerando carro
        if (speed > 0 && speed <= 120){ //Checa se a velocidade está dentro dos parâmetros (min e max)
            speed -= 1; //Caso a velocidade esteja de acordo, decrementa -1 na variável de velocidade.
            System.out.println("Reduzindo...");
        }else{
            System.out.println("Sem aceleração no motor.");
        }
    }

    public void turnCarRL(){ //Virando carro para direita/esquerda

        while (true){//Enquanto verdade executa o código.

        System.out.println("Para que lado deseja virar? (D/E)");
        String turnDecision = scanner.next(); //Armazenando a decisão de qual lado virar


            if (turnDecision.equalsIgnoreCase("D")){ //Verifica se a decisão foi D, (ignora case da resposta)

                if (speed >= 1 && speed <= 40){ //Checa se a velocidade está dentro dos parâmetros, caso esteja, vira a direta
                    System.out.println("Virando para a direta!");
                    break; //Encerra a repetição

                }else if(speed == 0){ 
                    System.out.println("Você deve atingir a velocidade mínima para virar a direita!");
                    break; 

                }else{
                    System.out.println("Diminua para virar a direta!");
                    break;
                }

            }else if (turnDecision.equalsIgnoreCase("E")){ //Verifica se a decisão foi E, (ignora case da resposta)
                if (speed >= 1 && speed <= 40){ //Checa se a velocidade está dentro dos parâmetros, caso esteja, vira a esquerda
                System.out.println("Virando a esquerda!");
                    break;

                }else if (speed == 0){
                    System.out.println("Você deve atingir a velocidade mínima para virar a esquerda!");
                    break;

                }else{
                    System.out.println("Diminua para virar a esquerda");
                    break;
                }

            }else{
                System.out.println("Resposta inválida!"); 
                continue; //Caso a resposta seja diferente de "D" ou "E", o laço retorna para a pergunta
            }
        }
    }

    public void verifySpeed(){
        System.out.printf("Velocidade atual: %d",getSpeed());
    }

    public void switchMarch(){
        
    }
}

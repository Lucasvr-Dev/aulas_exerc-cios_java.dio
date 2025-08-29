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
        model = scanner.next();
        System.out.println("Insira a marca do seu carro: ");
        marca =  scanner.next();

        this.turnOnOff = false; //Declarando valores aos atributos da classe
        this.march = 0;  
        this.speed = 0;      

    }

    public void turnCarOn(){ //Ligando carro
        if (turnOnOff != true){ //Se a variável retornar o valor booleano diferente de true (false), então o sistema entende que ele está desligado.
            System.out.println("Ligando carro!...");
            System.out.println("Carro ligado!");
            turnOnOff = true;
        }else{
            System.out.println("Seu carro já está ligado!");
        }

    }

    public void turnCarOff(){ //Desligando carro

        if (turnOnOff != false && march == 0 && speed == 0){ //Checa se o carro está ligado, se a marcha está em neutro e se a velocidade é igual a 0.

            System.out.println("Desligando carro!... ");//Se a variável retornar o valor booleano igual a true, então o sistema entende que ele está ligado.
            System.out.println("Carro desligado!");//Desliga o carro
            turnOnOff = false; //Atribui o valor booleano false a variável, indicando que o carro está desligado.

        }else if(turnOnOff != true && march == 0 && speed == 0){ //Checa se o carro está desligado, se a marcha está em neutro e se a velocidade é igual a 0.
            System.out.println("Seu carro já está desligado!");//Caso a variável retorne false, o sistema entende que o carro já está desligado.
            
        }
    }

    public void accelerateCar(){ //Acelerando carro

        int maxSpeed;

        if (speed > 0 && speed < 20 && march == 1){ //Checa se a velocidade está dentro dos parâmetros (min e max)

            speed += 1; //Caso a velocidade esteja de acordo, acrescenta +1 na variável de velocidade.
            speed = Math.min(speed,20);
            System.out.println("Acelerando...");

        }else if (speed >= 20 && speed < 40 && march == 2){ 

            speed += 1; 
            speed = Math.min(speed,40);
            System.out.println("Acelerando...");    

        }else if (speed >= 40 && speed < 60 && march == 3){ 

            speed += 1; 
            speed = Math.min(speed,60);
            System.out.println("Acelerando...");   
            
        }else if (speed >= 60 && speed < 80 && march == 4){ 

            speed += 1; 
            speed = Math.min(speed,80);
            System.out.println("Acelerando...");

        }else if (speed >= 80 && speed < 100 && march == 5){ 

            speed += 1; 
            speed = Math.min(speed,100);
            System.out.println("Acelerando...");   
            
        }else if (speed >= 100 && speed < 120 && march == 6){ 

            speed += 1; 
            speed = Math.min(speed,120);
            System.out.println("Acelerando...");      

        }else if (speed == 0 && march != 0){
                speed += 1;
                System.out.println("Acelerando...");;

        }else if (speed == 0 && march == 0) {
                    System.out.println("Você deve engatar uma marcha para acelerar!");
                
        }else if (speed == 120){
            System.out.println("Limite de velocidade!");
        }else{
            System.out.println("Troque a marcha para acelerar!");
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

    public void verifySpeed(){ //Verifica a velocidade atual
        System.out.printf("Velocidade atual: %dKm/h\n",getSpeed());
    }

    public void switchMarch(){ //Trocando de marcha
        System.out.println("Escolha a marcha:\n ");

        System.out.println("1   2   3");
        System.out.println("|   |   |");
        System.out.println("|---0---|");
        System.out.println("|   |   |");
        System.out.println("4   5   6");
        this.march = scanner.nextInt();

        switch (this.march) {

            case 0 -> {
                System.out.println("(N)");

            }

            case 1 -> {
                if (speed >= 0 && speed <= 20) {
                    System.out.println("(1)"); 
                } else {
                    System.out.println("Sua velocidade deve estar entre 0 e 20Km/h");
                }    
            }    
            
            case 2 -> {
                if (speed >= 20 && speed <= 40) {
                    System.out.println("(2)");
                } else {
                    System.out.println("Sua velocidade deve estar entre 21 e 40Km/h");
                }
            }

            case 3 -> {
                if (speed >= 40 && speed <= 60) {
                    System.out.println("(3)");
                } else {
                    System.out.println("Sua velocidade deve estar entre 41 e 60Km/h");
                }
            }

            case 4 -> {
                if (speed >= 60 && speed <= 80) {
                    System.out.println("(4)");
                } else {
                    System.out.println("Sua velocidade deve estar entre 61 e 80Km/h");
                }
            }

            case 5 -> {
                if (speed >= 80 && speed <= 100) {
                    System.out.println("(5)");
                } else {
                    System.out.println("Sua velocidade deve estar entre 81 e 100Km/h");
                }
            }

            case 6 -> {
                if (speed >= 100 && speed <= 120) {
                    System.out.println("(6)");
                } else {
                    System.out.println("Sua velocidade deve estar entre 101 e 120Km/h");
                }
            
            }
        }
    }
}

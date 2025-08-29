package poo.exercises.account_exercise;

import java.util.Scanner;

public class BankAccount {
    
    int id,password,year;
    String name;
    private double balance,specialCheck,initialSpecialCheck,deposit,checkTax;
    Scanner scanner = new Scanner(System.in);
    
    BankAccount(){

    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getSpecialCheck() {
        return specialCheck;
    }
    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }

    public void createAccount(){
        

        System.out.println("Informe seu nome completo: ");
        this.name = scanner.nextLine();
        System.out.println("Informe seu ano de nascimento: ");
        this.year = scanner.nextInt();
        System.out.println("Crie uma senha (a senha deve conter 6 dígitos): ");
        this.password = scanner.nextInt();

        while (true){    
            System.out.println("Informe quanto deseja depositar! ");
            this.deposit = scanner.nextDouble();

            if (deposit <= 0){
                System.out.println("Valor mínimo de R$50! Por favor, tente novamente.");
                continue;

            }else if (deposit > 0 && deposit <= 500){
                this.initialSpecialCheck = 50;
                this.balance += deposit;
                this.specialCheck = this.initialSpecialCheck;
                deposit = 0;
                break;
                
            }else{
                this.specialCheck = deposit/2;
                this.balance += deposit;
                deposit = 0;
                break;
            }
        }
    }  

    public void checkBalance(){
        System.out.printf("Seu saldo é de: R$%S\n", getBalance());
    }

    public void specialCheckInquiry(){
        System.out.printf("Seu cheque especial é de: R$%s \n",getSpecialCheck());
    }

    public void depositMoney(){
            
        String decisionDep;

        while (true) {
            
            System.out.println("Quanto você deseja depositar? ");
            this.deposit = scanner.nextDouble();

            if (this.deposit <= 0){
                System.out.println("Valor mínimo de R$1! Por favor, tente novamente.");
                continue;
            }else{    
                System.out.printf("Você tem certeza de que deseja realizar o depósito no valor de R$%.2f? (S/N)\n",deposit);
                decisionDep = scanner.next();
                break;
            }   
        }     

        if (decisionDep.equalsIgnoreCase("S")){

            if (this.balance < 0) {
                double fee = Math.abs(this.balance) * 0.20; // taxa de 20% sobre a dívida
                double totalDebt = Math.abs(this.balance) + fee;

                if (this.deposit < totalDebt) {
                    this.balance += this.deposit; // diminui a dívida
                    this.checkTax = Math.abs(this.balance);
                    System.out.printf("Depósito usado para reduzir dívida. Saldo atual: R$%.2f\n", this.balance);
                    
                } else {
                    this.balance += this.deposit; 
                    this.checkTax = initialSpecialCheck; // dívida quitada
                    this.specialCheck = initialSpecialCheck; // restaura cheque especial
                    System.out.printf("Depósito de R$%.2f realizado com sucesso!\n", deposit);
                    System.out.printf("Dívida quitada! Saldo atualizado: R$%.2f\n", this.balance);
                    
                } 
            }else if (this.balance >= 0 && this.specialCheck == initialSpecialCheck ) {
                this.balance += this.deposit;
                System.out.printf("Depósito de R$%.2f realizado com sucesso!\n", deposit);
            }
        }    
    }           

    public void withdrawMoney(){

        double withdrawValue;

        System.out.println("Quanto você deseja sacar? ");
        withdrawValue = scanner.nextDouble();

        while (true){
            System.out.println("Insira sua senha: ");

            int withdrawPassword = scanner.nextInt();

            if (withdrawPassword != this.password) {
                System.out.println("Senha incorreta, tente novamente!");
                continue;

            }else{
                if (withdrawValue <= this.balance){

                    this.balance -= withdrawValue;
                    System.out.println("Saque realizado!");
                    break;

                }else{

                    System.out.println("Você não dispõe desse valor! Deseja usar seu cheque especial? (S/N)");
                    String decisionWithdraw = scanner.next();

                    if (decisionWithdraw.equalsIgnoreCase("S")) {

                        this.balance -= withdrawValue; // ! saldo pode ficar negativo
                        this.checkTax = Math.abs(Math.min(this.balance,0));// dívida é o módulo do saldo negativo

                        if (this.checkTax > this.specialCheck) {
                        System.out.println("Limite do cheque especial excedido!");
                        this.balance += withdrawValue; // desfaz operação
                        break;

                    } else {
                        System.out.println("Saque realizado com sucesso usando cheque especial!");
                        this.specialCheck -= Math.abs(this.balance);
                        break;
                        }
                    }
                }
            }
        }
    }

    public void payBill(){

        System.out.println("Insira o código de barras do boleto a ser pago: ");
        int bill = scanner.nextInt();
        System.out.println("Agora insira o valor do boleto: ");
        double valueBill = scanner.nextDouble();

        if (valueBill <= this.balance) {
            // precisa de cheque especial
            this.balance -= valueBill;
            System.out.println("Pagamento realizado com sucesso!");    
        }else{
            System.out.println("Você não possui esse valor em conta, deseja usar parte do cheque especial? (S/N)");
            String decisionCheck = scanner.next();

            if (decisionCheck.equalsIgnoreCase("S")) {

                double difference = valueBill - this.balance; // quanto falta além do saldo

                if (difference <= this.specialCheck) {
                    // usa saldo + cheque especial
                    this.balance -= difference ;
                    this.specialCheck -= difference; 
                    this.checkTax += difference; // acumula dívida
                    System.out.println("Pagamento realizado com sucesso!");
                } else {
                    System.out.println("Seu cheque especial não é o suficiente!");
                }
            }else{
                System.out.println("Operação cancelada.");
            }
        }
    }

    public void specialCheckInUse(){
        if (this.checkTax > 0) {
           System.out.println("Você está usando seu cheque especial!"); 
        }else{
           System.out.println("Você não está usando seu cheque especial");
        }
    }
    
}






package poo.exercise_account;

import java.util.Scanner;

public class BankAccount {
    
    int id,password,year;
    String name;
    double balance,specialCheck,deposit,withdraw,checkTax;
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

    public void criarConta(){
        while (true){

            System.out.println("Informe seu nome completo: ");
            this.name = scanner.nextLine();
            System.out.println("Informe seu ano de nascimento: ");
            this.year = scanner.nextInt();
            System.out.println("Crie uma senha (a senha deve conter 6 dígitos): ");
            this.password = scanner.nextInt();
            System.out.println("Informe quanto deseja depositar! ");
            this.deposit = scanner.nextDouble();

            if (deposit == 0){
                System.out.println("Valor mínimo de R$50! Por favor, tente novamente.");
                continue;

            }else if (deposit > 0 && deposit <= 500){
                this.specialCheck = 50;
                this.balance += deposit;
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
        System.out.printf("Seu saldo é de: %S", getBalance());
    }

    public void SpecialCheckInquiry(){
        getSpecialCheck();
    }

    public void depositMoney(){
        while (true) {
            
            System.out.println("Quanto você deseja depositar? ");
            this.deposit = scanner.nextDouble();
            System.out.printf("Você tem certeza de que deseja realizar o depósito no valor de R$%s? (S/N)\n",deposit);
            String decisionDep = scanner.next();

            if (decisionDep.equalsIgnoreCase("S")){
                if (this.checkTax != 0) {
                    
                double newTax = (this.checkTax / 100) * 20;
                double newDeposit = this.deposit - newTax;
                this.balance += this.deposit - newTax;
                this.checkTax -= newTax;
                
                System.out.printf("O valor de R$%s foi depositado com sucesso!\n",this.deposit);
                System.out.printf("Você havia usado o cheque especial. foram descontados R$%s (20%) do valor depositado.\n",newTax);
                break;
                }else{
                    this.balance += deposit;
                    System.out.printf("O valor de R$%s foi depositado com sucesso!\n",deposit);
                    break;
                }
            }else if (decisionDep.equalsIgnoreCase("N")){
                continue;
            }
        }
        
    }

    public void withdrawMoney(){

        System.out.println("Quanto você deseja sacar? ");
        this.withdraw = scanner.nextDouble();

        while (true){
            System.out.println("Insira sua senha: ");
            int withdrawPassword = scanner.nextInt();
            if (withdrawPassword != this.password) {
                System.out.println("Senha incorreta, tente novamente!");
                continue;
            }else{
                if (this.withdraw <= this.balance){
                    System.out.println("Saque realizado!");
                    this.balance -= this.withdraw;
                    break;
                }else{
                    System.out.println("Você não dispõe desse valor! Deseja usar seu cheque especial? (S/N)");
                    String decisionWithdraw = scanner.next();
                    if (decisionWithdraw.equalsIgnoreCase("S")) {
                    double newWithD = this.withdraw - this.balance;
                        if (newWithD <= this.specialCheck) {
                            this.specialCheck -= newWithD;
                            System.out.println("Saque realizado com sucesso!");
                            break;
                        }else{
                            System.out.println("Seu cheque especial não é suficiente, tente novamente.");
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

        while (true) {
            if (valueBill <= this.balance) {
                System.out.println("Pagamento realizado com sucesso!");
                this.balance -= valueBill;
                break;

            }else{
                System.out.println("Você não possui esse valor em conta, deseja usar parte do cheque especial? (S/N)");
                String decisionCheck = scanner.next();

                if (decisionCheck.equalsIgnoreCase("S")) {
                   double payment = (valueBill - this.balance); 
                   if (this.specialCheck >= payment) {
                       this.specialCheck -= payment;
                       this.checkTax = payment; 
                       System.out.println("Pagamento realizado com sucesso!");
                       this.balance = 0;
                   }else{
                    System.out.println("Seu cheque especial não é o suficiente!");
                    break;
                   }
                }

            }
        }
    }
}

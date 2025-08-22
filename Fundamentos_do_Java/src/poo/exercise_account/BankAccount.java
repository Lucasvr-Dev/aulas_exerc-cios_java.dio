package poo.exercise_account;

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

            if (deposit == 0){
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
            
            System.out.println("Quanto você deseja depositar? ");
            this.deposit = scanner.nextDouble();
            System.out.printf("Você tem certeza de que deseja realizar o depósito no valor de R$%.2f? (S/N)\n",deposit);
            String decisionDep = scanner.next();

            if (decisionDep.equalsIgnoreCase("S")){
                if (this.checkTax > 0) {
                double fee = this.checkTax * 0.20; 
                double totalDebt = this.checkTax + fee;

                if (this.deposit <= totalDebt) {
                    this.checkTax -= this.deposit;
                    System.out.printf("Depósito usado para reduzir dívida do cheque especial. Restante R$%2.f\n",this.checkTax);
                } else {
                    this.deposit -= totalDebt; // paga a dívida + taxa
                    this.specialCheck += this.checkTax;
                    this.checkTax = 0;
                    this.balance += this.deposit; // só o que sobra vai para saldo
                    System.out.printf("Dívida do cheque especial quitada! Saldo atualizado: R$%.2f\n", this.balance);
                }

            } else {
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
                    System.out.println("Saque realizado!");
                    this.balance -= withdrawValue;
                    break;

                }else{

                    System.out.println("Você não dispõe desse valor! Deseja usar seu cheque especial? (S/N)");
                    String decisionWithdraw = scanner.next();

                    if (decisionWithdraw.equalsIgnoreCase("S")) {
                    double newWithD = withdrawValue -  this.balance;

                        if (newWithD <= this.specialCheck) {
                            this.specialCheck -= newWithD;
                            this.checkTax += newWithD;
                            this.balance = 0;
                            System.out.println("Saque realizado com sucesso usando cheque especial!");
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

        if (valueBill <= this.balance) {
            System.out.println("Pagamento realizado com sucesso!");
            this.balance -= valueBill;

        }else{
            System.out.println("Você não possui esse valor em conta, deseja usar parte do cheque especial? (S/N)");
            String decisionCheck = scanner.next();

            if (decisionCheck.equalsIgnoreCase("S")) {

                double difference = valueBill - this.balance; // quanto falta para pagar

                if (this.specialCheck >= difference) {
                    this.specialCheck -= difference;   // desconta do cheque especial
                    this.checkTax += difference;       // acumula quanto foi usado do cheque especial
                    this.balance = 0;
                    System.out.println("Pagamento realizado com sucesso!");
                } else {
                    System.out.println("Seu cheque especial não é o suficiente!");
                }
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




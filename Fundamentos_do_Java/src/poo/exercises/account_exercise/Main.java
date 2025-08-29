package poo.exercises.account_exercise;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = new BankAccount();

        myAccount.createAccount();
        
        while (true) {
            
        
        System.out.println("====================TheBestBank=====================");
        System.out.printf("Bem-vindo, %s! Selecione o que deseja fazer: \n",myAccount.name);
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("7 - Sair\n");
        System.out.println("====================================================");
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> {
                myAccount.checkBalance();
                continue;
            }
            case 2 ->{
                myAccount.specialCheckInquiry();
            }
            case 3 -> {
                myAccount.depositMoney();
            }
            case 4 -> {
                myAccount.withdrawMoney();
            }
            case 5 -> {
                myAccount.payBill();
            }
            case 6-> {
                myAccount.specialCheckInUse();
            }
            case 7 ->{
                System.out.println("Obrigado pela preferência!");
                return;
            }
            }

        }
    }
}

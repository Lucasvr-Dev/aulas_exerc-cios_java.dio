package exercises2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        var number = scanner.nextInt();
        
        for (var table = 1;table <= 10; table++){
            System.out.printf("|%s x %s = %s \n",number,table,number*table);
        }    

        
    }
}


/*
var scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        var number = scanner.nextInt();

        System.out.printf("|%s x %s = %s|\n",number,1,number*1);
        System.out.printf("|%s x %s = %s|\n",number,2,number*2);
        System.out.printf("|%s x %s = %s|\n",number,3,number*3);
        System.out.printf("|%s x %s = %s|\n",number,4,number*4);
        System.out.printf("|%s x %s = %s|\n",number,5,number*5);
        System.out.printf("|%s x %s = %s|\n",number,6,number*6);
        System.out.printf("|%s x %s = %s|\n",number,7,number*7);
        System.out.printf("|%s x %s = %s|\n",number,8,number*8);
        System.out.printf("|%s x %s = %s|\n",number,9,number*9);
        System.out.printf("|%s x %s = %s|\n",number,10,number*10);
 */
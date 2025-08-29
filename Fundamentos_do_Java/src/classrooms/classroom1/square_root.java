package classrooms.classroom1;
import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        var number = scanner.nextInt();
        System.out.printf("A potência de %s é %s\n", number, Math.pow(number, 2));
        System.out.printf("A raiz quadrada de %s é %.2f\n",number, Math.sqrt(number));
    }
}

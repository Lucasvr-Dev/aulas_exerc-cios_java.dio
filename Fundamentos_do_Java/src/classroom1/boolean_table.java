package classroom1;
public class boolean_table {
    
    public static void main(String[] args) {
        System.out.printf("true  && true = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true  && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);
        System.out.println("===========================================");
        System.out.printf("true  || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true  || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("===========================================");
        System.out.printf("!true  = %s \n", !true );
        System.out.printf("!false = %s \n", !false );
    }
}
// This code demonstrates the use of logical AND operator (&&) in Java.
// It prints the results of various combinations of boolean values using the AND operator.
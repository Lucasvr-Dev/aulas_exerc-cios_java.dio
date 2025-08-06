package classroom2;

public class Structures {
    public static void main(String[] args) {
        var i = 0;
        while (args.length > i) {
            System.out.println(args[i]);
            i++;
            //Preciso rodar um código que não é uma lista, mas enquanto determinada opção não for atendida
        }
        i = 0;

        System.out.println("============================");

        /*
        for (int i = 0; i < args.length; i++) {
            //Fazer iterações em listas a partir de indicie (atende melhor quando você precisa ver em que indicie está)
        }

        for(var arg:args){
            //Mais simples, para quem não precisa ver em que indicie está
        }


        do {
            //Se precisar que o código rode pelo menos uma vez, usar essa opção

        } while (true);
         */
    }
}

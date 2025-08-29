package classrooms.classroom2;


public class For {

    public static void main(String[] args) {


        for (var i = 0; i < args.length; i++) {
            System.out.println((i+1) + " - " + args[i]);
          }  

        /*
        for (var arg: args){
            System.out.println(arg);
        }
         */
        
          
          /* Exemplo de configuração no launch.json
            {
                "type": "java",
                "name": "Launch Current File",
                "request": "launch",
                "mainClass": "classroom2.For",
                "args": "Lucas Vinicius Maria"
            }
                configurando argumentos no launch.json
           */     
            

        
        /*
        for (var i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
         */



        /*
        for (var i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 50) break;
        }
           */  


           /* 
           var scanner = new Scanner(System.in);
           for (;;) {
            System.out.println("Digite um nome: ");
            var name = scanner.next();
            
            if (name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
           }
            */
            

    }    
}
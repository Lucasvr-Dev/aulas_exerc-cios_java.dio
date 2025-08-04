package classroom1;
public class bitwise_operators {
    public static void main(String[] args) {
        var value1 = 9;
        var binary1 = Integer.toBinaryString(value1);
        
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n",value1,binary1);
        
        var value2 = 5 ;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n",value2,binary2);
        var result = value1 >>> value2; //Operador bitwise shift right, desloca os bits do número para a direita. 
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s << %s = %s (representação binária %s)\n", value1,value2,result,binaryResult);
    }
}

/*

 0 = false
 1 = true

---------EXEMPLO-----------
 110
 101 

 1000
   10
 1010
---------------------------

var result = value 1 >>> value2; Operador bitwise shift right, desloca os bits do número para a direita. 
var result = value1 >> value2; Operador bitwise shift right, desloca os bits do número para a direita e verifica se o número é positivo ou negativo. se for positivo, preenche com 0, se for negativo, preenche com 1.
var result = value1 << value2; Operador bitwise shift left, desloca os bits do número para a esquerda.
var result = value1 | value2;  Aqui, se um dos valores for verdadeiro, ele retorna verdadeiro.)
var result = value1 & value2;  Aqui, se qualquer um dos valores for falso, ele retorna falso.)
var result = value1 ^ value2;  Aqui, se os valores forem diferentes, ele retorna verdadeiro, se forem iguais, retorna falso.)

var binaryResult = Integer.toBinaryString(result);
System.out.printf("%s | %s = %s (representação binária %s) \n",value1,value2, result, binaryResult);

var result = ~value1; //Operador bitwise NOT, inverte os bits do número.
var binaryResult = Integer.toBinaryString(result);

*/
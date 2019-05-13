/** Versão 0.1 - Suane Vallim
 * Algoritmo de Euclides - Codigo comentado **/

import java.util.Scanner;
public class AlgoritmoEuclides
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int dividendo = 0; //dividendo
        int divisor = 0; // divisor, quantas vezes cabe o quatro dentro do dividendo?
        int resto = 1; // qual o resto da divisao?
        int aux = 0;// auxiliar é utilizado para o if da troca da entrada de dados
        int contador = 0;
        System.out.println("\f"); // limpa a tela
        do{ //fazer um do para a entrada de dados, pq o programa so continua, dps que o usuario informar todos os dados necessários
            System.out.println("Digite um numero: ");
            dividendo = input.nextInt();
            System.out.println("Insira um numero para dividir o anterior: ");
            divisor = input.nextInt();
            contador++;//é necessário sempre colocar um contador dentro do do-while para evitar que ele entre em loop infinito
        } while (dividendo <= 0 && divisor <= 0);//enquanto o dividendo e o divisor forem menor que 0, ele não prossegue.
        
        if (dividendo < divisor){ // se o divisor for maior que o dividendo, nao tem como ter conta, logo, troco eles de lugar para fazer a conta
          aux = divisor;
          divisor = dividendo;
          dividendo = divisor;
        }
        resto = dividendo % divisor;     
        //while (resto != 0){ //enquanto for diferente de zero, ele faz o if
            if (resto == 0){
                System.out.println("O MDC é "+resto);
            }
            else
                System.out.println("O MDC é: " + resto);
        //} //como eu paro o loop? Como fazer funcionar com o while?
        
        
        /**int conta = dividendo / divisor; //caso queira mostrar a divisão entre o dividendo e o divisor
        int quociente = conta*conta; //caso queira mostrar o quociente**/
    }
}
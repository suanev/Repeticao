/**10) Implemente um trecho de código no método main que leia 
 * uma quantidade desconhecida de números e conte quantos deles estão nos 
 * seguintes intervalos: [0,25], [26,50], [51,75] e [76,100]. A entrada de
 * dados deve terminar quando for lido um número negativo.**/
import java.util.Scanner;
public class Ex10
{
   public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        int total = 0;
        do{
            System.out.println("Insira um numero: ");
            int num = input.nextInt(); 
            for(int aux = 0; aux <= num; aux++){ //como eu faço para criar uma variavel que conte quantas vezes o numero digitado se encaixa dentro de cada if? Porque eu nao quero a soma dos numeros digitadose sim a quantidade de vezes que ele foi digitado e percente aquele intervalo
                if (num >= 0 && num <= 25){
                    System.out.println("O numero de elementos pertencentes ao intervalo [0,25] é: " + total);
                }
                  else if (num >= 26 && num <= 50){
                      System.out.println("O numero de elementos pertencentes ao intervalo [26,50] é: " + total);
                  }
                  else if (num >= 51 && num <= 75){
                      System.out.println("O numero de elementos pertencentes ao intervalo [51,75] é: " + total);
                  }
                  else if (num >= 76 && num <= 100){
                      System.out.println("O numero de elementos pertencentes ao intervalo [76,100] é: " + total);
                  }
                
            }
        }while(i > 0);
        i++;
    }
}   
   // public static int intervalo (int num){
        
       // return total;
    //}



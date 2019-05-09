//ler num
//criar um acumulador de soma / soma = 0
//se (num>0)
//então for (int aux=1 até aux <= num, aux = aux + 1 ou aux++)
//faça soma = soma + aux
// se for igual a zero, retorna um
// e se (num<0)
import java.util.Scanner;
public class Ex1
{
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int aux = 1;
        System.out.println("Informe um numero:");
        int num = input.nextInt();
        
        if (num >= 0){
            for(;aux <= num; aux++){
                soma = aux + soma;
              }
              System.out.println(soma);
        }
            else if (num < 0){
                for(;aux > num; aux--){
                soma = aux + soma;}
                System.out.println(soma);
                }
                
            
            else if (num == 0)
                System.out.println(aux);
            
            }
}

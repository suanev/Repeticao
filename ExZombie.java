import java.util.Scanner;
import java.util.Random;
public class ExZombie
{
    public static void main(String args[]){
        int contador = 0;
        Scanner input = new Scanner(System.in);
        Random aleatório = new Random();
        System.out.println("Informe a quantidade de habitantes da cidade infectada: ");
        int populacao = input.nextInt();
        
        do{
            
            
            contador++;
        }while(contador < 70);
    }
}


/**
 * Escreva a descrição da classe Ex2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Ex2
{
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
     int par = 0;
     int aux = 1;
            
    do {
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        
        for (aux = 1; aux <= num; aux++){  
        if (aux%2==0){
            System.out.println(aux);
         }
         
                 
    }
    par++;
}while (par < 6);
    

}
}
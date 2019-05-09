
import java.util.Scanner;
public class Ex4
{
    public static void main (String args[]){
     Scanner input = new Scanner(System.in);
     int par = 0;
     int aux = 1;
            
    do {
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        //aux = num; para queo aux para no num
        // aux>= 1; para que ele nao vá para valores negativos
        //aux--; para que ele leia de forma decrescente
        for (aux = num; aux >= 1; aux--){   
        if (aux%2!=0){
            System.out.println(aux);
         } 
    }
    par++;
    }while (par < 6);
    
    }
}
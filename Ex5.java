
import java.util.Scanner;
public class Ex5
{
    public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inform e o valor de a:");
    int a = input.nextInt();
    System.out.println("Inform e o valor de b:");
    int b = input.nextInt();
    
      if(a < b){
            for(int aux = a; aux <= b; aux++){
                if(aux%2==0){
                System.out.println(aux);
             }
        
         }
      }
        
        if(a > b){
            for(int aux = a; aux >= b; aux--){
                if(aux%2==0){
                System.out.println(aux);
             }
        
        }
      }
    
}
}

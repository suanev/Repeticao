import java.util.Scanner;
public class Ex6
{
    public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    int i = 0;
    System.out.println("Inform e o valor de a:");
    int a = input.nextInt();
    System.out.println("Inform e o valor de b:");
    int b = input.nextInt();
    
    do{
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
    
   }while(i < 8);}
}

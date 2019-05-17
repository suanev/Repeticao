
import java.util.Scanner;
public class ExGOT
{//comem o0,5% do seu peso naquele dia
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        double contador = 0;
        double rhaegel = 25.0, viserion = 27.5 , drogon = 33.0; 
        double umAnoR = 0, umAnoV = 0, umAnoD = 0;
        double diaR = 0, diaV = 0, diaD = 0;
        double total = 0;
        System.out.println("\f");
        
        for(int i = 0; i < 365; i++){
            diaR = ((rhaegel*0.5)/100); //essa é a quantidade de ração que o dragão come por dia
            umAnoR += diaR; //recebendo o quanto  os dragões comem no ano
            rhaegel += diaR;
            
            diaV = ((viserion*0.5)/100);
            umAnoV += diaV;
            viserion += diaV;
            
            diaD = ((drogon*0.5)/100); 
            umAnoD +=  diaD;
            drogon += diaD;
        }
        System.out.println("\nA quantidade de ração consumida em um ano pelo Rhaegel é de " + Math.ceil(umAnoR) +" kg de ração (valor arrendondado).");
        System.out.println("\nA quantidade de ração consumida em um ano pelo Viserion é de " + Math.ceil(umAnoV) +" kg de ração (valor arrendondado).");
        System.out.println("\nA quantidade de ração consumida em um ano pelo Drogon é de " + Math.ceil(umAnoD) +" kg de ração (valor arrendondado).");
        
        total = umAnoR + umAnoV + umAnoD;
        System.out.println("A quantidade total de ração consumida pelos dragões no final de um ano é :"+ Math.ceil(total)+" mil kg (valor arrendondado).");
        
        for(int i = 0; i < 365; i++){
            diaR = ((rhaegel*0.5)/100); //essa é a quantidade de ração que o dragão come por dia
            umAnoR += diaR; //recebendo o quanto  os dragões comem no ano
            rhaegel += diaR;
            
            diaV = ((viserion*0.5)/100);
            umAnoV += diaV;
            viserion += diaV;
            
            diaD = ((drogon*0.5)/100); 
            umAnoD +=  diaD;
            drogon += diaD;
        }
        total = umAnoV+umAnoD+umAnoR;
        double saco = total/500;
        double dolares = saco * 30000;
        if(saco < 2000000)
            System.out.println("A quantidade de dolares foi suficiente\nTotal: "+dolares);
            else
                System.out.println("A quantidade de dolares nao foi suficiente\nTotal: "+dolares);
       }
}

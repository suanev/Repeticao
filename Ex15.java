import java.util.Scanner;
public class Ex15
{
    public static void main(String args[]){
           Scanner input = new Scanner(System.in);
           int a = 0, b = 0, c = 0, d = 0, e = 0;
           int contador = 1;
           do{
               System.out.println("Bem-vindo nadador! \nPor favor, informe a sua idade: ");
               int idade = input.nextInt();
               if(idade >= 5 && idade <= 7){
                   System.out.println("Nadador, você se encontra na categoria: Infantil A.");}
                   else if(idade >= 8 && idade <= 10){
                       System.out.println("Nadador, você se encontra na categoria: Infantil B.");}
                       else if(idade >= 11 && idade <= 13){
                           System.out.println("Nadador, você se encontra na categoria: Juvenil A.");}
                           else if(idade >= 14 && idade <= 17){
                               System.out.println("Nadador, você se encontra na categoria: Juvenil B.");}
                               else if(idade >= 18 && idade <= 100){
                                   System.out.println("Nadador, você se encontra na categoria: Adulto.");}
                                   else
                                        System.out.println("A idade não é valida, você nao pode ser um nadador.");
               contador++;
            }while(contador < 11);
    }
}

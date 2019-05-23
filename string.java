import java.util.Scanner;
public class string
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("insira um verbo regular:");
        String verbo = input.nextLine();
        char letra = verbo.charAt(0);
        String troca = Character.toString(letra); //transformando char em string para printar
        
        if(verbo.endsWith("ar")){
            System.out.println("Conjugação de verbo no futuro: "+verbo.replace("ar","arão"));
            System.out.println("Conjugação de verbo no passado: "+verbo.replace("ar","aram"));
            System.out.println("O verbo " + troca.toUpperCase()+verbo.substring(1) +" possui: "+verbo.length() + " caracteres.");}//mostra a primeira letra em maiscula e quantos caracteres a palavra tem
            //mostra quantos caracteres o verbo possui
        else if(verbo.endsWith("er")){
            System.out.println("Conjugação de verbo no futuro: "+verbo.replace("er","erão"));
            System.out.println("Conjugação de verbo no passado: "+verbo.replace("er","eram"));
            System.out.println("O verbo " + troca.toUpperCase()+verbo.substring(1) +" possui: "+verbo.length() + " caracteres.");} //mostra quantos caracteres o verbo possui
        else if(verbo.endsWith("ir")){
            System.out.println("Conjugação de verbo no futuro: "+verbo.replace("ir","arão"));
            System.out.println("Conjugação de verbo no passado: "+verbo.replace("ir","iram"));
            System.out.println("O verbo " + troca.toUpperCase()+verbo.substring(1) +" possui: "+verbo.length() + " caracteres.");} //mostra quantos caracteres o verbo possui
    }
}

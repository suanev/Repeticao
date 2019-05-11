public class Ex8
{ //tem como fazer esse exercicio sem a utilização de metodos?
    public static void main(String args[]){
        int i = 0;
        
        do{
        for (int aux = 0; aux < 80000000; aux++){//entendi
            if((numPerfeito(aux) == true)){
                System.out.println(aux);} } 
        i++;
        }while(i > 5); //porque i tem que ser maior que 5? e porque nao consigo os 5 num perfeitos, só 4 (zero nao conta e nem devia estar aparecendo)? 
    }
    
    public static int somaDivP(int num){
        int soma = 0;
        for(int aux = num/2; aux > 0; aux--){//enquanto a divisão for maior que zero, ela continua
            //mas se a variavel num nao foi inicializada e nem atribuida um valor, como eu posso usar ela e o metodo funcionar?
            if(num % aux == 0){
                soma += aux;
            }
        }
        return soma;
    }
    
    public static boolean numPerfeito (int num){
        if (somaDivP(num) == num){
            return true;}
            else
            {return false;}
    }
}

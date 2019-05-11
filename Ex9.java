public class Ex9
{//fazer metodos
   public static void main (String args[]){
       int num = 1500;
       int contador = 0;
       
       System.out.println("\f");
       //while (contador < 100){ // como usar o while de forma correta para que nao fique em loop e nao precise determinar o valor correto para fechar 100 numeros primos?
           for(int aux = 1000; aux <= 1723; aux++){
               if (testePrimo(aux) == true)
                    System.out.println(aux);
           }
       //}
       
    }
   
   public static int divisor (int num){ //porque eu uso a variavel num que somente foi inicializada, logo tem valor zero?
       int contador = 0;//inicializando a variavel
       for (int aux = 1; aux <= num; aux++){
           if (num%aux == 0){ // se o numero dividir pela auxiliar que vai aumentando, entao ele é impar
               contador++;//porque preciso criar uma variavel para ficar contando?
            } 
        }
        return contador; // o retorno tem que ser feito fora do for
    }
    
      
   public static boolean testePrimo (int num) {
       if (divisor(num) == 2) //Se e somente se, o metodo divisor retornar DOIS valores, entao quer dizer que o numero é primo, pois um numero primo divide pela unidade e por ele mesmo
            return true;
       else {return false;}
    }
}

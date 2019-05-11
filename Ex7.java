public class Ex7
{
    public static void main(String args[]){
        int num = 20, aux = 1, i = 0;
        System.out.println("Os 20 primeiros multiplos de 7 são:");
        for(aux = 1; aux <= num; aux++){
            System.out.println(aux*7);
        }
        /** Eu criei uma variavel auxiliar que fica contando de um em um, e eu disse no incremento, que 
         * enquanto aux nao chegar em vinte (ou seja, enquanto ela nao repetir o loop 20 vezez) ela nao pode 
         * parar. Entao eu multipliquei a aux por 7, e cada numero somado a auxiliar vai multiplicar e assim
         * me mostrar um valor da tabuada do 7.
         * Logo, este algoritmo esta me mostrado o auxiliar multiplicando 20 vezes, e em cada um dos loops
         * o auxiliar vale um valor diferente.
         * No primeiro loop, o auxiliar vale 1, entao vai ser 1*7 = 7
         * No segundo loop, o auxiliar vale 2, entao vai ser 2*7 = 14, e assim por diante.
        **/
  }
}

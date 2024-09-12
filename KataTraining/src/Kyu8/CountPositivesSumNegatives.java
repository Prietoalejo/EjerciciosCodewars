
package Kyu8;

import java.util.Arrays;

public class CountPositivesSumNegatives {
    
    public static int [] countPositivesSumNegatives(int[] input){
        int contador = 0;
        int suma = 0;
        int arreglo [] = new int [2];
        if(input == null || input.length == 0 ){
            return arreglo = new int [0];
        }
        else{
            for(var i = 0;i< input.length;i++){
                if(input[i]>0){
                    contador += 1;
                }
                else if(input[i]<0){
                    suma += input[i];
                }
            }
            arreglo[0] = contador;
            arreglo[1] = suma;
            
        }
        return arreglo;
    }
    
    public static void main(String[] args) {
        
        int [] arreglo  = {-3};
        var resultado = countPositivesSumNegatives(arreglo);
        System.out.println(Arrays.toString(resultado));
        
        
    }
    
}

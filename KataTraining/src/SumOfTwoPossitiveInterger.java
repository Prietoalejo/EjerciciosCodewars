import java.util.Arrays;


public class SumOfTwoPossitiveInterger {
    
    public static long sumTwoSmallestNumbers(final long [] numbers) {
        // varibles de comparacion
        long menor1= Long.MAX_VALUE;
        long menor2 = Long.MAX_VALUE;
        long retorno = 0;
        for(var i = 0;i<numbers.length;i++){
            if(numbers[i] <= menor1){
                menor2 = menor1;
                menor1=numbers[i];
                
            }
            else if(numbers[i] < menor2 && numbers[i] > menor1){
                menor2 = numbers[i];
            }
        retorno = menor1+menor2;   
        }
        return retorno;
    }
    
    public static long sumTwoSmallestNumberss(final long [] numbers){
        long suma = 0;
        Arrays.sort(numbers);
        suma = numbers[0]+numbers[1];
        return suma;
        
        
        
        
            
    }
    
    
  

    
    public static void main(String[] args) {
        
        long [] entrada = {3, 87, 3, 12, 7};
        var resultado = sumTwoSmallestNumberss(entrada);
        System.out.println(resultado);
        
        
    }
    
}

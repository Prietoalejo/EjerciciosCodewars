
import java.util.Arrays;


public class Maps {
    public static int[] map(int[]n){
        
        var duplicado = new int [n.length];
        for(var i = 0;i<n.length;i++){
            duplicado[i] = n[i]*2;
            
           
           
           
        }
    return duplicado;        
        
    }
    
    public static void main(String[] args) {
        int [] arreglo = {1,2,3};
        var resultado = Maps.map(arreglo);
        System.out.println(Arrays.toString(resultado));
        
        
        
        
        
    }
    
}

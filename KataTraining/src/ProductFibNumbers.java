
import java.util.Arrays;


public class ProductFibNumbers {
    
    public static long [] ProductFibbo(long prod){
        long input = prod;
        long fn = 0;
        long fnMasUno = 1;
        while(fn * fnMasUno < input){
            long fnNext = fn + fnMasUno;
            fn = fnMasUno;
            fnMasUno = fnNext;
        
        }
        if (fn *fnMasUno == input){
            return new long[] {fn, fnMasUno, 1};
        }else{
            return new long[] {fn, fnMasUno,0};
        }
        
    
    }
   
    
    public static void main(String[] args) {
        
        var entrada = 5895;
        var resultado = ProductFibbo(entrada);
        System.out.println(Arrays.toString(resultado));
        
        
    }
    
}

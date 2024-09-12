
import java.util.Arrays;


public class Kata {
    public static int squareSum(int[]n){
        var sum = 0;
        for(var i = 0;i<n.length;i++){
            sum +=n[i]*n[i];     
        }     
    return sum;
    }
    
    public static void main(String[] args) {
        
        int [] myArray = {1,2,2};

        var suma = Kata.squareSum(myArray);
        System.out.println(suma);
        
        
        
    }
    
}

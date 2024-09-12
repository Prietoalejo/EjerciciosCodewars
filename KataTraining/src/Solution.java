
import java.util.Arrays;




public class Solution {
    // Mi respuesta
    public static String [] stringToArray(String s){
         var cadenas = s.split(" ");
         String [] cadenaFinal = cadenas;
         return cadenaFinal;
    }
    // Chat Gpt
    public static String [] StringToArrayOp(String m){
        String arreglo [] = m.split(" ");
        return arreglo; 
    }
    // Primera del Codewars
    public static String [] StringArray(String x){
        return x.split(" ");
    }
    
    public static void main(String[] args) {
        var cadena = "Robin Singh Hollywood Madafaka";
        var resultado = Solution.StringArray(cadena);
        System.out.println(Arrays.toString(resultado));
        
        
    }
    
}

// util.Arrays es una librearia para manjar arreglos
import java.util.Arrays;


public class PigLatin {
    
    public static String pigIt(String str){
        var palabras = str.split(" ");
        String temporal = "";
        StringBuilder resultado = new StringBuilder();
        for(var i = 0;i<palabras.length;i++){
            temporal = palabras[i].substring(1) + palabras[i].charAt(0) + "ay";
            resultado.append(temporal).append(" ");
            }

            
            
    return resultado.toString().trim(); 
    }
    public static void main(String[] args) {
        var test = "Hello world !";
        var resultado1 = PigLatin.pigIt(test);
        System.out.println(resultado1);
        
    }
    
}

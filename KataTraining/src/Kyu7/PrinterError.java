
package Kyu7;

public class PrinterError {
    
    public static String printerError(String s){
        String verificacion = "";
        var numero = 0;
        var denominador = s.length();
        StringBuilder letrasFueraLimite = new StringBuilder();
        
        for(var i = 0; i <s.length(); i++){
            if(s.charAt(i)<'m'){
               
            }
            else if(s.charAt(i) >'m')
            {
                numero+=1;
  
            }
        }
        return letrasFueraLimite.append(numero).append("/").append(denominador).toString();

    }
    
    
    public static void main(String[] args) {
        
        String cadena = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        var resultado = PrinterError.printerError(cadena);
        System.out.println(resultado);
        
    }
    
}

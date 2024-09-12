
public class YesOrNo {
    //Definimos nuestra funcion
    public static String boolToWord(boolean palabra){
        var cadena = "";
        /*
        Condicionamos la funcion para que evalue el valor booleano, si el valor 
        resulta ser verdadero devolvera un cadena "Yes" de lo contrario regresara 
        una cadena "No"
        */
        if(palabra == true){
            cadena = "Yes";
        }
        else{
            cadena = "No";
        }
    return cadena;
    }
    public static String tunr(boolean b){
        // operador ternario, evaluar b la primera el if la segunda else.
        return b ? "Yes": "No";
    }
    
    
    public static void main(String[] args) {
        // Definimos la variable resultado como valor booleano
        var resultado = false;
        // iniciamos otra varibla donde alamcena el la cadena que nos retornara la funcion 
        var palabra = YesOrNo.tunr(resultado);
        // Se manda a imprimi la ultima variable que contiene el valor que retorno la funcion
        System.out.println(palabra);
        
        
    }
    
}

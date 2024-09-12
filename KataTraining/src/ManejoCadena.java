
public class ManejoCadena {
    
    public static String RemoveFirtLast(String cadena){
        var nuevaCadena= "";
        for(var i=0;i<=cadena.length();i++){
            nuevaCadena = cadena.substring(1,cadena.length()-1);
        }
        return nuevaCadena;
         
    }
    
    public static void main(String [] args){
        var palabras = "hola";
        var resultado = ManejoCadena.RemoveFirtLast(palabras);
        System.out.println(resultado);
    
    }
    
}

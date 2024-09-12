/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu7;

public class Isograms {
    
    public static boolean isIsogram(String str){
        var cadena = ' ';
        boolean salida = true;
        str = str.toLowerCase();
        if(str.isEmpty()){
            salida = true;
        }
        else
            for(var i = 0;i<str.length() -1;i++){
                for(var e =i +1; e <str.length();e++)
                    if(str.charAt(i) == str.charAt(e))
                    {
                        salida = false;
                    }
                
        }
        return salida;
        
        
    }
    
    public static void main(String[] args) {

        
        var cadena = "";
        var prueba = isIsogram(cadena);
        System.out.println(prueba);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu7;

/**
 *
 * @author guante
 */
public class Vowels {
    
    public static int getCount(String str){
        int contador = 0;
        char [] vocales = {'a','e','i','o','u'};
        
        for(var i = 0;i<str.length();i++){
            for(var e = 0;e<vocales.length;e++){
                if(str.charAt(i) == vocales[e]){
                    contador +=1;
                }
            }
        }
        return contador;
    }

    
    
    public static void main(String[] args) {
        
        var cadena = "pear tree";
        var resultado = getCount(cadena);
        System.out.println(resultado);
        
    }
    
}

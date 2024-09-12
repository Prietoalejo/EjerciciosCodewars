/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu8;

/**,
 *
 * @author guante
 */
public class FakeBinary {
    
    public static String fakeBin(String numberString){
        String nuevaCadena = " ";
        int inCadena;
        StringBuilder cadenaFinal = new StringBuilder();
        for(var i = 0;i< numberString.length();i++){
            int comparador = Character.getNumericValue(numberString.charAt(i));
            if(comparador < 5){
                cadenaFinal.append("0");
            }
            else if(numberString.charAt(i) >= 5){
                cadenaFinal.append("1");
            }
        }
        
    return cadenaFinal.toString();    
    }
    
    public static void main(String[] args) {
        var numero = "456";
        var resultado = fakeBin(numero);
        System.out.println(resultado);
    }
 
    
}

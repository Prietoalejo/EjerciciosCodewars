/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu7;

public class ReverseString {
    public static String reverseWords(final String original){
        String out = "";
        StringBuilder cadena;
        for(var i = 0; i<original.length();i++){
            out +=original.split(original.substring(i));
            
        }
        return out;
    
    }
    
    public static void main(String[] args) {
        String test = "The quick brown fox jumps over the lazy dog.";
        var result = reverseWords(test);
        System.out.println(result);
    }
    
}

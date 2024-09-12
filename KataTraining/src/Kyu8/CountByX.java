/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu8;

import java.util.Arrays;

/**
 *
 * @author guante
 */
public class CountByX {
    public static int [] countBy(int x, int n ){
        int [] retorno = new int [n] ;
        for(var i = 0; i<retorno.length ; i++){
            retorno[i] =x*(i+1);     
        }
        return retorno;
        
        

}
    
    public static void main(String[] args) {
        

        int [] resultado = countBy(100, 6);
        System.out.println(Arrays.toString(resultado));
        
        
        
    }
    
}

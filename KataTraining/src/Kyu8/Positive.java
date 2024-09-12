/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu8;

/**
 *
 * @author guante
 */
public class Positive {
    public static int sum(int[] arr){
        int salida = 0;
        for(var i = 0;i<arr.length;i++){
            if(arr[i]<0)
                continue;
            else
                salida +=arr[i];
        }
    return salida;
    
    }
    public static void main(String[] args) {
        int [] entrada = {};
        var result = sum(entrada);
        System.out.println(result);
    }
}

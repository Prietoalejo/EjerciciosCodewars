/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu7;


/**
 *
 * @author guante
 */
public class TodosLosEnteros {
    
    public static int getSumm(int a, int b){
        int retornoSuma = 0;
        var suma = 0;
        if(a == b){
            return a;
        }
        else if(a>b){
            int mayor = a;
            int menor = b;
            for(var i = menor;i<= mayor;i++){
            suma += i;
            }
            
        }
        else if(b>a){
           int mayor = b;
           int menor = a;
           for(var i = menor;i<= mayor;i++){
            suma += i;
           }
        }
        return suma;

        
    }
    
    
    public static void main(String[] args) {
        var test = 4;
        int resultado = TodosLosEnteros.getSumm(-1, 0);
        System.out.println(resultado);
                
        
        
    }
    
}

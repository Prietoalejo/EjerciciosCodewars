/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kyu7;

/**
 *
 * @author guante
 */
public class OddOrEven {
      public static String oddOrEven (int[] array) {
          // odd = impar, even = par
          String salida = "";
          int sumador = 0;
          if(array.length == 0){
              salida = "even";
          }
          else{
              for(var i = 0; i<array.length;i++){
                  sumador += array[i];
                    if(sumador%2 == 0){
                      salida = "even";
                  }
                  else
                      salida = "odd";
                  }
              
              }
          return salida;
}
   
       public static void main(String[] args) {
          int [] prueba = {0, -1, -5};
          var resultado = oddOrEven(prueba);
          System.out.println(resultado);
        
    }
}

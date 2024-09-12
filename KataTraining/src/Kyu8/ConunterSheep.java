
package Kyu8;

public class ConunterSheep {


    public static int countSheepps(Boolean [] arrayOfSheeps){
        int result = 0;
        if(arrayOfSheeps == null){
            result = -1;
            return result;
        }
        else
            for(var i = 0; i<arrayOfSheeps.length; i++){
                if(arrayOfSheeps[i] == null || arrayOfSheeps[i] == false)
                    continue;
                else
                    result ++;
            }
        return result;
    
    }
    
    public static void main(String[] args) {
        Boolean array1[] = {true,  true,  true,  false,
                      true,  true,  true,  true ,
                      true,  false, true,  false,
                      true,  false, false, true ,
                      true,  true,  true,  true ,
                      false, false, true,  true };
        var resultado = countSheepps(array1);
        System.out.println(resultado);
        
    }


}

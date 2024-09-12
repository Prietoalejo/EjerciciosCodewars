
public class KataTr2 {
    
    public static String countingSheep(int num){
        var chain = "";
        if(num == 0)
            return chain;
        for(var i = 1 ;i <= num;i++){
            chain += i + " sheep...";
            chain.toString();

            
        }
        
        return chain;
        
        
    
    
    }
    
    
    
    
    public static void main(String[] args) {
      var test = 3;
      var resultado = KataTr2.countingSheep(test);
        System.out.println(resultado);
      
      
    }
    
}


public class GrassHopper {
    
    public static char gatGrade(int n1, int n2, int n3){
        char [] grades = {'A','B','C','D','F'};
        var average = (n1+n2+n3)/3;
        var letra = ' ';
        if(average>= 0 && average <= 60){
            for(var i = 0;i<grades.length;i++){
                letra=grades[4];
            }    
        }
        else if(average>=60 && average <70){
            for(var i = 0; i<grades.length;i++){
               letra = grades[3];
            }
            
        }
        else if(average>=70 && average <80){
            for(var i = 0; i<grades.length;i++){
               letra = grades[2];
            }
        
        }
        else if(average>=80 && average <=90){
            for(var i = 0; i<grades.length;i++){
               letra = grades[1];
            }
        }
        else if(average>=90 && average <=100){
            for(var i = 0; i<grades.length;i++){
                letra = grades[0];
            }
        }
        
    return letra; 
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        var testA = 70;
        var testB = 70;
        var testC = 100;
        var suma = (testA+testB+testC)/3;
        System.out.println(suma);
        char resultado = GrassHopper.gatGrade(testA, testB, testC);
        System.out.println(resultado);

    }
    
}

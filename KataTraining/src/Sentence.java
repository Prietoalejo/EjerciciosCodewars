
public class Sentence {
    public static String sentenceSmash(String [] word){
        String sentence = "";
        for(var i = 0;i<word.length;i++){
            sentence += word[i] + " ";
        }
        return sentence.trim();
    
    }
    
    
    public static void main(String[] args) {
        String [] cadena = {"Hello", "World", "This", "is", "great"};
        var printeo = Sentence.sentenceSmash(cadena);
        System.out.println(printeo);
    }
    
}

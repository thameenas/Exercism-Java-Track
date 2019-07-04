import java.util.Arrays;

class Proverb {
    String[] listOfWords;
    Proverb(String[] words) {
        listOfWords=words;
    }

    String recite() {
        if(listOfWords.length==0){
            return "";
        }
        final StringBuilder proverb=new StringBuilder("");
        proverbBuilder(proverb,listOfWords);
        proverb.append("And all for the want of a "+listOfWords[0]+".");
        return proverb.toString();
        }
    
    void proverbBuilder(StringBuilder proverb ,  String[] words ){
        if(words.length<2)
            return;

        proverb.append("For want of a "+words[0]+" the "+words[1]+" was lost.\n");
        proverbBuilder(proverb,Arrays.copyOfRange(words,1,words.length));
    }

}

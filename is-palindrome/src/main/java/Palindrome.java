public class Palindrome {
    public boolean check(String sentence) {
        if(sentence.isEmpty())
            return true;
        sentence=sentence.replaceAll("\\s","");
        sentence=sentence.toLowerCase();
        String reverse=new StringBuffer(sentence).reverse().toString();
        if(sentence.equals(reverse))
            return true;
        else
            return false;

    }
}

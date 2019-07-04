class Twofer {
    String twofer(String name) {
        String newString=String.format("One for %s, one for me.", (name!=null) ? name   : "you" );
        return newString;
    }   
}

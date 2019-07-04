class Acronym {
    String sentence;
    Acronym(String phrase) {
        sentence=phrase;
    }

    String get() {
        StringBuilder acronym=new StringBuilder("");
        String specialChars=" _-";
        acronym.append(sentence.charAt(0));
        for(int i=1;i<sentence.length();i++){
            if(specialChars.contains(String.valueOf(sentence.charAt(i))))
                if(Character.isLetter(sentence.charAt(i+1)))
                     acronym.append(sentence.charAt(i+1));
        }
        return acronym.toString().toUpperCase();
    }   

}

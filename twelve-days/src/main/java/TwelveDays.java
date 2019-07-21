
class TwelveDays {
    String[] days={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String[] gifts={"a Partridge in a Pear Tree",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
    };   


    String verse(int verseNumber) {
        StringBuilder song=new StringBuilder("");
        for(int i=verseNumber-1;i>=0;i--){
            if(i==0 && verseNumber>1)
                song.append("and ");
            song.append(gifts[i]);
        }
        return String.format("On the %s day of Christmas my true love gave to me: %s.\n",days[verseNumber-1],song.toString());
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder song =new StringBuilder("");
        for(int i=startVerse;i<=endVerse;i++){
            song.append(verse(i));
            if(i!=endVerse)
                song.append("\n");

        }
        return song.toString();
    }
    
    String sing() {
        
       return verses(1,12);

    }
}

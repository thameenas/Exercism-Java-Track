import java.util.HashMap;
class TwelveDays {
    HashMap<Integer, String> days = new HashMap<>();;
    HashMap<Integer, String> verses = new HashMap<>();;
    TwelveDays(){
        days.put(1, "first");
		verses.put(1, " a Partridge in a Pear Tree.");
		days.put(2, "second");
		verses.put(2, " two Turtle Doves, and");
		days.put(3, "third");
		verses.put(3, " three French Hens,");
		days.put(4, "fourth");
		verses.put(4, " four Calling Birds,");
		days.put(5, "fifth");
		verses.put(5, " five Gold Rings,");
		days.put(6, "sixth");
		verses.put(6, " six Geese-a-Laying,");
		days.put(7, "seventh");
		verses.put(7, " seven Swans-a-Swimming,");
		days.put(8, "eighth");
		verses.put(8, " eight Maids-a-Milking,");
		days.put(9, "ninth");
		verses.put(9, " nine Ladies Dancing,");
		days.put(10, "tenth");
		verses.put(10, " ten Lords-a-Leaping,");
		days.put(11, "eleventh");
		verses.put(11, " eleven Pipers Piping,");
		days.put(12, "twelfth");
		verses.put(12, " twelve Drummers Drumming,");
    }


    String verse(int verseNumber) {
        StringBuilder song=new StringBuilder("");
        song.append("On the "+ days.get(verseNumber)+" day of Christmas my true love gave to me:");
        while(verseNumber>0){
            song.append(verses.get(verseNumber));
            verseNumber--;
        }
        song.append("\n");
        return song.toString();
        
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

import static java.util.Arrays.stream;
import java.util.Arrays; 
import java.util.ArrayList;

class Yacht {
    YachtCategory category;
    int[] dices;
    Yacht(int[] dice, YachtCategory yachtCategory) {
        dices=dice;
        category=yachtCategory;
    }

    int score() {
        switch (category) {
            case YACHT:
                return yachtScore();
            case FULL_HOUSE:
                return fullHouse();
            case FOUR_OF_A_KIND:
                return fourOfAKind();
            case LITTLE_STRAIGHT:
                return straight(new int[]{1,2,3,4,5});
            case BIG_STRAIGHT:
                return straight(new int[]{2,3,4,5,6});
            case CHOICE:
                return choice();
            default:
                return singleNumber();
        }

    }

    int yachtScore() {
        var isYacht = stream(dices).distinct().count() == 1;
        return isYacht ? 50 : 0;
    }
    int singleNumber(){
        int score=0;
        for(int d:dices){
            if(d==category.ordinal())
                score=score+d;
        }
        return score;
    }

    int fullHouse(){
        if(fourOfAKind() != 0)
            return 0;
        int score=0;
        ArrayList<Integer> unique_dices= new ArrayList<>();
        for(int d:dices){
            score=score+d;
            if(!unique_dices.contains(d))
                unique_dices.add(d);
        }
        if(unique_dices.size()!=2)
            return 0;
        return score;
    }
    int fourOfAKind(){
        Arrays.sort(dices);
        if(dices[0]==dices[3] || dices[1]==dices[4])
            return dices[2]*4;
        return 0;
    }
    int straight(int[] straight) {
        Arrays.sort(dices);
        for(int i = 0; i < dices.length; i++) {
            if(dices[i] != straight[i])
                return 0;
        }

        return 30;
    }
    int choice() {
        int score = 0;

        for(int d : dices)
            score += d;

        return score;
    }

}

import java.util.Arrays;
import java.util.List;

class ResistorColor {
    String Colors[]= {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return Arrays.asList(Colors).indexOf(color);
        
    }

    String[] colors() {
        return Colors;

    }
}

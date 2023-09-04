package exercise;

//import java.util.ArrayList;
//import java.util.Arrays;

// BEGIN
public class ReversedSequence implements CharSequence {
    private char[] textChArray;
    private String text;

    public ReversedSequence(String text) {
        StringBuilder sbText = new StringBuilder(text);
        sbText.reverse();
        this.text = sbText.toString();
        this.textChArray = this.text.toCharArray();
    }


    @Override
    public String toString() {
        return String.valueOf(this.textChArray);
    }

    @Override
    public char charAt(int index) {
        return this.textChArray[index];
    }

    @Override
    public int length() {
        return this.textChArray.length;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.text.subSequence(start, end);
    }

}
// END

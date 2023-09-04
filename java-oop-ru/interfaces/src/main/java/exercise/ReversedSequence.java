package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    private String text;

    public ReversedSequence(String text) {
        StringBuilder sbText = new StringBuilder(text);
        this.text = sbText.reverse().toString();
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }

}
// END

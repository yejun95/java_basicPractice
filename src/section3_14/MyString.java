package section3_14;

public class MyString {

    private String string;

    public MyString() { }

    public MyString(String str) {
        this.string = str;
    }

    public MyString(int num) {
        String intToString = String.valueOf(num);
        this.string = intToString;
    }

    public String getString() {
        return string;
    }
}

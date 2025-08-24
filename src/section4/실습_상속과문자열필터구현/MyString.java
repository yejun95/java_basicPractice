package section4.실습_상속과문자열필터구현;

public class MyString {
    protected String string;
    public MyString() {

    }

    public void setString(String param) {
        String result = onSetString(param);
        string = result;
    }

    public String getString() {
        return this.string;
    }

    public String onSetString(String param) {
        return param;
    }
}

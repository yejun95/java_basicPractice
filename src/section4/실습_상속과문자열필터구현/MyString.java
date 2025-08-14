package section4.실습_상속과문자열필터구현;

public class MyString {
    protected String string;
    public MyString() {

    }

    public void setString(String param) {
        String str;
        if (onSetString(param)) {
            str = "아무것도 안함";
        } else {
            str = "우리귀요미";
        }

        this.string = str;
    }

    public String getString() {
        return this.string;
    }

    public boolean onSetString(String param) {
        return true;
    }
}

package section4.실습_상속과문자열필터구현;

public class MyStringEx extends MyString {

    @Override
    public boolean onSetString(String param) {
        if ("멍멍이아들".equals(param)) {
            return false;
        }
        return true;
    }
}

package section4.실습_상속과문자열필터구현;

public class MyStringEx extends MyString {

    @Override
    public String onSetString(String param) {
        if ("멍멍이아들".equals(param)) {
            return "우리귀요미";
        }

        return param;
    }
}

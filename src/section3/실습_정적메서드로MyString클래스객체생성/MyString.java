package section3.실습_정적메서드로MyString클래스객체생성;

public class MyString {

    private String mainStr;
    private static int count;

    private MyString(int num) {
        this.mainStr = String.valueOf(num);
    }

    private MyString(String str) {
        this.mainStr = str;
    }

    public static MyString newString(int param) {
        count++;
        return new MyString(param);
    }

    public static MyString newString(String param) {
        count++;
        return new MyString(param);
    }

    public String getString() {
        return mainStr;
    }

    public static int getCount() {
        return count;
    }
}

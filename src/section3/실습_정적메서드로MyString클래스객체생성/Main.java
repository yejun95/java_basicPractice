package section3.실습_정적메서드로MyString클래스객체생성;

public class Main {
    public static void main(String[] args) {
        //MyString src = new MyString("hello"); 생성 불가
        MyString s1 = MyString.newString(10);
        MyString s2 = MyString.newString("Test");

        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(MyString.getCount());
    }
}
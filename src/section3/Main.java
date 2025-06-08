package section3;

public class Main {
    public static void main(String[] args) {
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("바꿨음");
        System.out.println("src = " + src.getString());
        System.out.println("dst = " + dst.getString());
    }
}
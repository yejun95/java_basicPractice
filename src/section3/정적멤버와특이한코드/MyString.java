package section3.정적멤버와특이한코드;

public class MyString {

    private byte[] string;

    public MyString() { }

    public MyString(String str) {
        this.string = str.getBytes();
    }

    public MyString(MyString rhs) {
        this.deepCopy(rhs);
    }

    public MyString(int num) {
        String intToString = String.valueOf(num);
        this.string = intToString.getBytes();
    }

    public String getString() {
        if (string == null || string.length <= 0) {
            return "(null)";
        }

        return new String(string);
    }

    public void setString(String str) {
        this.string = str.getBytes();
    }

    public void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
    }


}

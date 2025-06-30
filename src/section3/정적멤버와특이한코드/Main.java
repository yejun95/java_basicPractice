package section3.정적멤버와특이한코드;

class MyTest {

    public int data;
    public static int sData = 10;


    public void setData(int param) {
        this.data = param;
    }

    public int getData() {
        return this.data;
    }
}

public class Main {
    public static void main(String[] args) {
        MyTest.sData = 20;
        MyTest t = new MyTest();

        System.out.println(t.sData);
        System.out.println((new MyTest()).sData = 50);
        System.out.println(MyTest.sData);
    }
}
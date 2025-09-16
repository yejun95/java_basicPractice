package section5;

import java.util.Scanner;

interface Shape {
    void render();
}

class Rectangle implements Shape {
    @Override
    public void render() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*  *  *  *  *");
        }
    }
}

class Triangle implements Shape {
    @Override
    public void render() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

public class 실습_Shape클래스 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        Shape shape;

        if (input == 0) {
            shape = new Rectangle();
        } else {
            shape = new Triangle();
        }

        shape.render();
    }

}

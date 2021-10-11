package lesson8;

public class Class1 {
    static final double PI = 3.14;

    static int abc (int a, int b, int c) {
        return a*b*c;
    }
    static void ab (int a, int b) {
        System.out.println(a + " раздельить на " + b + " будет " + (int) a/b + ", остаток " + a%b);
    }
    double square (int r) {
        return PI*r*r;
    }

    static double length (int r) {
        return 2*PI*r;
    }

    void circleInfo (int r) {
        System.out.println("Радиус окружности равен " + r);
        System.out.println("Площадь круга равна " + PI*r*r);
        System.out.println("Длина окружности равна " + 2*PI*r);

    }
}

class TestClass1 {
    public static void main(String[] args) {
        System.out.println(Class1.abc(2,6,8));
        Class1.ab(8,3);
        System.out.println(Class1.abc(12,54,79));
        Class1.ab(87645,341);

        System.out.println(Class1.length(24));
        Class1 class1 = new Class1();
        System.out.println(class1.square(24));
        class1.circleInfo(24);
    }
}
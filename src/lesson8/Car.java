package lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";

 }
class Human {
    String name = "Ivan";

   final Car c = new Car(); // Если модификатор доступа final на элемент класса, то переменные
                            // класса изменить можно, а вот экзкмпляр класса изменить нельзя.

    public static void main(String[] args) {
        Human human = new Human();
//        human.c = new Car();
        human.c.engine="V8";

    }
}
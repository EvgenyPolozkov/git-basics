package lesson8;

public class Student {
    String name;
    int course;
    static int count; //  модификатор статик не позволяет заново переопределять переменные при
    // создании объекта класса. Т.е. переменная уже принадлежит не объекту, а классу(она общая у всего класса).
    // при созднании объектов в них не выделяется место под эту переменную. Она хранится в классе

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student # " + count + " sozdan");
    }
    public static void showCount () {// этот метод работает без создания объектов. Для его работы объекты создавать не нужно
        System.out.println("Vsego sozdano studentov " + count);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student.showCount();
        Student student1 = new Student("Ivan", 1);
        Student student2 = new Student("Petr", 4);
        Student student3 = new Student("Masha", 2);
        Student.showCount();

        System.out.println(student2.name);
        System.out.println(Student.count);
        System.out.println(student3.count);

    }
}
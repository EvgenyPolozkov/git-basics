package lesson7;

public class Employee {
int id;
public String surname;
int age;
private double salary;
String department;

public Employee (int id) {
    this.id = id;
}
Employee (String surname) {
    this.surname = surname;
}

private Employee (double salary) {
    this.salary = salary;
}

double uvelichenieZarplati (){
    salary *=2;
    return salary;
}
public void getId () {
    System.out.println("ID = " + id);
}
public void getSurname () {
    System.out.println("SURNAME = " + surname);
}
public void getSalary () {
    System.out.println("SALARY = " + salary);
}
}


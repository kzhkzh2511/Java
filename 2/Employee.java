import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
    public static void main(String[] args) {
        System.out.println("我是Employee类");
    }
    private String name;
    private String age;
    private GregorianCalendar calendar;
    private double salary;
    public Employee(String name, String age, GregorianCalendar calendar, double salary) {
        this.name = name;
        this.age = age;
        this.calendar = calendar;
        this.salary = salary;
    }
    

}
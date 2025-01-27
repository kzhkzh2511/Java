/*
 * @Descripttion: 
 * @version: 
 * @Author: Kzh
 * @Date: 2025-01-26 13:31:53
 * @LastEditors: 2ofus
 * @LastEditTime: 2025-01-26 13:38:56
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeSortTest{
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("Harry Hacker", 35000);
        staff[1]=new Employee("cark", 1120);
        staff[2]=new Employee("messi",620);
        Arrays.sort(staff);
        for (Employee employee : staff) {
            System.out.println("name="+employee.getName()+",salary="+employee.getSalary());
        }
    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        if(salary>o.salary) return 1;
        if(salary<o.salary) return -1;
        return 0;
    }

    
    
}
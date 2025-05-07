// File: PersonEmployee.java
import java.time.LocalDate;
import java.time.Period;

public class PersonEmployee {
    String name;
    LocalDate dob;

    public PersonEmployee(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

    static class Employee extends PersonEmployee {
        String empId;
        double salary;

        public Employee(String name, String dobStr, String empId, double salary) {
            super(name, dobStr);
            this.empId = empId;
            this.salary = salary;
        }

        public void displayEmployee() {
            displayPerson();
            System.out.println("Employee ID: " + empId);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Bob", "1990-06-15", "EMP001", 60000);
        emp.displayEmployee();
    }
}
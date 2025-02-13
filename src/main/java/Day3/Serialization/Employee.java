package Day3.Serialization;

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures compatibility during deserialization
    private int id;
    private String name;
    private String department;
    private double salary;


    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}


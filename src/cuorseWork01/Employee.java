package cuorseWork01;

public class Employee {
    public static int counter;
    private final int id;

    private String fio;

    private int department;
    private double salary;
    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getFio() {

        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDepartment() {

        return department;
    }

    public void setDepartment(byte department) {

        this.department = department;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String toString() {
        return "\nId: " + id + " Работник [ ФИО: " + fio
                + ", Отдел: " + department
                + ", зарплата: " + salary + " рублей]" ;
    }

    public int getId() {
        return id;

    }
}

package cuorseWork01;

import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static double sumSalary() {
        double sumSalary = Main.employees[0].getSalary();
        for (Employee employee : Main.employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    private static void findMinSalary() {
        double employeeWithMinSalary = Main.employees[0].getSalary();
        String personWithMinSalary = null;
        for (Employee employee : Main.employees) {
            if (employee.getSalary() <= employeeWithMinSalary) {
                employeeWithMinSalary = employee.getSalary();
                personWithMinSalary = employee.getFio();
            }
        }
        System.out.println("У " + personWithMinSalary + "самая маленькая зарплата: " + employeeWithMinSalary +
                " рублей.\n");
    }

    private static void findMaxSalary() {
        double employeWithMaxSalary = Main.employees[0].getSalary();
        String personWithMaxSalary = null;
        for (Employee employee : Main.employees) {
            if (employee.getSalary() >= employeWithMaxSalary) {
                employeWithMaxSalary = employee.getSalary();
                personWithMaxSalary = employee.getFio();
            }
        }
        System.out.println("У " + personWithMaxSalary + "самая большая зарплата: " + employeWithMaxSalary
                + " рублей.\n");
    }

    private static double findAverageSalary() {
        return sumSalary() / Main.employees.length;
    }

    private static void fioEmployee() {
        for (int i = 0; i < Main.employees.length; i++) {

            System.out.println(Main.employees[i].getId() + ". " + Main.employees[i].getFio());
        }
    }

    public static void main(String[] args) {
        Employee ivanovIvanIvanovich = new Employee("Иванов Иван Иванович ", 1, 70000);
        Employee sidorovSidorSidorovich = new Employee("Сидоров Сидор Сидорович ", 1, 75000);
        Employee markovAndreyIvanovich = new Employee("Марков Андрей Иванович ", 2, 83000);
        Employee petrovPetrPetrovich = new Employee("Петров Петр Петрович ", 2, 83000);
        Employee salikhovTimurSadicovich = new Employee("Салихов Тимур Садыкович ", 3, 150000);
        Employee goncharovIvanAndreevich = new Employee("Гончаров Иван Андреевич ", 3, 149000);
        Employee chechovAntonPavlovich = new Employee("Чехов Антон Павлович ", 4, 100000);
        Employee zolotkovaAlisaDmitrievna = new Employee("Золоткова Алиса Дмитриевна ", 4, 250000);
        Employee salikhovRodionTimurovich = new Employee("Салихов Родион Тимурович ", 5, 155000);
        Employee nikitinaPavlaAleksandrovna = new Employee("Никитина Павла Александровна", 5, 200000);
        employees[0] = ivanovIvanIvanovich;
        employees[1] = sidorovSidorSidorovich;
        employees[2] = markovAndreyIvanovich;
        employees[3] = petrovPetrPetrovich;
        employees[4] = salikhovTimurSadicovich;
        employees[5] = goncharovIvanAndreevich;
        employees[6] = chechovAntonPavlovich;
        employees[7] = zolotkovaAlisaDmitrievna;
        employees[8] = salikhovRodionTimurovich;
        employees[9] = nikitinaPavlaAleksandrovna;

        System.out.println(Arrays.toString(employees) + "\n");
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " рублей.\n");
        findMinSalary();
        findMaxSalary();
        System.out.println("Средняя зарплата: " + findAverageSalary() + " рублей.\n");
        fioEmployee();
    }

}
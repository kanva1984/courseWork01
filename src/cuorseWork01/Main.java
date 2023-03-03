package cuorseWork01;

import java.util.Arrays;

public class Main {
    private static double sumSalary(Employee[] employees) {
        double sumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; ++i) {
            sumSalary += employees[i].getSalary();
        }
        return sumSalary;
    }

    private static void findMinSalary(Employee[] employees) {
        double employeeWithMinSalary = employees[0].getSalary();
        String personWithMinSalary = null;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employeeWithMinSalary) employeeWithMinSalary
                    = employees[i].getSalary();
            if (employeeWithMinSalary == employees[i].getSalary()) {
                personWithMinSalary = employees[i].getFio();
            }
        }
        System.out.println("У " + personWithMinSalary + "самая маленькая зарплата: " + employeeWithMinSalary +
                " рублей.\n");
    }

    private static void findMaxSalary(Employee[] employees) {
        double employeWithMaxSalary = employees[0].getSalary();
        String personWithMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employeWithMaxSalary) employeWithMaxSalary = employees[i].getSalary();
            if (employeWithMaxSalary == employees[i].getSalary()) {
                personWithMaxSalary = employees[i].getFio();
            }
        }
        System.out.println("У " + personWithMaxSalary + "самая большая зарплата: " + employeWithMaxSalary
                + " рублей.\n");
    }

    private static double findAverageSalary(Employee[] employees) {
        double findAverageSalary;
        findAverageSalary = sumSalary(employees) / employees.length;
        return findAverageSalary;
    }

    private static void fioEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {

            System.out.println(employees[i].getFio());
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
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
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary(employees) + " рублей.\n");
        findMinSalary(employees);
        findMaxSalary(employees);
        System.out.println("Средняя зарплата: " + findAverageSalary(employees) + " рублей.\n");
        fioEmployee(employees);
    }

}
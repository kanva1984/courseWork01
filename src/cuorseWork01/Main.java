package cuorseWork01;

import java.util.Arrays;
import java.util.logging.SocketHandler;

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
        double employeeWithMaxSalary = Main.employees[0].getSalary();
        String personWithMaxSalary = null;
        for (Employee employee : Main.employees) {
            if (employee.getSalary() >= employeeWithMaxSalary) {
                employeeWithMaxSalary = employee.getSalary();
                personWithMaxSalary = employee.getFio();
            }
        }
        System.out.println("У " + personWithMaxSalary + "самая большая зарплата: " + employeeWithMaxSalary
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

    private static void indexSalary(int index) {
        for (int i = 0; i < Main.employees.length; i++) {
            System.out.println(Main.employees[i].getFio() +
                    (Main.employees[i].getSalary() + Main.employees[i].getSalary() / 100 * index) + " рублей.");
        }
    }

    private static void findEmployeeWithMinSalaryOfOneDepartment(byte numberOfDepartment) {
        Double minSalaryOfOneDepartment = null;
        String employeeWithMinSalaryOfOneDepartment = null;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                if (minSalaryOfOneDepartment == null || Main.employees[i].getSalary() <= minSalaryOfOneDepartment) {
                    minSalaryOfOneDepartment = Main.employees[i].getSalary();
                    employeeWithMinSalaryOfOneDepartment = Main.employees[i].getFio();
                }
            }
        }
        System.out.println("\n" + employeeWithMinSalaryOfOneDepartment + " - сотрудник с минимальной зарплатой ("
                + minSalaryOfOneDepartment + " рублей) в отделе № " + numberOfDepartment + ".");
    }

    private static void findEmployeeWithMaxSalaryOfOneDepartment(byte numberOfDepartment) {
        Double maxSalaryOfOneDepartment = null;
        String employeeWithMaxSalaryOfOneDepartment = null;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                if (maxSalaryOfOneDepartment == null || Main.employees[i].getSalary() >= maxSalaryOfOneDepartment) {
                    maxSalaryOfOneDepartment = Main.employees[i].getSalary();
                    employeeWithMaxSalaryOfOneDepartment = Main.employees[i].getFio();
                }
            }
        }
        System.out.println("\n" + employeeWithMaxSalaryOfOneDepartment + " - сотрудник с максимальной зарплатой ("
                + maxSalaryOfOneDepartment + " рублей) в отделе № " + numberOfDepartment + ".");
    }

    private static double findSumSalaryOfOneDepartment(byte numberOfDepartment) {
        double sumSalaryOfOneDepartment = 0.0;

        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                sumSalaryOfOneDepartment += Main.employees[i].getSalary();
            }
        }
        return sumSalaryOfOneDepartment;
    }


    private static double findAverageSalaryOfOneDepartment(byte numberOfDepartment) {

        int numbersOfEmployees = 0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                numbersOfEmployees += 1;
            }
        }
        return (findSumSalaryOfOneDepartment(numberOfDepartment) / numbersOfEmployees);
    }

    private static void indexSalaryOfOneDepartment(int index, byte numberOfDepartment) {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                System.out.println(Main.employees[i].getFio() +
                        (Main.employees[i].getSalary() + Main.employees[i].getSalary() / 100 * index) + " рублей.");
            }
        }
    }

    private static void employeesOfOneDepartment(byte numberOfDepartment) {
        System.out.println("\nСотрудники отдела №" + numberOfDepartment + ":");
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getDepartment() == numberOfDepartment) {
                System.out.println("id:" + Main.employees[i].getId()
                        + " " + Main.employees[i].getFio() +
                        Main.employees[i].getSalary());
            }
        }
    }

    private static void employeesWithSalaryLessFrontierArg(double frontierArg) {
        System.out.println("\nСотрудники с зарплатой меньше чем " + frontierArg + " рублей:");
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getSalary() < frontierArg) {
                System.out.println("id:" + Main.employees[i].getId()
                        + " " + Main.employees[i].getFio() +
                        Main.employees[i].getSalary() + " рублей.");
            }
        }
    }

    private static void employeesWithSalaryMoreFrontierArg(double frontierArg) {
        System.out.println("\nСотрудники с зарплатой больше или равной " + frontierArg + " рублей:");
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i].getSalary() >= frontierArg) {
                System.out.println("id:" + Main.employees[i].getId()
                        + " " + Main.employees[i].getFio() +
                        Main.employees[i].getSalary() + " рублей.");
            }
        }
    }


    public static void main(String[] args) {
        Employee ivanovIvanIvanovich = new Employee("Иванов Иван Иванович ", 1, 170000);
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

        int index = 5;
        indexSalary(index);

        byte numberOfDepartment = 3;

        findEmployeeWithMinSalaryOfOneDepartment(numberOfDepartment);

        findEmployeeWithMaxSalaryOfOneDepartment(numberOfDepartment);

        System.out.println("\nСумма затрат на зарплаты в месяц в отделе №" + numberOfDepartment + ": "
                + findSumSalaryOfOneDepartment(numberOfDepartment) + " рублей.\n");

        indexSalaryOfOneDepartment(index, numberOfDepartment);

        System.out.println("findAverageSalaryOfOneDepartment(numberOfDepartment) = "
                + findAverageSalaryOfOneDepartment(numberOfDepartment));


        employeesOfOneDepartment(numberOfDepartment);

        double frontierArg = 100000.0;

        employeesWithSalaryLessFrontierArg(frontierArg);

        employeesWithSalaryMoreFrontierArg(frontierArg);
    }
}
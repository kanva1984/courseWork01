package cuorseWork01;

public class Main {

    public static void main(String[] args) {

        EmployeeBook workers = new EmployeeBook();

        workers.printList();
        System.out.println("Сумма затрат на зарплаты в месяц: " + workers.sumSalary() + " рублей.\n");
        workers.findMinSalary();
        workers.findMaxSalary();
        System.out.println("Средняя зарплата: " + workers.findAverageSalary() + " рублей.\n");
        workers.fioEmployee();

        int index = 5;
        workers.indexSalary(index);

        byte numberOfDepartment = 3;

        workers.findEmployeeWithMinSalaryOfOneDepartment(numberOfDepartment);

        workers.findEmployeeWithMaxSalaryOfOneDepartment(numberOfDepartment);

        System.out.println("\nСумма затрат на зарплаты в месяц в отделе №" + numberOfDepartment + ": "
                + workers.findSumSalaryOfOneDepartment(numberOfDepartment) + " рублей.\n");

        workers.indexSalaryOfOneDepartment(index, numberOfDepartment);

        System.out.println("\nСредняя зарплата в отделе №" + numberOfDepartment + " - "
                + workers.findAverageSalaryOfOneDepartment(numberOfDepartment) + " рублей.");


        workers.employeesOfOneDepartment(numberOfDepartment);

        double frontierArg = 100000.0;

        workers.employeesWithSalaryLessFrontierArg(frontierArg);
        workers.employeesWithSalaryMoreFrontierArg(frontierArg);

        Employee newEmployee = new Employee("Артём Викторович Мартынов", 1, 80000.0);

        workers.addNewEmployee(newEmployee);
        workers.printList();
        workers.printEmployeeDepartmentFio();

//        workers.deleteEmployee();

    }

}
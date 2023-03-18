package cuorseWork01;

public class EmployeeBook {
      static Employee[] employees = new Employee[10];


    public  Employee[] getEmployees() {
        return employees;
    }

    public EmployeeBook() {
        this.employees = employees;
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
    }
    public  double sumSalary() {
        double sumSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }


//
//
    public  void findMinSalary() {
        double employeeWithMinSalary = employees[0].getSalary();
        String personWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getSalary() <= employeeWithMinSalary) {
                employeeWithMinSalary = employee.getSalary();
                personWithMinSalary = employee.getFio();
            }
        }
        System.out.println("У " + personWithMinSalary + "самая маленькая зарплата: " + employeeWithMinSalary +
                " рублей.\n");
    }
//
    public void findMaxSalary() {
        double employeeWithMaxSalary = employees[0].getSalary();
        String personWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee.getSalary() >= employeeWithMaxSalary) {
                employeeWithMaxSalary = employee.getSalary();
                personWithMaxSalary = employee.getFio();
            }
        }
        System.out.println("У " + personWithMaxSalary + "самая большая зарплата: " + employeeWithMaxSalary
                + " рублей.\n");
    }

    public double findAverageSalary() {
        return sumSalary() / employees.length;
    }

    public void fioEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + ". " + employees[i].getFio());
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * index);
            System.out.println(employee.getFio() +
                    employee.getSalary() + " рублей.");
        }
    }

    public void findEmployeeWithMinSalaryOfOneDepartment(byte numberOfDepartment) {
        Employee minSalaryOf = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == numberOfDepartment) {
                if (minSalaryOf == null || employees[i].getSalary() <= minSalaryOf.getSalary()) {
                    minSalaryOf = employees[i];

                }
            }
        }
        System.out.println("\n" + minSalaryOf.getFio() + " - сотрудник с минимальной зарплатой ("
                + minSalaryOf.getSalary() + " рублей) в отделе № " + numberOfDepartment + ".");
    }

    public void findEmployeeWithMaxSalaryOfOneDepartment(byte numberOfDepartment) {
        Employee maxSalaryOf = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == numberOfDepartment) {
                if (maxSalaryOf == null || employees[i].getSalary() >= maxSalaryOf.getSalary()) {
                    maxSalaryOf = employees[i];

                }
            }
        }
        System.out.println("\n" + maxSalaryOf.getFio() + " - сотрудник с максимальной зарплатой ("
                + maxSalaryOf.getSalary() + " рублей) в отделе № " + numberOfDepartment + ".");
    }

    public double findSumSalaryOfOneDepartment(byte numberOfDepartment) {
        double sumSalaryOfOneDepartment = 0.0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == numberOfDepartment) {
                sumSalaryOfOneDepartment += employees[i].getSalary();
            }
        }
        return sumSalaryOfOneDepartment;
    }


    public double findAverageSalaryOfOneDepartment(byte numberOfDepartment) {

        int numbersOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                numbersOfEmployees += 1;
            }
        }
        return (findSumSalaryOfOneDepartment(numberOfDepartment) / numbersOfEmployees);
    }

    public void indexSalaryOfOneDepartment(int index, byte numberOfDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * index);
                System.out.println(employee.getFio() +
                        employee.getSalary() + " рублей.");
            }
        }
    }

    public void employeesOfOneDepartment(byte numberOfDepartment) {
        System.out.println("\nСотрудники отдела №" + numberOfDepartment + ":");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                System.out.println("id:" + employee.getId()
                        + " " + employee.getFio() +
                        employee.getSalary());
            }
        }
    }

    public void employeesWithSalaryLessFrontierArg(double frontierArg) {
        System.out.println("\nСотрудники с зарплатой меньше чем " + frontierArg + " рублей:");
        for (Employee employee : employees) {
            if (employee.getSalary() < frontierArg) {
                System.out.println("id:" + employee.getId()
                        + " " + employee.getFio() +
                        employee.getSalary() + " рублей.");
            }
        }
    }

    public  void employeesWithSalaryMoreFrontierArg(double frontierArg) {
        System.out.println("\nСотрудники с зарплатой больше или равной " + frontierArg + " рублей:");
        for (Employee employee : employees) {
            if (employee.getSalary() >= frontierArg) {
                System.out.println("id:" + employee.getId()
                        + " " + employee.getFio() +
                        employee.getSalary() + " рублей.");
            }
        }
    }
}

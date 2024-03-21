package structural.flyweight;

public class MainClass {

    public static void main(String[] args) {
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();

        Employee dev1 = employeeGenerator.getEmployee("Developer", "Java");

        Employee dev2 = employeeGenerator.getEmployee("Developer", "Python");

        Employee tester1 = employeeGenerator.getEmployee("Tester", "Selenium");

        Employee tester2 = employeeGenerator.getEmployee("Tester", "Automation Testing");

        dev1.task();
        dev2.task();
        tester1.task();
        tester2.task();


    }

}

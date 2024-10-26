package app;

import models.Car;
import models.Employee;

public class Lesson12 {
    public static void main(String[] args) {

        Employee vasiliy = new Employee("Vasiliy", "developer", "vasiliypupkin@ibm.com", 35387965421L, 25);
        System.out.println(vasiliy);
        Car renault = new Car();
        renault.start();
    }
}

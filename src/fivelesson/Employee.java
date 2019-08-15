package fivelesson;

import static fivelesson.EmployeeBase.default_employee;
import static fivelesson.EmployeeBase.employee;
import static fivelesson.EmployeeBase.programmer;
import static fivelesson.EmployeeBase.software_analyst;
import static fivelesson.EmployeeBase.test_engineer;

public class Employee {
    public static EmployeesData[] personList() {
        EmployeesData[] person = new EmployeesData[5];
        person[0] = default_employee;
        person[1] = employee;
        person[2] = test_engineer;
        person[3] = software_analyst;
        person[4] = programmer;
        return person;
    }

    public static void employerInfo(EmployeesData employeesData) {
        if (employeesData.getAge() >= 40) {
            System.out.println(
                    ("ФИО: " + employeesData.getFirstLastName())+
                    (" Должность: " + employeesData.getPosition()) +
                    (" email: " + employeesData.getEmail()) +
                    (" Phone: " + employeesData.getPhone()) + 
                    (" Salary: " + employeesData.getSalary()) +
                    (" Age: " + employeesData.getAge()));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < personList().length; i++) {
            employerInfo(personList()[i]);
        }
    }
}

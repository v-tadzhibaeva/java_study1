package fivelesson;

public class EmployeeBase {
    public static EmployeesData default_employee = new EmployeesData("Ivanov Ivan Ivanovich",
            "manager", "ivanov@ivan.com", "88005553535", "5000", 30);
    public static EmployeesData employee = new EmployeesData("Ivanov Ivan Ivanovich",
            "worker", "ivanov@ivan.com", "88005553535", "5000", 40);
    public static EmployeesData test_engineer = new EmployeesData("Ivanov Ivan Ivanovich",
            "qa", "ivanov@ivan.com", "88005553535", "5000", 39);
    public static EmployeesData software_analyst = new EmployeesData("Ivanov Ivan Ivanovich",
            "analyst", "ivanov@ivan.com", "88005553535", "5000", 58);
    public static EmployeesData programmer = new EmployeesData("Ivanov Ivan Ivanovich",
            "programmer", "ivanov@ivan.com", "88005553535", "5000", 24);
}

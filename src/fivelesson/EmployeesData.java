package fivelesson;

public class EmployeesData {
    private String firstLastName;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;

    public EmployeesData(String firstLastName, String position, String email, String phone, String salary, int age) {
        this.firstLastName = firstLastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public EmployeesData setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public EmployeesData setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EmployeesData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EmployeesData setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public EmployeesData setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public int getAge() {
        return age;
    }

    public EmployeesData setAge(int age) {
        this.age = age;
        return this;
    }

}

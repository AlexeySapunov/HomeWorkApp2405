package HomeWorkApp5;

public class Employee {

    public String fullName;
    public String position;
    public String email;
    public String telephoneNumber;
    public int salary;
    public byte age;

    public Employee(String fullName, String position, String email, String telephoneNumber, int salary, byte age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        if (age > 40) {
            this.age = age;
        }
    }

    public void info() {
        System.out.printf(
                "%nfullName = %s, position = %s, email = %s, telephoneNumber = %s, salary = %d, age = %d%n", fullName, position, email, telephoneNumber, salary, age);
    }
}

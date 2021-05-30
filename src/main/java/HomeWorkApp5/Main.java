package HomeWorkApp5;


public class Main {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, (byte) 30);
        employeesArray[1] = new Employee("Petrov Petr", "Accountant", "petpetr@mailbox.com", "89365421736", 35000, (byte) 41);
        employeesArray[2] = new Employee("Sergeev Sergey", "Chef", "sergserg@mailbox.com", "895864132", 25000, (byte) 25);
        employeesArray[3] = new Employee("Alexeev Alexey", "Head chef", "alexalexey@mailbox.com", "89638134565", 50000, (byte) 35);
        employeesArray[4] = new Employee("Denisov Denis", "Executive chef", "denden@mailbox.com", "89316479824", 100000, (byte) 45);

        for (Employee employee : employeesArray) {
            if (employee.age > 40) {
                employee.info();
            }
        }

    }
}

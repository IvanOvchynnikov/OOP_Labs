/**
 * Клас Employee створений для працівника
 */
public class Employee extends Human {
    double salary;
    /**
     *
     * @param name - Ім'я людини
     * @param salary - Заробітня плата працівника
     */
    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    /**
     * Даний метод виводить інформацію про заробітню плату робітника.
     */
    void display_salary() {
        System.out.println("Salary: " + this.salary);
    }
    public void display_job() {
        System.out.println("My job is employee");
    }
}

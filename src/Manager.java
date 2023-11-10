import java.util.ArrayList;
import java.util.List;
/**
 * Клас Manager створений для Менеджера , він наслідується від Employee
 */
public class Manager extends Employee {
    List<Employee> subordinates;

    /**
     *
     * @param name Імя робітника
     * @param salary Заробітня плата робітника
     */
    Manager(String name, double salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    /**
     * Додає підлеглого
     * @param employee - @link Employee робітник
     */
    void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }
    /**
     * Даний метод виводить інформацію про посаду робітника
     */
    public void display_job() {
        System.out.println("I am a manager.");
    }
    /**
     * Даний метод виводить інформацію про підлеглих робітника
     */
    void display_subordinates() {
        System.out.println("This is my subordinates:");
        for (Employee subordinate : subordinates) {
            subordinate.display_name();
        }
    }
}

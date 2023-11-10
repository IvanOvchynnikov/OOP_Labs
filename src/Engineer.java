import java.util.Arrays;
/**
 * Клас Engineer створений для девелопера, він наслідується від Employee
 */
public class Engineer extends Employee {
    String[] technicalSkills;

    /**
     *
     * @param name - Ім'я людини
     * @param salary - Заробітня плата працівника
     * @param technicalSkills - Стек скілів
     */
    Engineer(String name, double salary, String[] technicalSkills) {
        super(name, salary);
        this.technicalSkills = technicalSkills;
    }

    /**
     * Даний метод виводить інформацію про посаду робітника
     */
    public void display_job() {
        System.out.println("I am an engineer.");
    }
    /**
     * Даний метод виводить інформацію про скіли робітника
     */
    void display_skills() {
        System.out.println("Technical Skills: " + Arrays.toString(this.technicalSkills));
    }
}

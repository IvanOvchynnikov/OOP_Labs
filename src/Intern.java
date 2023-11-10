/**
 * Клас Intern створений для стажера, він наслідується від Employee
 */
public class Intern extends Employee {
    int internship_duration;

    /**
     *
     * @param name - Ім'я людини
     * @param salary - Заробітня плата працівника
     * @param internship_duration - Тривалість стажування в місяцях
     */
    Intern(String name, double salary, int internship_duration) {
        super(name, salary);
        this.internship_duration = internship_duration;
    }
    /**
     * Даний метод виводить інформацію про посаду робітника
     */
    public void display_job() {
        System.out.println("I am an intern.");
    }
    /**
     * Даний метод виводить інформацію про тривалість стажування
     */
    void display_internship_duration() {
        System.out.println("Internship Duration: " + this.internship_duration + " months");
    }
}

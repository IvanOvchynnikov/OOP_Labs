/**
 * Клас CEO створений для голови компанії, він наслідується від Manager
 */
public class CEO extends Manager {
    String company_name;

    /**
     *
     * @param name Імя працівника
     * @param salary  Заробітня плата робітника
     * @param company_name Ім'я компанії
     */
    CEO(String name, double salary, String company_name) {
        super(name, salary);
        this.company_name = company_name;
    }

    /**
     * Даний метод виводить інформацію про посаду робітника
     */
    public void display_job() {
        System.out.println("I am a CEO.");
    }
    /**
     * Даний метод виводить інформацію про назву компанію
     */
    void display_company_name() {
        System.out.println("Company: " + this.company_name);
    }
}

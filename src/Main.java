import java.lang.reflect.Array;
import java.util.*;

/**
 * Проєкт є лабораторною роботою №7
 * @author ivanovcinnikov
 */
public class Main {
    /**
     *
     * @param args Звичайні аргументи командної строки терміналу
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CEO ceo=new CEO("Ivan Ovchynnikov",8000,"SoftIV");

        Manager manager1=new Manager("Roman Uger",4000);
        Manager manager2=new Manager("Ivan Grey",4000);

        Engineer engineer1= new Engineer("Misha Pupkin", 2400,new String[]{"JavaScript","HTML","CSS","Git"});
        Engineer engineer2= new Engineer("Ivan Boss", 2400,new String[]{"Java","Git","SQL"});
        Engineer engineer3= new Engineer("Andriy Krumpel", 1600,new String[]{"HR"});

        Intern intern=new Intern("Dima Krossik",250,3);

        manager1.addSubordinate(engineer2);
        manager1.addSubordinate(engineer1);

        manager2.addSubordinate(engineer3);
        manager2.addSubordinate(intern);

        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);

        int choice=0;
        while(choice!=-1){
            System.out.println("Menu:");
            System.out.println("1. Display CEO's info");
            System.out.println("2. Display Manager's info");
            System.out.println("3. Display Engineer info");
            System.out.println("4. Display Intern info");
            System.out.println("-1. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ceo.display_name();
                    ceo.display_company_name();
                    ceo.display_salary();
                    ceo.display_subordinates();
                    break;
                case 2:
                    System.out.println("Manager 1:");
                    manager1.display_name();
                    manager1.display_salary();
                    manager1.display_subordinates();
                    System.out.println("Manager 2:");
                    manager2.display_name();
                    manager2.display_salary();
                    manager2.display_subordinates();
                    break;
                case 3:
                    engineer1.display_name();
                    engineer1.display_salary();
                    engineer1.display_skills();
                    break;
                case 4:
                    intern.display_name();
                    intern.display_salary();
                    intern.display_internship_duration();
                    break;
                case -1:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Клас OvchiScanner надає методи для безпечного зчитування введення користувача різних типів з вказаними обмеженнями,
 * такими як довжина рядка, діапазон цілих чисел та діапазон дійсних чисел.
 */
public class OvchiScanner {
    private Scanner scanner;

    /**
     * Конструктор класу OvchiScanner ініціалізує об'єкт Scanner.
     */
    public OvchiScanner() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Зчитує та повертає рядок з введення користувача,з довжиною від 1 до 100 символів.
     *
     * @return Рядок, введений користувачем.
     */
    public String get_string() {
        return get_string(1, 100);
    }

    /**
     * Зчитує та повертає рядок введений користувачем із заданим діапазоном.
     *
     * @param min_length Мінімальна довжина рядка.
     * @param max_length Максимальна довжина рядка.
     * @return Рядок, введений користувачем.
     */
    public String get_string(int min_length, int max_length){
        String ans;
        while (true) {
            ans = this.scanner.next();
            try {
                if (ans.length() < min_length || ans.length() > max_length) {
                    throw new StringLengthException("Недійсне значення");
                }
                break;
            } catch (StringLengthException e) {
                System.out.println("Ви ввели неправильний рядок, введіть ще раз:");
            }
        }
        return ans;
    }

    /**
     * Зчитує та повертає число з введене користувачем,з діапазоном від -10000000 до 10000000.
     *
     * @return Ціле число, введене користувачем.
     */
    public int get_int() {
        return get_int(-10000000, 10000000);
    }

    /**
     * Зчитує та повертає ціле число введене користувачем з вказаним діапазоном.
     *
     * @param min_value Мінімальне допустиме значення цілого числа.
     * @param max_value Максимальне допустиме значення цілого числа.
     * @return Ціле число, введене користувачем.
     */
    public int get_int(int min_value, int max_value){
        int ans;
        while (true) {
            try {
                ans = this.scanner.nextInt();
                if (ans < min_value || ans > max_value) {
                    throw new StringLengthException("Недійсне значення");
                }
                break;
            } catch (StringLengthException e) {
                System.out.println("Ви ввели значення, яке не входить в діапазон: [" + min_value + " ; " + max_value + "] введіть ще раз:");
            } catch (InputMismatchException e) {
                System.out.println("Ви ввели неправильне значення, введіть ще раз:");
                this.scanner.next();
            }
        }
        return ans;
    }

    /**
     * Зчитує та повертає дійсне число введенне користувачем,з діапазоном від -10000000.0 до 10000000.0.
     *
     * @return Дійсне число, введене користувачем.
     */
    public double get_double() {
        return get_double(-10000000.0, 10000000.0);
    }

    /**
     * Зчитує та повертає дійсне число введене користувачем з вказаним діапазоном.
     *
     * @param min_value Мінімальне допустиме значення дійсного числа.
     * @param max_value Максимальне допустиме значення дійсного числа.
     * @return Дійсне число, введене користувачем.
     */
    public double get_double(double min_value, double max_value) {
        double ans;
        while (true) {
            try {
                ans = this.scanner.nextDouble();
                if (ans < min_value || ans > max_value) {
                    throw new StringLengthException("Недійсне значення");
                }
                break;
            } catch (StringLengthException e) {
                System.out.println("Ви ввели значення, яке не входить в діапазон: [" + min_value + " ; " + max_value + "] введіть ще раз:");
            } catch (InputMismatchException e) {
                System.out.println("Ви ввели неправильне значення, введіть ще раз:");
                this.scanner.next();
            }
        }
        return ans;
    }
}

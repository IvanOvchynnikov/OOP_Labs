/**
 * Клас Main є головним у програмі
 */
public class Main {

    /**
     * Метод main ініціалізує екземпляр класу OvchiScanner та використовує його для отримання введення користувача
     * для імені, віку, ставки депозиту та цілочисельного значення.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        // Створення екземпляру класу OvchiScanner
        OvchiScanner scanner = new OvchiScanner();

        // Отримання та виведення імені користувача
        System.out.println("Введіть ваше ім'я:");
        String name = scanner.get_string(2, 100);
        System.out.println("Ваше ім'я: " + name);

        // Отримання та виведення віку користувача
        System.out.println("Введіть ваш вік:");
        int age = scanner.get_int(18, 100);
        System.out.println("Ваш вік: " + age);

        // Отримання та виведення ставки депозиту користувача
        System.out.println("Введіть ставку депозиту:");
        double rate = scanner.get_double(0.1, 100.0);
        System.out.println("Ваша ставка: " + rate);

        // Отримання та виведення цілочисельного значення, введеного користувачем
        System.out.println("Введіть ціле значення:");
        int val = scanner.get_int();
        System.out.println("Ваше значення: " + val);
    }
}

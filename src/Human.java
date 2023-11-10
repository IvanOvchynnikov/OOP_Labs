/**
 * Клас Human є абстрактним
 */
public abstract class Human{
    public String name;

    /**
     * Конструктор класу Human
     * @param name Ім'я людини
     */
    Human(String name){
        this.name=name;
    }

    /**
     * Функція, яка виводить ім'я екзкмпляра класу Human
     */
    public void display_name(){
        System.out.println(this.name);
    }

    /**
     * Абстрактна функція для "наслідників"
     */
    public abstract void display_job();
}

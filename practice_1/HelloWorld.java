package practice_1;

public class HelloWorld {
    int age;
    String name;

    // Конструктор
    public HelloWorld(int someAge, String someName) {
        age = someAge;
        name = someName;
    }

    // Геттеры
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Сеттеры
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        // Создание объекта
        HelloWorld petya = new HelloWorld(18, "Petya");

        // Вывод начальных данных
        System.out.println("Возраст: " + petya.getAge()); // 18
        System.out.println("Имя: " + petya.getName()); // Petya

        // Изменение данных
        petya.setAge(19); // Увеличиваем возраст
        petya.setName("Petr"); // Меняем имя

        // Вывод изменённых данных
        System.out.println("Новый возраст: " + petya.getAge()); // 19
        System.out.println("Новое имя: " + petya.getName()); // Petr
    }
}
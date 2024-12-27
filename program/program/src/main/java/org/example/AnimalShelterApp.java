package org.example;
// Импорты
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalShelterApp {

    public static void main(String[] args) {
        // Список животных
        List<ShelterAnimal> animals = new ArrayList<>();

        // Создаем Scanner для пользовательского ввода
        Scanner scanner = new Scanner(System.in);

        // Основной цикл программы
        while (true) {
            System.out.println("\n=== Питомник для бездомных животных ===");
            System.out.println("1. Добавить животное");
            System.out.println("2. Показать всех животных");
            System.out.println("3. Выйти");

            // Читаем выбор пользователя
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем ввод

            if (choice == 1) {
                // Добавление животного
                System.out.print("Введите имя животного: ");
                String name = scanner.nextLine();
                System.out.print("Введите вид животного: ");
                String species = scanner.nextLine();
                System.out.print("Введите возраст животного: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Очищаем ввод

                // Создаем объект животного и добавляем его в список
                animals.add(new ShelterAnimal(name, species, age));
                System.out.println("Животное успешно добавлено!");

            } else if (choice == 2) {
                // Показ всех животных
                System.out.println("\n=== Список животных ===");
                for (ShelterAnimal animal : animals) {
                    System.out.println(animal);
                }

            } else if (choice == 3) {
                // Завершение работы
                System.out.println("Спасибо за посещение питомника!");
                break;
            } else {
                System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        // Закрываем Scanner
        scanner.close();
    }
}

// Класс для хранения данных о животном
class ShelterAnimal {
    // Поля класса
    private String name;    // Имя животного
    private String species; // Вид животного
    private int age;        // Возраст животного

    // Конструктор
    public ShelterAnimal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Метод для преобразования объекта в строку
    @Override
    public String toString() {
        return "Имя: " + name + ", Вид: " + species + ", Возраст: " + age + " лет";
    }
}


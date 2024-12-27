package org.example;
// Импорты для использования коллекций
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TouristAgencyApp {
    // Главный класс приложения

        public static void main(String[] args) {
            // Создаем список пользователей агентства
            List<TouristAgencyUser> users = new ArrayList<>();

            // Создаем Scanner для ввода данных от пользователя
            Scanner scanner = new Scanner(System.in);

            // Основное меню приложения
            while (true) {
                System.out.println("\n=== Туристическое агентство ===");
                System.out.println("1. Добавить пользователя");
                System.out.println("2. Показать всех пользователей");
                System.out.println("3. Выйти");

                // Читаем выбор пользователя
                System.out.print("Введите номер действия: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка ввода

                if (choice == 1) {
                    // Добавляем нового пользователя
                    System.out.print("Введите имя пользователя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите возраст пользователя: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Очистка ввода
                    System.out.print("Введите страну назначения: ");
                    String destination = scanner.nextLine();

                    // Создаем объект пользователя и добавляем его в список
                    users.add(new TouristAgencyUser(name, age, destination));
                    System.out.println("Пользователь успешно добавлен!");

                } else if (choice == 2) {
                    // Показ всех пользователей
                    System.out.println("\n=== Список пользователей ===");
                    for (TouristAgencyUser user : users) {
                        System.out.println(user);
                    }

                } else if (choice == 3) {
                    // Выход из программы
                    System.out.println("Спасибо за использование агентства!");
                    break;
                } else {
                    System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }

            // Закрываем Scanner
            scanner.close();
        }
    }

    // Класс для хранения данных о пользователе туристического агентства
    class TouristAgencyUser {
        // Поля класса
        private String name;         // Имя пользователя
        private int age;             // Возраст пользователя
        private String destination;  // Страна назначения

        // Конструктор для инициализации полей
        public TouristAgencyUser(String name, int age, String destination) {
            this.name = name;
            this.age = age;
            this.destination = destination;
        }

        // Метод для преобразования объекта в строку
        @Override
        public String toString() {
            return "Имя: " + name + ", Возраст: " + age + ", Страна назначения: " + destination;
        }
    }

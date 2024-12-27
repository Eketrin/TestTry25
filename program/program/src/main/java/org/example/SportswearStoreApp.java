package org.example;
// Импорты
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportswearStoreApp {
    public static void main(String[] args) {
        // Список покупателей
        List<SportswearStoreCustomer> customers = new ArrayList<>();

        // Создаем Scanner для пользовательского ввода
        Scanner scanner = new Scanner(System.in);

        // Основной цикл программы
        while (true) {
            System.out.println("\n=== Магазин спортивной одежды ===");
            System.out.println("1. Добавить покупателя");
            System.out.println("2. Показать всех покупателей");
            System.out.println("3. Выйти");

            // Читаем выбор пользователя
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем ввод

            if (choice == 1) {
                // Добавление покупателя
                System.out.print("Введите имя покупателя: ");
                String name = scanner.nextLine();
                System.out.print("Введите размер одежды: ");
                String size = scanner.nextLine();
                System.out.print("Введите купленный товар: ");
                String item = scanner.nextLine();

                // Создаем объект покупателя и добавляем его в список
                customers.add(new SportswearStoreCustomer(name, size, item));
                System.out.println("Покупатель успешно добавлен!");

            } else if (choice == 2) {
                // Показ всех покупателей
                System.out.println("\n=== Список покупателей ===");
                for (SportswearStoreCustomer customer : customers) {
                    System.out.println(customer);
                }

            } else if (choice == 3) {
                // Завершение работы
                System.out.println("Спасибо за посещение магазина!");
                break;
            } else {
                System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        // Закрываем Scanner
        scanner.close();
    }
}

// Класс для хранения данных о покупателе спортивной одежды
class SportswearStoreCustomer {
    // Поля класса
    private String name; // Имя покупателя
    private String size; // Размер одежды
    private String item; // Название купленного товара

    // Конструктор
    public SportswearStoreCustomer(String name, String size, String item) {
        this.name = name;
        this.size = size;
        this.item = item;
    }

    // Метод для преобразования объекта в строку
    @Override
    public String toString() {
        return "Имя: " + name + ", Размер: " + size + ", Товар: " + item;
    }
}

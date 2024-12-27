package org.example;
// Импорты для работы с коллекциями
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JewelryShopApp {
    // Главный класс приложения
    public static void main(String[] args) {
        // Список покупателей магазина
        List<JewelryShopCustomer> customers = new ArrayList<>();

        // Создаем Scanner для пользовательского ввода
        Scanner scanner = new Scanner(System.in);

        // Основной цикл программы
        while (true) {
            System.out.println("\n=== Магазин ювелирных украшений ===");
            System.out.println("1. Добавить покупателя");
            System.out.println("2. Показать всех покупателей");
            System.out.println("3. Выйти");

            // Считываем выбор пользователя
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем ввод

            if (choice == 1) {
                // Добавление покупателя
                System.out.print("Введите имя покупателя: ");
                String name = scanner.nextLine();
                System.out.print("Введите номер телефона покупателя: ");
                String phone = scanner.nextLine();
                System.out.print("Введите сумму покупки: ");
                double purchaseAmount = scanner.nextDouble();
                scanner.nextLine(); // Очищаем ввод

                // Создаем объект покупателя и добавляем его в список
                customers.add(new JewelryShopCustomer(name, phone, purchaseAmount));
                System.out.println("Покупатель успешно добавлен!");

            } else if (choice == 2) {
                // Вывод всех покупателей
                System.out.println("\n=== Список покупателей ===");
                for (JewelryShopCustomer customer : customers) {
                    System.out.println(customer);
                }

            } else if (choice == 3) {
                // Завершение работы приложения
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

// Класс для хранения данных о покупателе ювелирного магазина
class JewelryShopCustomer {
    // Поля класса
    private String name;           // Имя покупателя
    private String phone;          // Телефон покупателя
    private double purchaseAmount; // Сумма покупки

    // Конструктор для инициализации полей
    public JewelryShopCustomer(String name, String phone, double purchaseAmount) {
        this.name = name;
        this.phone = phone;
        this.purchaseAmount = purchaseAmount;
    }

    // Метод для преобразования объекта в строку
    @Override
    public String toString() {
        return "Имя: " + name + ", Телефон: " + phone + ", Сумма покупки: " + purchaseAmount;
    }
}

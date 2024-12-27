package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildingStoreApp {
        public static void main(String[] args) {
            // Список товаров
            List<BuildingStoreItem> items = new ArrayList<>();

            // Создаем Scanner для пользовательского ввода
            Scanner scanner = new Scanner(System.in);

            // Основной цикл программы
            while (true) {
                System.out.println("\n=== Строительный магазин ===");
                System.out.println("1. Добавить товар");
                System.out.println("2. Показать все товары");
                System.out.println("3. Выйти");

                // Читаем выбор пользователя
                System.out.print("Введите номер действия: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очищаем ввод

                if (choice == 1) {
                    // Добавление товара
                    System.out.print("Введите название товара: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите цену товара: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Очищаем ввод
                    System.out.print("Введите количество на складе: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Очищаем ввод

                    // Создаем объект товара и добавляем его в список
                    items.add(new BuildingStoreItem(name, price, quantity));
                    System.out.println("Товар успешно добавлен!");

                } else if (choice == 2) {
                    // Показ всех товаров
                    System.out.println("\n=== Список товаров ===");
                    for (BuildingStoreItem item : items) {
                        System.out.println(item);
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

    // Класс для хранения данных о товаре
    class BuildingStoreItem {
        // Поля класса
        private String name;     // Название товара
        private double price;    // Цена товара
        private int quantity;    // Количество на складе

        // Конструктор
        public BuildingStoreItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Метод для преобразования объекта в строку
        @Override
        public String toString() {
            return "Товар: " + name + ", Цена: " + price + ", Количество: " + quantity;
        }
    }

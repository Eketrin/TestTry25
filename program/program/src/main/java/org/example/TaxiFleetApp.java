package org.example;
// Импорты
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiFleetApp {
        public static void main(String[] args) {
            // Список автомобилей
            List<TaxiCar> cars = new ArrayList<>();

            // Создаем Scanner для пользовательского ввода
            Scanner scanner = new Scanner(System.in);

            // Основной цикл программы
            while (true) {
                System.out.println("\n=== Таксопарк ===");
                System.out.println("1. Добавить автомобиль");
                System.out.println("2. Показать все автомобили");
                System.out.println("3. Выйти");

                // Читаем выбор пользователя
                System.out.print("Введите номер действия: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очищаем ввод

                if (choice == 1) {
                    // Добавление автомобиля
                    System.out.print("Введите марку автомобиля: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель автомобиля: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите год выпуска автомобиля: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Очищаем ввод

                    // Создаем объект автомобиля и добавляем его в список
                    cars.add(new TaxiCar(brand, model, year));
                    System.out.println("Автомобиль успешно добавлен!");

                } else if (choice == 2) {
                    // Показ всех автомобилей
                    System.out.println("\n=== Список автомобилей ===");
                    for (TaxiCar car : cars) {
                        System.out.println(car);
                    }

                } else if (choice == 3) {
                    // Завершение работы
                    System.out.println("Спасибо за использование таксопарка!");
                    break;
                } else {
                    System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }

            // Закрываем Scanner
            scanner.close();
        }
    }

    // Класс для хранения данных об автомобиле
    class TaxiCar {
        // Поля класса
        private String brand; // Марка автомобиля
        private String model; // Модель автомобиля
        private int year;     // Год выпуска

        // Конструктор
        public TaxiCar(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Метод для преобразования объекта в строку
        @Override
        public String toString() {
            return "Марка: " + brand + ", Модель: " + model + ", Год выпуска: " + year;
        }
    }

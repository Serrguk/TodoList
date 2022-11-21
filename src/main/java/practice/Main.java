package practice;

import java.util.Scanner;

public class Main {
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {
        System.out.println("Вас приветствует список дел! Перечень возможных команд:\n " +
                "\t1 - добавление дела в конец списка;\n" +
                "\t2 - добавление дела на указанный индекс;\n" +
                "\t3 - замена дела на новое в указанном индексе;\n" +
                "\t4 - удаление дела с указанным индексом;\n" +
                "\t5 - вывод списка всех дел.\n" +
                "Для управления списком нажимайте соответствующие цифры.\n" +
                "Для завершения работы нажмите 0.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            int index;
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            switch (input) {
                case "1" -> {
                    System.out.println("Введите дело для добавления: ");
                    input = scanner.nextLine();
                    todoList.add(input);
                }
                case "2" -> {
                    System.out.println("Введите индекс, на который нужно добавить дело: ");
                    index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Введите дело для добавления: ");
                    input = scanner.nextLine();
                    todoList.add(index, input);
                }
                case "3" -> {
                    System.out.println("Введите индекс дела, которое требуется заменить: ");
                    index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Введите дело для замены: ");
                    input = scanner.nextLine();
                    todoList.edit(index, input);
                }
                case "4" -> {
                    System.out.println("Введите индекс дела, которое требуется удалить: ");
                    index = Integer.parseInt(scanner.nextLine());
                    todoList.delete(index);
                }
                case "5" -> {
                    int count = 0;
                    if (todoList.getTodos().isEmpty()) {
                        System.out.println("Список пуст!");
                    } else {
                        for (String s : todoList.getTodos()) {
                            System.out.printf("%d) - %s\n", count, s);
                            count++;
                        }
                    }
                }
            }
            System.out.println("1 - добавление, 2 - добавление с индексом, 3 - замена, 4 - удаление, 5 - вывод, 0 - выход");
        }
    }
}

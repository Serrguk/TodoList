package practice;

import java.util.Scanner;

public class Main {
    public static final TodoList TODO_LIST = new TodoList();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вас приветствует список дел! Перечень возможных команд:\n " +
                "\t1 - добавление дела в конец списка;\n" +
                "\t2 - добавление дела на указанный номер;\n" +
                "\t3 - замена дела на новое по указанному номеру;\n" +
                "\t4 - удаление дела с указанным номером;\n" +
                "\t5 - вывод списка всех дел.\n" +
                "Для управления списком нажимайте соответствующие цифры.\n" +
                "Для завершения работы нажмите 0.");

        Listener listener = new Listener();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                try {
                    listener.listen(TODO_LIST, input);
                } catch (IllegalArgumentException exception) {
                    System.out.println("Некорректно введённый номер дела!");
                }
            }
            System.out.println("1 - добавление, 2 - добавление на номер, " +
                    "3 - замена, 4 - удаление, 5 - вывод, 0 - выход");
        }
    }
}

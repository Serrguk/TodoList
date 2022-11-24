package practice;

public class Listener {
    public void listen(TodoList todoList, String input) throws IllegalArgumentException {
        int index;
        switch (input) {
            case "1" -> {
                System.out.println("Введите дело для добавления: ");
                input = Main.scanner.nextLine();
                todoList.add(input);
            }
            case "2" -> {
                System.out.println("Введите номер, на который нужно добавить дело: ");
                index = Integer.parseInt(Main.scanner.nextLine());
                System.out.println("Введите дело для добавления: ");
                input = Main.scanner.nextLine();
                todoList.add(index, input);
            }
            case "3" -> {
                System.out.println("Введите номер дела, которое требуется заменить: ");
                index = Integer.parseInt(Main.scanner.nextLine());
                System.out.println("Введите дело для замены: ");
                input = Main.scanner.nextLine();
                todoList.edit(index, input);
            }
            case "4" -> {
                System.out.println("Введите номер дела, которое требуется удалить: ");
                index = Integer.parseInt(Main.scanner.nextLine());
                todoList.delete(index);
            }
            case "5" -> {
                int count = 0;
                if (todoList.getTodos().isEmpty()) {
                    System.out.println("Список пуст!");
                } else {
                    for (String s : todoList.getTodos()) {
                        System.out.printf("Дело номер %d: %s\n", count, s);
                        count++;
                    }
                }
            }
        }
    }
}

package practice;

import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        if (todoList.size() + 1 == index) {
            todoList.add(todo);
        } else {
            try {
                todoList.add(index, todo);
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Добавление невозможно, указанного номера не существует");
            }
        }
    }

    public void edit(int index, String todo) {
        try {
            todoList.remove(index);
            todoList.add(index, todo);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Замена невозможна, указанного номера не существует");
        }
    }

    public void delete(int index) {
        try {
            todoList.remove(index);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Удаление невозможно, указанного номера не существует");
        }
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }
}
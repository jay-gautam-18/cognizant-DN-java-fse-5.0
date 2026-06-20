public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task(1, "Prep Vegetables", "In Progress"));
        taskManager.addTask(new Task(2, "Marinate Chicken", "In Progress"));
        taskManager.addTask(new Task(3, "Boil Water", "Done"));
        taskManager.addTask(new Task(4, "Clean Station", "Done"));
        taskManager.addTask(new Task(5, "Plate Dish", "Done"));

        System.out.println();

        taskManager.traverseTask();

        System.out.println();

        taskManager.searchTask(1);

        System.out.println();

        taskManager.deleteTask(5);
        taskManager.traverseTask();
    }
}
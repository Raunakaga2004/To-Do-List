public class Main {
    public static void main(String[] args) throws Exception {
        ToDoList list = new ToDoList();

        list.headTask = list.add();
        list.headTask = list.add();
        list.headTask = list.add();
        list.displayTasks();
        list.detailedDisplayTasks();
        list.markComplete(2);

        ToDoList list2 = list.categorizeTasks("daily");
        list2.detailedDisplayTasks();
        ToDoList list3 = list.categorizeTasksCompleted(true);
        list3.detailedDisplayTasks();
        System.out.println(list.displayProgress());

    }
}
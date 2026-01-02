import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);
    List<Task> tasks = new ArrayList<>();
    int taskIdCounter = 1;

    TaskManager(){
        this.run();
    }

    public void displayMenu(){
        System.out.println("Welcome, choose: ");
        System.out.println("[1]- Add New Task");
        System.out.println("[2]- View All Tasks");
        System.out.println("[3]- View One Task");
        System.out.println("[4]- Delete One Task");
        System.out.println("[5]- EXIT\n");

    }

    public void exit(){
        this.isRunning = false;
    }

    public Priority getPriority(int _choice){
        return _choice == 1 ? Priority.HIGH : _choice == 2 ? Priority.MEDIUM : Priority.LOW;
    }

    public void addTask(){
        String taskDescription;
        int taskPriority;
        System.out.println("*******************");
        System.out.println("ADD TASK START");
        try{
            System.out.println("Description: ");
            taskDescription = scanner.nextLine();
            System.out.println("Priority [1- High / 2- Medium / 3- Low]");
            taskPriority = scanner.nextInt();
            tasks.add(new Task(this.taskIdCounter++,taskDescription,this.getPriority(taskPriority)));
            System.out.println("SUCCESSFULLY ADDED TASK");
        } catch (Exception e) {
            System.out.println("I warn you!!");
            System.out.println("FAILED ADDED TASK");
        }
        scanner.nextLine();

        System.out.println("*******************");
    }

    public void printAllTasks(){
        System.out.println("**************************");
        System.out.println("Print Start");

        if(tasks.isEmpty()){
            System.out.println("EMPTY LIST");
        }else{
            for (Task task : tasks){
                task.print();
            }
        }
        System.out.println("Print End");
        System.out.println("**************************");
    }

    public void printTask(){
        System.out.println("Enter id: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Task task: tasks){
            if(task.ID == taskId){
                task.print();
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No Task with ID: "+ taskId);
        }
    }

    public void deleteTask(){
        System.out.println("ID:");

        int id =scanner.nextInt();
                scanner.nextLine();

        boolean found = tasks.removeIf(t -> t.ID == id);
        if(found)
            System.out.println("SUCCESSFULLY DELETED");
        else
            System.out.println("Not Removed!!");
        System.out.println("*********************");
    }

    public void doAction(){
        int choice = -1;
        try{
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Why not typing an integer?! ");
        }
        scanner.nextLine();

        switch (choice){
            case 1:
                this.addTask();
                break;
            case 2:
                this.printAllTasks();
                break;
            case 3:
                this.printTask();
                break;
            case 4:
                this.deleteTask();
                break;
            case 5:
                this.exit();
                break;
        }
    }

    public void run(){
        while(isRunning){
            this.displayMenu();
            this.doAction();
        }

        System.out.println("GOOD BYE");
        scanner.close();
    }
}

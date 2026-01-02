import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    ArrayList<Task> tasks = new ArrayList<>();

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

        choice = scanner.nextInt();
        scanner.nextLine();
    }

    public void exit(){
        this.isRunning = false;
    }

    public String getPriority(int _choice){
        return _choice == 1 ? "high" : _choice == 2 ? "medium" : "low";
    }

    public void addTask(){
        String taskDescription;
        int taskPriority;
        System.out.println("*******************");
        System.out.println("ADD TASK START");
        System.out.println("Description: ");
        taskDescription = scanner.nextLine();
        System.out.println("Priority [1- High / 2- Medium / 3- Low]");
        taskPriority = scanner.nextInt();
        scanner.nextLine();

        tasks.add(new Task(tasks.size()+1,taskDescription,this.getPriority(taskPriority)));
        System.out.println("SUCCESSFULLY ADDED TASK");
        System.out.println("*******************");
    }

    public void printAllTasks(){
        System.out.println("**************************");
        System.out.println("Print Start");
        for (Task task : tasks){
            task.print();
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

    public void doAction(){
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
                System.out.println("ACTION FOUR");
                break;
            default:
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

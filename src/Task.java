public class Task {
    int ID;
    String description;
    String priority;

    Task(int ID, String description, String priority){
        this.ID = ID;
        this.description = description;
        this.priority = priority;
    }

    public void print(){
        System.out.printf("[%d] - %s - %S\n",this.ID, this.description, this.priority);
    }
}

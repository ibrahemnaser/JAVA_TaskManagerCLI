public class Task {
    int ID;
    String description;
    Priority priority;

    Task(int ID, String description, Priority priority){
        this.ID = ID;
        this.description = description;
        this.priority = priority;
    }

    public void print(){
        System.out.printf("[%d] - %s - %S\n",this.ID, this.description, this.priority);
    }

    @Override
    public String toString(){
        return "["+this.ID+"] - "+this.description+" - "+this.priority;
    }
}

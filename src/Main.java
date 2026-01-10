public class Main {
    public static void main(String[] args) {
        /*
         * A CLI task manager
         * - each task: {int ID, String Description, String Priority}
         * - task manager: {display menu ['1- add new task',
         *                                '2- view all tasks',
         *                                '3- view a task',
         *                                '4- delete a task'] }
         * */

//        new TaskManager();

        Vehicle vehicle1 = new Car("Mercedes",2022,3,"Petroleum");
        Vehicle vehicle2 = new Vehicle("BMW",2024);

        vehicle2.start();
        vehicle1.start();

        vehicle2.displayInfo();
        vehicle1.displayInfo();

        ((Car) vehicle1).honk();

    }

}
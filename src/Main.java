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

        /*
         * Learn File Handling
         * */

        new MyFileHandler();
        try{
            checkNumber(-34);
        }catch(NumberFormatException e){
            System.out.println("Error");
        } catch (NumberNotSuitableException e) {
            System.out.println("HELLO");
        }

    }

    static void checkNumber(int num) throws NumberNotSuitableException{
        if(num <= 0){
            throw new NumberNotSuitableException();
        }
    }
}
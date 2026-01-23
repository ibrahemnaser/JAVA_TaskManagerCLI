public class Main {
    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println("JAVA DATA STRUCTURE");
        System.out.println("*******************");

        Stack<Integer> stk = new Stack<>(5);
        stk.push(324);
        stk.push(3);
        stk.pop();
        stk.push(24);
        stk.pop();
        stk.push(4);
        stk.display();
    }
}
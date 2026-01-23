public class Stack<T> {
    private int top;
    private final int capacity;
    private final T[] stackArr;

    @SuppressWarnings("unchecked")
    public Stack(int size){
        this.top = -1;
        this.capacity= size;
        this.stackArr = (T[]) new Object[size];
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T ele){
        if(this.isFull()){
            System.out.println("Stack is full!!");
        }else{
            this.stackArr[++top] = ele;
        }
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Empty");
            return null;
        }
        return this.stackArr[top--];
    }

    public void display(){
        for (int i = top; i > -1; i--) {
            System.out.println(this.stackArr[i]);
        }
    }
}

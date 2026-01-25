public class LinkedList<T> {
    private Node<T> head;
    private int length;
    private final int SIZE;

    public LinkedList(int size) {
        this.head = null;
        this.length = 0;
        this.SIZE = size;
    }

    public boolean isFull() {
        return this.length == this.SIZE;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertFirst(T data) {
        if (isFull()) {
            throw new RuntimeException("List is full!!");
        }

        Node<T> newNode = new Node<>(data);
        if (!isEmpty()) {
            newNode.next = this.head;
        }
        this.head = newNode;
        this.length++;
    }

    public T removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("List is Empty!!");
        }
        T data = this.head.data;
        this.head.data = null; // better for garbage collector
        this.head = this.head.next;
        this.length--;
        return data;
    }

    public void insertLast(T data) {
        if (isFull()) {
            throw new RuntimeException("List is full!!");
        }

        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        this.length++;
    }


    public T removeLast(){
        if(isEmpty()){
            throw new RuntimeException("List is Empty!!");
        }

        Node<T> current = this.head;
        while(current.next.next != null){
            current = current.next;
        }

        T data=current.next.data;
        current.next.data = null; // better for garbage collector
        current.next = null;

        this.length--;
        return data;
    }

    public T remove(T data){
        if(this.head.data.equals(data)){
            return this.removeFirst();
        }

        Node<T> current = this.head;
        while(current.next!=null){
            if(current.next.data.equals(data)){
                break; // target at next
            }
            current = current.next;
        }

        if(current.next == null) throw new RuntimeException(data+"Not Found!!");

        Node<T> foundNode = current.next;
        T foundData = foundNode.data;
        foundNode.data = null; // garbage
        current.next = foundNode.next;
        foundNode.next = null; // garbage

        this.length--;
        return foundData;
    }

    public void reverse(){
        if(isEmpty()) throw new RuntimeException("List is Empty");
        if(this.length == 1) return;

        Node<T> stable = this.head;
        Node<T> moving = this.head.next;
        while(moving != null){
            Node<T> temp = moving.next;
            stable.next = temp;
            moving.next = this.head;
            this.head = moving;
            moving = temp;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty List!!");
            return;
        }

        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.print('\n');
    }

    public int search(T data) throws Exception {
        Node<T> current = this.head;
        int i = 0;
        while (current != null) {
            if (current.data.equals(data)) return i;
            current = current.next;
            i++;
        }
        throw new Exception(data + " Not Found!!");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = this.head;

        sb.append("[");
        while(current != null){
            sb.append(current.data);
            if(current.next != null) sb.append(" -> ");
            current = current.next;
        }
        sb.append("]");

        return sb.toString();
    }
}

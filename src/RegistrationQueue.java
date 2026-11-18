public class RegistrationQueue {
    private Node<RegistrationRequest> front;
    private Node<RegistrationRequest> rear;
    private int size;
    RegistrationQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    public Node<RegistrationRequest> getFront() {
        return front;
    }

    public Node<RegistrationRequest> getRear() {
        return rear;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void enqueue(RegistrationRequest request){
        if (isEmpty()){
            front = rear = new Node<>(request);
            size++;
            return;
        }

        rear.next = new Node<>(request);
        rear = rear.next;
        size++;

    }

    public RegistrationRequest dequeue(){
        if(isEmpty()){
            return null;
        }

        RegistrationRequest fifoRequest = front.data;

        if(front == rear){
            rear = null;
        }

        front = front.next;
        size--;
        return fifoRequest;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }

        Node<RegistrationRequest> current = front;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

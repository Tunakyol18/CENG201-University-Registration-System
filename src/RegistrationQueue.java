public class RegistrationQueue {

    //We are going to need two node reference to make it a Queue
    private Node<RegistrationRequest> front;
    private Node<RegistrationRequest> rear;
    private int size;


    RegistrationQueue(){
        front = null;
        rear = null;
        size = 0;
    }


    //Getter Methods:
    public Node<RegistrationRequest> getFront() {
        return front;
    }

    public Node<RegistrationRequest> getRear() {
        return rear;
    }

    public int size() {
        return size;
    }


    //To check if the queue is empty:
    public boolean isEmpty(){
        return (front == null);
    }


    //Adding an element method "Enqueue":
    public void enqueue(RegistrationRequest request){

        //If queue is empty make the rear and front point to the same element:
        if (isEmpty()){
            front = rear = new Node<>(request);
            size++;
            return;
        }

        //If not, just bend the new element to the rear and slide the rear:
        rear.next = new Node<>(request);
        rear = rear.next;
        size++;
    }


    //Method to remove the first element:
    public RegistrationRequest dequeue(){

        //If it's already empty return null:
        if(isEmpty()){
            return null;
        }

        //Create a new variable to hold removing item to return:
        RegistrationRequest fifoRequest = front.data;

        //If it's the only element make the rear null;
        if(front == rear){
            rear = null;
        }

        front = front.next;
        size--;
        return fifoRequest;
    }


    //Print each while traveling the list:
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

public class DropStack {


    //Since it's a stack, only one pointer that points the head is enough here:
    Node<DropRecord> top;
    int size;


    DropStack(){
        top = null;
        size = 0;
    }

    public int getSize() { return size; }


    //Check if it's Empty stack:
    public boolean isEmpty(){
        return (top == null);
    }

    //Since the only pointer is "top" it's enough create a new Node
    //and bend its next to top,
    //then just make the new top new Node:
    public void push(DropRecord record){

        Node<DropRecord> newRecord = new Node<>(record);
        newRecord.next = top;
        top = newRecord;
        size++;
    }

    //To  remove the top element:
    public DropRecord pop(){

        //Not to get null pointer exception:
        if (isEmpty()){
            return null;
        }

        //just slide top one node:
        DropRecord removed = top.data;
        top = top.next;
        size--;
        return removed;
    }


    public DropRecord peek(){

        //Not to get null pointer exception:
        if (isEmpty()){ return null; }

        return top.data;
    }

    //To print the whole linkedList stack:
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node<DropRecord> temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

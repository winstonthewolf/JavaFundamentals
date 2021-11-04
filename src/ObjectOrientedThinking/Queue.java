package ObjectOrientedThinking;

public class Queue {


    /* TODO: Test class for functionality: DONE
    * Finish last part of problem
    *
    *
    * */

    public static void main(String [] args){

        Queue myQueue = new Queue();
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        System.out.println(myQueue.empty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.empty());

    }
    int [] elements;
    int size;

    Queue(){
        elements = new int [8];
    }

    public void enqueue(int v){
        if(size >= elements.length){
            elements = new int [elements.length * 2];
        }
        elements[size] = v;
        size++;
    }

    public int dequeue(){
        return elements[--size];
    }

    public boolean empty(){
        return (size == 0);
    }

    public int getSize(){
        return size;
    }
}

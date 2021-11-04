package ObjectOrientedThinking;

public class Queue {


    //TODO: Test class for functionality

    public static void main(String [] args){

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

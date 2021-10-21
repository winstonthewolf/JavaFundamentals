package ObjectOrientedThinking;

public class StackOfIntegers {

    int [] elements;
    int size;
    public static final int DEFAULT_CAPACITY = 16;

    public static void main(String [] args){
        StackOfIntegers stack_1 = new StackOfIntegers();
        stack_1.push(8);
        stack_1.push(6);
        stack_1.push(2);
        stack_1.push(4);

        stack_1.empty();
        System.out.println(stack_1.peek());
        stack_1.pop();
        System.out.println(stack_1.peek());
        System.out.println(stack_1.getSize());

    }

    StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    StackOfIntegers(int capacity){
      elements = new int[capacity];
    }

    public boolean empty(){
        return elements.length == 0;
    }

    public int peek(){
         return elements[size -1];
    }

    public void push(int value){
        if(size >= elements.length){
            int []temp = new int [elements.length  * 2];
            System.arraycopy(elements, 0,temp, 0,elements.length);
            elements  = temp;
        }
        elements[size++] = value;

    }

    public int pop(){
        return elements[--size];

    }

    public int getSize(){
        return size;

    }


}

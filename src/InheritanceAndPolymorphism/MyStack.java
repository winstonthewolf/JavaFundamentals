package InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() -1);
        return o;
    }

    public void push(Object o)
    {
        list.add(o);
    }

    public String toString(){
        return "stack: " + list.toString();
    }

    @Override
    public Object clone() {

        try {
            MyStack myStackClone = (MyStack) super.clone();
            myStackClone.list = (ArrayList<Object>) list.clone();
            return myStackClone;
        } catch (CloneNotSupportedException e) {
          return  null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyStack)) return false;
        MyStack myStack = (MyStack) o;
        return Objects.equals(list, myStack.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("One");
        stack1.push("Two");
        stack1.push("Three");

        MyStack stack1Clone = (MyStack) stack1.clone();
        stack1Clone.list = (ArrayList<Object>) stack1.list.clone();
        System.out.println();

        System.out.println("stack1: "+ stack1.hashCode());
        System.out.println("Stack1Clone: " + stack1Clone.hashCode());
    }
}

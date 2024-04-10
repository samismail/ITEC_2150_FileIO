package Genercis.Stack;

import java.util.ArrayList;

public class GenericStack<E> {
    ArrayList<E> list = new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    //peek, push, pop
    public E peek(){
        return list.get(this.getSize() - 1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E x = list.get(getSize() - 1);
        list.remove(x);
        return x;
    }

    public boolean isEmpty(){
        return  list.isEmpty();
    }

    @Override
    public String toString() {
        return "GenericStack: " + "\n" +
                "List: " + list;
    }
}

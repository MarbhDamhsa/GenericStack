package genericstackapp;

import java.util.LinkedList;

public class GenericStack {
    
    public LinkedList stack  = new LinkedList();

    public void push(Object element){
        System.out.println("Push: " + element);
        
        stack.addFirst(element);
    }
    public void pop(){
        System.out.println("Pop: " + stack.pop());
    }
    public void peek(){
        System.out.println("Peek: " + stack.peekLast());
        stack.peekLast();
    }
    public void size(){
        System.out.println("The stack contains: " + stack.size() + " items\n");
    }
}

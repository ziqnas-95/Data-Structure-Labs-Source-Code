/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_IMPORTANT;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Stacks<E> {
    
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public int getSize() {
        return list.size();
    }
    
    public E peek(){
        return list.getLast();
    }
    
    public void push(E e){
        list.add(e);
    }
    
    public E pop(){
        E element = list.getLast();
        list.remove(getSize()-1);
        return element;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return "Stack: " + list.toString();
    }
}

class TestStacks{

    public static void main(String[] args) {
        
        Stacks<String> mine = new Stacks<>();
        
        mine.push("TOM");
        mine.push("SUSAN");
        mine.push("KIM");
        
        System.out.println(mine.peek());
        System.out.println(mine.pop());
        System.out.println(mine);
    }

}

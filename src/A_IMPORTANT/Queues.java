/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_IMPORTANT;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Queues<E> {
    
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public void enQ(E e){
        list.addLast(e);
    }
    
    public E deQ(){
        return list.removeFirst();
    }
    
    public int getSize(){   
        return list.size();
    }
    
    public String toString(){
        return "Queue: " + list.toString();
    }
       
}

class TestStacks{

    public static void main(String[] args) {
        
        Queues<String> mine = new Queues<String>();
        
        mine.enQ("TOM");
        mine.enQ("SUSAN");
        mine.enQ("KIM");
        System.out.println(mine);
        
        System.out.println(mine.deQ());
        System.out.println(mine);
        
        System.out.println(mine.deQ());
        System.out.println(mine);
    }

}

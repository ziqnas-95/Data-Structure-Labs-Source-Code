/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GA2;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MessageHistory<E> {
    
    Node<E> head, tail;
    int size;
    
    public MessageHistory(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(String msg){
        
        Node<E> newNode = new Node<E>((E) msg);
        newNode.next = head;
        head = newNode;
        size++;
        
        if (tail == null){
            tail = head;
        }
        
    }
    
    public void addLast(String msg){
        
        Node<E> newNode = new Node<E>((E) msg);
        
        if (tail == null){
            head = tail = newNode;
        } 
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public E removeFirst(){
        
        if (size == 0){
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            
            if (head == null){
                tail = null;
            }
            return temp.element;
        }
    }
    
    public void print(){
        
        Node<E> tmp = head;
        
        while (tmp.next != null){
            System.out.print(tmp.element + " -> ");
            tmp = tmp.next;
        }
        System.out.println(tmp.element + " -> null"); 
    }
    
    
    public void addAt(int index, String msg){
    
        if (index <= 0){
            addFirst(msg);
        } else if (index >= size){
            addLast(msg);
        } else {
            Node<E> temp = head;
            
            for (int i = 1; i < index; i++){
                temp = temp.next;
            }
            
            Node<E> current = temp.next;
            temp.next = new Node<E>( (E) msg);
            temp.next.next = current;
            size++;
        }
    
    }
    
    public void removeAt(int index){
    
        if (index <= 0){
            removeFirst();
        } else if (index >= size){
            index = size-1;
        } else {
            Node<E> temp = head;
            
            for (int i = 1; i < index; i++){
                temp = temp.next;
            }
            
            Node<E> current = temp.next;
            temp.next = current.next;
            size--;
        }
    }
    
    public static void main(String[] args) {
        
        MessageHistory<String> list = new MessageHistory<>();
        
        list.addFirst("Hello"); 
        list.addLast("How are you?"); 
        list.addLast("Hiii");
        list.removeAt(0);
        list.addAt(1, "Haziq Nasaruddin");
        list.print();
        
    }
    
}

class Node<E> {

    E element;
    Node<E> next;
    
    public Node(){
    }
    
    public Node(E e){
        this.element = e;
        this.next = null;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Exercise;

/**
 *
 * @author Haziq Nasaruddin
 */

class Node<T> {

    T element;
    Node<T> next;

    public Node(T data){
        this.element = data;
        this.next = null;
    }
}

public class SinglyLinkedList<T> {
    
    private Node head, tail;
    int size;
    
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(T e){
        
        Node<T> newNode = new Node<T>(e);
        newNode.next = head;
        head = newNode;
        size++;
        
        if (tail == null){
            tail = head;
        }
    }
    
    public void addLast(T e){
        
        Node<T> newNode = new Node<T>(e);
        
        if (tail == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, T e){
    
        if (index == 0){
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<T> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node<T> temp = current.next;
            current.next = new Node<T>(e);
            current.next.next = temp;
            size++;
        }
    }
    
    
    public T removeFirst(){
    
        if (size == 0)
            return null;
        else {
            Node<T> temp = head;
            head = head.next;
            size--;
            
            if (head == null){
                tail = null;
            }
            return temp.element;
        }
    }
    
    public T removeLast(){
        
        if (size == 0){
            return null;
        }
        else if (size == 1){
            Node<T> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<T> current = head;
            
            for (int i = 0; i < size - 2; i++){
                current = current.next;
            }
            
            Node<T> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public T remove(int index){
        if (index < 0 || index >= size){
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1){
            return removeLast();
        }
        else {
            Node<T> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            } 
            
            Node<T> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    
    
    }
    
    public void traverse(){
        
        Node<T> current = head;
        
        while(current.next != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.print(current.element);
    
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean contains(T e){
        
        Node<T> current = head;
        boolean isThere = false;
        for (int i = 0; i < size; i++){
            if (e.equals(current.element)){
                isThere = true;
                break;
            }
            current = current.next;
        }
        return isThere;
    }
    
    public T get(int index){
    
    }
    
    public int indexOf(T e){
    // search for the elements
    }
    
    public void set(int index, T e){
    // go to index then set it
    }
    
    public static void main(String[] args) {
        
        SinglyLinkedList<String> hehe = new SinglyLinkedList<>();
        
        hehe.addFirst("Haziq");
        hehe.addLast("bestie");
        hehe.add(1, "adam");
        hehe.traverse();
        System.out.println(hehe.getSize());
        
        System.out.println(hehe.contains("bestie"));
        System.out.println(hehe.contains("ale"));
        
        hehe.removeFirst();
        hehe.removeLast();
        hehe.traverse();
        System.out.println(hehe.getSize());
        
        
    }
    
}


/**
 * 
 * MAIN PROBLEM HERE IS TO CALCULATE THE ITERATION PROCESS
 */
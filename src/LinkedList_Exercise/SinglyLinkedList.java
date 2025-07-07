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
            
            for (int i = 1; i < size - 1; i++){
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
            Node<T> temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            } 
            
            Node<T> current = temp.next;
            temp.next = current.next;
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
        Node<T> temp = head;
        if (index == 0){
            return temp.element;
        }
        
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        } 

        Node<T> current = temp.next;
        return current.element;
    }
    
    public int indexOf(T e){
        Node<T> temp = head;
        
        if (temp.element.equals(e)){
            return 0;
        } else {
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
                if (temp.element.equals(e)){
                    return i;
                }
            } 
        }
        return -1;
    }
    
    public void set(int index, T e){
        Node<T> temp = head;
        if (index == 0){
            temp.element = e;
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            } 
            Node<T> current = temp.next;
            current.element = e;
        }
        
    }
    
    public static void main(String[] args) {
        
        SinglyLinkedList<String> mylist = new SinglyLinkedList<>();
        
        mylist.addFirst("Haziq");
        mylist.addFirst("Adam");
        mylist.addFirst("Ajwad");
        mylist.addFirst("Iche");
        mylist.addLast("Othman");
        mylist.traverse();
        
        System.out.println("\n");
        mylist.add(1, "Muaz");
        mylist.traverse();
        
        System.out.println("\n\n" + mylist.get(0));
        
        System.out.println("");
        mylist.set(2, "Fahim");
        mylist.traverse();
        
        System.out.println("\n");
        System.out.println(mylist.indexOf("Iche"));
        
        System.out.println("");
        System.out.println("SIZE:" + mylist.getSize());
        
        System.out.println("\n" + mylist.contains("Adam"));
        System.out.println(mylist.contains("ale"));
        
        mylist.removeFirst();
        mylist.removeLast();
        mylist.traverse();
        System.out.println("\nSIZE:" + mylist.getSize());
        
        
    }
    
}


/**
 * 
 * MAIN PROBLEM HERE IS TO CALCULATE THE ITERATION PROCESS
 */
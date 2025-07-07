/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueue_Exercise;

import LinkedList_Exercise.SinglyLinkedList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Queue1<E> {
    
    private SinglyLinkedList<E> myList = new SinglyLinkedList<E>();
    
    public void enqueue(E e){
        myList.addLast(e);
    }
    
    public E dequeue(){
        return myList.removeFirst();
    }
    
    public int getSize() {
        return myList.getSize();
    }
    
}

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package GA2;
//
///**
// *
// * @author Haziq Nasaruddin
// */
//class Node<E> {
//
//    E element;
//    Node<E> next, prev;
//    
//    public Node(){
//    }
//    
//    public Node(E e, Node<E> next, Node<E> prev){
//        this.element = e;
//        this.next = next;
//        this.prev = prev;
//    }
//    
//    public Node(E e){
//        this.element = e;
//        this.next = null;
//    }
//
//}
//
//public class Cursor<E> {
//    
//    Node<E> head, tail;
//    int size, index;
//    
//    public Cursor(){
//        this.head = null;
//        this.tail = null;
//        this.size = 0;
//        this.index = 0;
//    }
//    
//    public void insertAtCursor(String msg){
//    
////        if (index <= 0){
////            index = 0;
////            Node<E> newNode = new Node<E>((E) msg);
////            newNode.next = head;
////            head = newNode;
////            size++;
////            index++;
////            if (tail == null){
////                tail = head;
////            }
////            
////        } else if (index >= size){
////            index = size - 1;
////        } else {
////            Node<E> temp = head;
////            
////            for (int i = 1; i < index; i++){
////                temp = temp.next;
////            }
////            
////            Node<E> current = temp.next;
////            temp.next = new Node<E>( (E) msg);
////            temp.next.next = current;
////            size++;
////            index++;
////        }
//
//        Node<E> current = head;
//        for (int i = 0; i < index; i++){
//            current = current.next;
//        }
//        
//        Node<E> tmp = current.next;
//        current = new Node<E>((E) msg);
//        current.next = tmp;
//        size++;
//        index++;
//    }
//    
//    public void moveLeft(){
//        index--;
//    }
//    
//    public void moveRight(){
//        index++;
//    }
//    
//    public void print(){
//    
//        Node<E> tmp = head;
//        
//        while (tmp.next != null){
//            System.out.print(tmp.element + " <-> ");
//            tmp = tmp.next;
//        }
//        System.out.println(tmp.element + " <-> null"); 
//        
//    }
//    
//    public static void main(String[] args) {
//        
//        Cursor<String> list = new Cursor<>();
//        
//        list.insertAtCursor("H");
//        list.insertAtCursor("AA");
//        list.insertAtCursor("Z");
//        list.insertAtCursor("II");
//        list.print();
//    }
//    
//}

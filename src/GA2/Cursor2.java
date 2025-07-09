/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GA2;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Cursor2<E> {
    Node<E> head;
    int size, index;

    public Cursor2() {
        this.head = null;
        this.size = 0;
        this.index = 0;
    }

    public void insertAtCursor(String msg) {
        Node<E> newNode = new Node<>((E) msg);

        // Insert at head (index == 0)
        if (index <= 0) {
            newNode.next = head;
            head = newNode;
        } 
        // Insert somewhere after head
        else {
            Node<E> temp = head;
            for (int i = 1; i < index && temp != null; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        size++;
        index++;
    }

    public void moveLeft() {
        if (index > 0) index--;
    }

    public void moveRight() {
        if (index < size) index++;
    }

    public void print() {
        Node<E> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.element + " <-> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
    
    public void print1() {
        Node<E> tmp = head;
        int i = 0;

        while (tmp != null) {
            if (i == index) {
                System.out.print("[" + tmp.element + "]");
            } else {
                System.out.print(tmp.element);
            }

            if (tmp.next != null) {
                System.out.print(" -> ");
            }

            tmp = tmp.next;
            i++;
        }

        // If cursor is at the end (after the last element), show empty brackets
        if (index == size) {
            System.out.print(" -> []");
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        Cursor2<String> list = new Cursor2<>();

        list.insertAtCursor("H");   // [H]
        list.insertAtCursor("AA");  // [H, AA]
        list.moveLeft();            // cursor before AA
        list.insertAtCursor("Z");   // [H, Z, AA]
        list.insertAtCursor("II");  // [H, Z, II, AA]

        list.moveLeft();
        list.print1();               // Output: H -> Z -> II -> AA -> null
    }
}

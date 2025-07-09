/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_IMPORTANT;

/**
 *
 * @author Haziq Nasaruddin
 */

// Generic version of Circular Queue
public class CircularQueue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public int getSize() {
        return size;
    }
    
    public void enqueue(T data) {
        if (isFull()) {
            throw new RuntimeException("Queue is full! Cannot enqueue " + data);
        }
        
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }
    
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty! Cannot dequeue");
        }
        
        T data = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        
        return data;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty! Cannot peek");
        }
        
        return queue[front];
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        System.out.print("Queue: [");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== Circular Queue Implementation Test ===\n");
        
        // Create a circular queue with capacity 5
        CircularQueue<Integer> cq = new CircularQueue<>(5);
        
        
        
    }

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueue_Exercise;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestQueue1 {
    
    public static void main(String[] args) {
        
        Queue1<String> ququ = new Queue1<String>();
        
        ququ.enqueue("Haziq");
        System.out.println("\n" + ququ.getSize());
        
        ququ.enqueue("Amir");
        System.out.println("\n" + ququ.getSize());
        
        ququ.dequeue();
        System.out.println("\n" + ququ.getSize());
        
    }
    
}

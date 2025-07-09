/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StacksQueue_Exercise;

/**
 *
 * @author Haziq Nasaruddin
 */
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQ {
    
    public static void main(String[] args) {
        
        PriorityQueue<StudentList> mylist = new PriorityQueue<>(Comparator.comparing(StudentList::getP).reversed());
        
        mylist.add(new StudentList(12));
        mylist.add(new StudentList(23));
        mylist.add(new StudentList(5));
        
        while (!mylist.isEmpty()){
            System.out.println(mylist.poll());
        }
        
    }
    
}

class StudentList implements Comparable<StudentList>{
    
    private int priority;
    
    public StudentList(int priority){
        this.priority = priority;
    }
    
    public int getP(){
        return this.priority;
    }

    @Override
    public int compareTo(StudentList other) {
        return Integer.compare(this.priority, other.priority);
    }
    
    public String toString(){
        return "Priority: " + priority;
    }

}

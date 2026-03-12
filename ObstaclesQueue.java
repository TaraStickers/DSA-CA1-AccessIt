/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

import java.util.*;

/**
 *
 * @author taraj
 */
public class ObstaclesQueue implements QueueInterface {

    private ArrayList<Obstacles> obstacleQueue;
    
    //CREATE INSTANCE OF QUEUE CLASS
    public ObstaclesQueue() {
        obstacleQueue = new ArrayList<Obstacles>();
    }
    
    //GET SIZE OF QUEUE
    public int size() {
        return obstacleQueue.size();
    }
    
    //CHECK IF QUEUE EMPTY
    public boolean isEmpty() {
        return obstacleQueue.isEmpty();
    }
    
    public Obstacles frontElement() {
        //check if queue has elements
        if (obstacleQueue.size() > 0) {
            //if there are elements, get the first element at index 0
            return obstacleQueue.get(0);
        } else {
            //if no elements, return null
            return null;
        }
    }
    
    public void enqueue(Obstacles obstacle) {
        //add new object to end of queue
        obstacleQueue.add(obstacle);
    }

    public Obstacles dequeue() {
        //check if queue is empty
        if (obstacleQueue.size() > 0) {
            //if not, remove object at index 0 (first element)are
            return obstacleQueue.remove(0);
        } else {
            return null;
        }
    }
    //method to print the queue
    public String printQ() {
        //string to store output
        String queueOutput = "";
        //loop through the obstacleQueue
        for(Obstacles obstacle : obstacleQueue){
            //add each obstacle element to the queue output using tostring method
            queueOutput += obstacle.toString();
        }
        //return queueu output 
        return queueOutput;
    }
}

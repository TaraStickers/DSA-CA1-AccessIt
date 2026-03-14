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
    private ObstaclesQueue obstaclesQueue;
    
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
    
    //delete
    public Obstacles dequeue(String routeID) {
        for (int i = 0; i < obstacleQueue.size(); i++) {
            //set current obstacle queue object in i as currentObstacle
            Obstacles currentObstacle = obstacleQueue.get(i);
            //if current obstacle in loops RouteId matches user entered routeID
            //changed SAVED routeID to lowercase for comparison
            //ENTERED routeID changed to lowercase during input
            if (currentObstacle.getRouteID().equals(routeID.toLowerCase())) {
                //remove the currentObstacle (delete it)
                return obstacleQueue.remove(i);
            }
            
        }
        return null;
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
    
    @Override
    public boolean updateObstacles(String routeID, Obstacles obstacle){
        //iterate through obstacle queue
        for (int i = 0; i < obstacleQueue.size(); i++) {
            //set current obstacle to obstacle at i 
            Obstacles currentObstacle = obstacleQueue.get(i);
            //if current obstacle route id is the same as entered routeid
            if(currentObstacle.getRouteID().equalsIgnoreCase(routeID)) {
                //set obstacle in current i location to the updated obstacle
                obstacleQueue.set(i, obstacle);
                return true;
            }
        }
        return false;
    }
    
}

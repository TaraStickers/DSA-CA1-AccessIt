/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author taraj
 */
public class RouteLinkedList {
    private RouteNode head;
    private int size;
    
    //constructor
    public RouteLinkedList(){
        //no notes in list
        head = null; 
        //size starts at 0
        size = 0;
    }
    
    //return the num of elements in list currenltly
    public int size() { 
        return size;
    }
    
    //check if empty
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void add(Route route){
        //new node for route object
        RouteNode newNode = new RouteNode(route, null);
        
        if(head == null){
            head = newNode;
        } else{
            RouteNode current = head;
            //go to last node where next is null
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        //list size increase
        size++;
    }
    
    //print list method
    public String printList(){
        StringBuilder sb = new StringBuilder();
        RouteNode node = head;
        //while node isnt empty
        while (node != null) {
            //build it as string
            sb.append(node.toString()).append("\n");
            node = node.getNext();
        }
        return sb.toString();
    }
    
}


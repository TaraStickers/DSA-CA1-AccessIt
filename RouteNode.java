/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author taraj
 */
public class RouteNode {
    
    private Route element;
    private RouteNode next;
    //constructor
    public RouteNode(Route e, RouteNode n){
        element = e;
        next = n;
    }
    
    //return next node in list
    public RouteNode getNext() {
        return next;
    }
    
    //updates next node 
    public void setNext(RouteNode n){
        next = n;
    }
    
    //return route object
    public Route getElement() {
        return element;
    }
    
    //update the route object
    public void setElement(Route e){
        element = e;
    }
    
    //toString
    public String toString() {
        return element.toString();
    }
}

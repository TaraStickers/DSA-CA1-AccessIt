/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author Tara
 */
public class WalkingRoute extends Route {
    private boolean hasStairs;
    
    public WalkingRoute (String routeID, String start, String end, double distance, boolean hasStairs){
        super(routeID, start, end, distance); //parent
        this.hasStairs = hasStairs;   
    }
    @Override
    public String toString() {
        //append extra details onto super toStirng method
        return super.toString() + "\nType of route: Walking route" + "\nHas stairs: " + hasStairs + "\n";
    }
}

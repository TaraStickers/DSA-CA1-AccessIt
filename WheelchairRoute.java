/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author Tara
 */
public class WheelchairRoute extends Route{
    private boolean hasLifts;
    private boolean hasRamps;
    
    public WheelchairRoute(String routeID, String start, String end, double distance, boolean hasLifts, boolean hasRamps) {
        super(routeID, start, end, distance);
        this.hasRamps = hasRamps;
        this.hasLifts = hasLifts;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nType of route: Wheelchair route" + "\nHas ramps: " + hasRamps + "\nHas lifts: " + hasLifts + "\n";
    }
}

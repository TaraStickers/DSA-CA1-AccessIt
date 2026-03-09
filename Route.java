/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author taraj
 */
public class Route {

    private String routeID;
    private String start;
    private String end;
    private double distance;

    public Route(String routeID, String start, String end, double distance) {

        this.routeID = routeID;
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Route: " + routeID + "\n" + "Start point: " + start + "\n" + "End point: " + end + "\n" + "Estimated distance: " + distance + "km";
    }
}

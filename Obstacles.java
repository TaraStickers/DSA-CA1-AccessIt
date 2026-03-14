/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

/**
 *
 * @author Tara
 */
public class Obstacles {

    private String location;
    private String description;
    private String routeID;
    private String barrierType;
    private String subType;

    public Obstacles(String location, String description, String routeID, String barrierType, String subType) {
        this.location = location;
        this.description = description;
        this.routeID = routeID;
        this.barrierType = barrierType;
        this.subType = subType;
    }

    //getter to allow other classes to get route id
    public String getRouteID() {
        return routeID;
    }
    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    //other getters for updating
    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String barrierType() {
        return barrierType;
    }

    public String subType() {
        return subType;
    }

    //setters for updating
    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBarrierType(String barrierType) {
        this.barrierType = barrierType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    @Override
    public String toString() {
        return "\n---------------------" + "\nObstacle:" + "\nLocation: " + location + "," + "\nDescription: " + description + "," + "\nRoute ID: " + routeID + "," + "\nBarrier type: " + barrierType + "," + "\nOther barrier information: " + subType;

    }
}

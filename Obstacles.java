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
        this.location=location;
        this.description=description;
        this.routeID=routeID;
        this.barrierType=barrierType;
        this.subType=subType;
    }
    
    @Override
    public String toString(){
        return "Obstacle:" + "\nLocation: " + location + "," + "\nDescription: " + description + "," + "\nRoute ID: " + routeID + "," + "\nBarrier type: " + barrierType + "," + "\nOther barrier information: " + subType;
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.ca1;

import java.util.Stack;

/**
 *
 * @author taraj
 */
public class RecentRoutes {
    public static Stack<Route> s = new Stack<>();
    
    //delete most recent stack item
    public static void deleteRecent() {
        //if stack is not empty
        if(!s.isEmpty()) {
            //pop (delete)
            s.pop();
        }
    }
}

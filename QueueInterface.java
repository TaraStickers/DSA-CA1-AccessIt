package com.mycompany.dsa.ca1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taraj
 */
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Obstacles frontElement();
    public void enqueue(Obstacles obstacle);
    public Obstacles dequeue();

}

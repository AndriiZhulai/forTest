package com.andrii.oop.lesson2;

public class Computer {
     private int ssd = 500;
     private int ram = 1024;

    Computer(int newSsd){
        ssd = newSsd;
    }
    protected Computer (int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

     public Computer(){
         System.out.println("I was created!");
     }

     void load(){
         System.out.println("I'm ready");
     }

     void load(boolean open){
         System.out.println("I'm ready");
         if (open) {
             System.out.println("I have already open the program!");
         }
     }

     void printState(){
         System.out.println("SSD" + ssd);
         System.out.println("RAM" + ram);

     }
}

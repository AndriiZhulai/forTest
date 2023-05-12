package com.andrii.oop.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();
        System.out.println("--------------------------------------");

        Computer computer2 = new Computer(1050);
        computer2.printState();
        System.out.println("======================================");

        Computer computer3 = new Computer(10000, 12000);
        computer3.printState();
        computer3.load();
        computer3.load();


        /*computer.load();
        System.out.println("Ran" + computer.ram);
        System.out.println("SSD" + computer.ssd);*/

    }
}

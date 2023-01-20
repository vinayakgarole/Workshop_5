package com.bridgelabz;

class Area {

    int length;
    int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class EncapTest {

    public static void main(String[] args) {

        Area ar = new Area(5, 6);
        ar.getArea();
    }
}
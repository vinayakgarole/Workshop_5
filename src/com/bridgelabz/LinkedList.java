//package com.bridgelabz;
//
//class Node {
//    int data;
//    int frequency;
//    Node next;
//
//    public Node(int data, int frequency) {
//        this.data = data;
//        this.frequency = frequency;
//        this.next = null;
//    }
//}
//
//public class LinkedList {
//
//    Node head;
//
//    public LinkedList() {
//        head = null;
//    }
//
//    public void add(int data) {
//        Node current = head;
//        Node prev = null;
//
//        while (current != null) {
//
//            if (current.data == data) {
//                current.frequency++;
//                return;
//            }
//            prev = current;
//            current = current.next;
//        }
//        Node newNode = new Node(data, 1);
//
//        if (prev == null) {
//            head = newNode;
//        } else {
//            prev.next = newNode;
//        }
//
//        public void display() {
//            current = head;
//            while (current != null) {
//                System.out.println("Data: " + current.data + " Frequency: " + current.frequency);
//                current = current.next;
//            }
//        }
//
//        class Main {
//
//            public static void main(String[] args) {
//
//                int arr[] = {1, 2, 3, 2, 3, 1, 4, 2};
//
//                LinkedList list = new LinkedList();
//
//                for (int i = 0; i < arr.length; i++)
//                    list.add(arr[i]);
//                System.out.println("Original Array: ");
//
//                for (int i = 0; i < arr.length; i++)
//                    System.out.print(arr[i] + " ");
//                System.out.println("\nFrequency of each element: ");
//                list.display();
//            }
//        }
//    }
//
//    private void display() {
//    }
//}
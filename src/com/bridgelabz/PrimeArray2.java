package com.bridgelabz;

public class PrimeArray2 {

    public void checkData() {
        int[] arr = new int[100];
        int temp = 0;

        for (int no = 1; no <= arr.length; no++) {

            for (int i = 2; i < no - 1; i++) {

                if (no % i == 0) {
                    temp = temp + 1;
                }
            }

            if (temp == 0) {

                for (int i = 0; i < arr.length; i++) {

                    if (no > 10) {
                        arr[i] = no;
                        System.out.print(arr[i] + ", ");
                    }
                    break;
                }
            } else {
                temp = 0;
            }
        }
    }

    public static void main(String[] args) {

//        PrimeArray pri = new PrimeArray();
//        pri.checkData();
    }
}
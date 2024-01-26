package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //long startTime = System.nanoTime();
        ArrayList<Object> arrayList = new ArrayList<>();
        /*
         * If it will be necessary check more cases, it will be better save the result of the operation
         * in a temp variable (like a byte) and then only check it, to avoid recalculate another time the
         * results of "i%3==0" or "i%5==0". But in these case its more efficient as this way and avoid to
         * create a temp variable.
         */
        for (int i = 1; i < 101; i++) {
            if(i % 3 ==0 && i % 5 ==0){
                arrayList.add("VINCLE");
            }
            else if(i % 3 ==0){
                arrayList.add("VIN");
            }
            else if(i % 5 ==0){
                arrayList.add("CLE");
            }else{
                arrayList.add(i);
            }
        }
        //long endTime = System.nanoTime() - startTime;
        System.out.println(arrayList);
        //System.out.println(endTime);
    }

}



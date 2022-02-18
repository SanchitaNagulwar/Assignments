package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4BQ3 {
    public static ArrayList<Integer> traverseReverse(ArrayList<Integer> aList){
        Collections.reverse(aList);
        return aList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);

        System.out.println("Printing Original Array: ");
        for (int i:arrayList){
            System.out.print(i+" ");
        }
        System.out.println("\nPrinting Reverse Array: ");
        arrayList = traverseReverse(arrayList);
        for (int i:arrayList){
            System.out.print(i+" ");
        }
    }
}

package main.java.RaCuNi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("This is for bubble sort test!");
        System.out.println("It'll do ascending sort.");
        System.out.println("Now, put down some numbers, then this program will make an array.");
        System.out.println("First, how many numbers will you enter?");

        List<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int k=0; k < num; k++) {
            list.add(k, sc.nextInt());
        }

        int leng = list.size();

        sc.close();

        System.out.println("Your array is : "+list);
        System.out.println("Let's sort!");

        BubbleSort sort = new BubbleSort();
        List<Integer> result = sort.bubbleSort(list, leng);

        System.out.println("Result: "+result);
    }

    public List<Integer> bubbleSort(List<Integer> arrayList, int length) {
        for(int j=0; j < length; j++) {
            for(int i=0; i < length-1; i++) {
                if(arrayList.get(i) > arrayList.get(i+1)) {
                    int store = arrayList.get(i+1);
                    arrayList.set(i+1, arrayList.get(i));
                    arrayList.set(i, store);
                }
            }
        }
        return arrayList;
    }
}

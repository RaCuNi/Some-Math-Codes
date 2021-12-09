package main.java.RaCuNi;

import java.util.Scanner;

public class BinarySearch {
    // Binary Search
    // It needs a sorted list
    // if we want to find 'n', this algorithm will find it.
    // by taking the middle number of the list and comparing it with 'n', it will search 'n'.

    public static void main(String[] args) {
        System.out.println("This is for binary search test!");
        System.out.println("Put down some numbers, then this program will make an array.");
        System.out.println("First, how many numbers will you enter? (the numbers must be sorted by ascending sort.)");

        List<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int k=0; k < num; k++) {
            System.out.println("enter the number one by one.");
            list.add(k, sc.nextInt());
        }

        int leng = list.size();

        

        System.out.println("Your array is : "+list);

        System.out.println("Let's search!");

        int finding = sc.nextInt();

        sc.close();

        //BubbleSort sort = new BubbleSort();
        //List<Integer> result = sort.bubbleSort(list, leng);

        //System.out.println("Result: "+result);
    }

    public List<Integer> binarySearch(int searching, List<Integer> arrayList, int length) {
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

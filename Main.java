package com.company;

import java.util.*;

public class Main {

    public static void main (String args[]){

        Scanner scan =  new Scanner(System.in);

        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(9);
        System.out.println(arr);
        while (true) {
            System.out.println("enter number");
            int x = scan.nextInt();
            sort(arr, x);
            System.out.println(arr);
        }




    }
    public static LinkedList<Integer> sort (LinkedList<Integer> arr, int x){
        int check = arr.size();

         for (int i=0;i<arr.size();i++){
             if ((x>arr.get(i))){
               //continue
             }else{
                 arr.add(i,x);
                 break;
             }



         }
        if(check==arr.size()){
            arr.add(x);
        }
         return arr;

    }


}


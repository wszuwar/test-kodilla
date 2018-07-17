package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Main {

   static boolean firstNummber(int number){
       for (int i = 2; i <number ; i++) {
           if (number%i == 0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
       int number = 1;
       int counter = 0;

       while (counter != 1001){
           if (firstNummber(number)){
               counter++;
           }
           number++;
       }
        System.out.println(number - 1);
    }


}

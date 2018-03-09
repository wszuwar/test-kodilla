package com.kodilla.exception.test;



public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
      try {
          if (x >= 2 || x < 1 || y == 1.5) {

          }
          return "Done!";

} catch (Exception e) {
          throw new ExceptionHandling();
      }
    }

    public static void main(String[] args) {
       ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
          exceptionHandling.probablyIWillThrowException(2,5);
          } catch (Exception e) {
            System.out.println("ERROR!! x>=2 or x<1 or y==1.5 ");
        }
    }

}

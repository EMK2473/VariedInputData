package VariedInputData;

import java.util.Scanner; 

public class VariedInputData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int scannedInt = scnr.nextInt();
      int maxInt = -1;
      int count = 0;
      double sum = 0.0;

      while(scannedInt >= 0) {
         if(scannedInt > maxInt){
            maxInt = scannedInt;
            System.out.println("Int Scanned: " + scannedInt);
            System.out.println("New Max Found: " + maxInt);
         }
         count++;
         sum += scannedInt;
         scannedInt = scnr.nextInt();
         System.out.println("Max: " + maxInt);
         System.out.println("Count: " + count);
         System.out.println("Sum: " + sum);
         System.out.println("Next Int: " + scannedInt);
      }
      double average = (double) sum / count;
      System.out.println(maxInt + " " + String.format("%.2f", average));
   }
}

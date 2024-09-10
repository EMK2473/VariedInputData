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
      }

   }
}

package com.JavaBasics.Operators;
import java.util.Scanner;
public class SPattern
 {
    public static void main(String[] args) {

    	  Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();

          for (int i = 1; i <= n; i++) {
              for (int j = 1; j <= n; j++) {

                  if (i == 1 ||                     // Top line
                      i == (n + 1) / 2 ||           // Middle line
                      i == n ||                     // Bottom line
                      (j == 1 && i < (n + 1) / 2) ||  // Left upper
                      (j == n && i > (n + 1) / 2)) {  // Right lower

                      System.out.print("* ");
                  } else {
                      System.out.print("  ");
                  }
              }
              System.out.println();
          }

          scanner.close();
      }
    }

 

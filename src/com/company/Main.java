package com.company;
import java.util.Scanner;
 class queue {
     int f = -1, r = -1;
     int n = 5;
     int q[] = new int[n];

     void enqueue(Scanner sc) {
         if (f == (r + 1) % n) {
             System.out.print("overflow condition");
         } else {
             System.out.print("enter the data:");
             int i = sc.nextInt();
             if (f == -1 && r == -1) {
                 f = 0;
                 r = 0;
                 q[r] = i;
             } else {
                 r = (r + 1) % n;
                 q[r] = i;
             }
         }
     }
         public void dequeue ()
         {
             if (f == -1 && r == -1) {
                 System.out.print("underflow condition");
             } else if (f == r) {
                 System.out.print("underflow");
                 f = -1;
                 r = -1;
             } else {
                 f = (f + 1) % n;
             }
         }
         public void display ()
         {
             int i;
             System.out.print("item are:");
             for (i = f; i != r; i = (i + 1) % n) {
                 System.out.print(q[i]);
             }
             System.out.print(q[i]);
         }
     }

     public class Main {

         public static void main(String[] args) {
             int d;
             Scanner sc = new Scanner(System.in);
             queue s = new queue();
             int l;
             do {
                 System.out.println("press 1 to enqueue:");
                 System.out.println("press 2 to dequeue:");
                 System.out.println("press 3 to display:");
                 System.out.println("enter your choice:");
                 d = sc.nextInt();
                 switch (d) {
                     case 1: {
                         s.enqueue(sc);
                         break;
                     }
                     case 2: {
                         s.dequeue();
                         break;
                     }
                     case 3: {
                         s.display();
                         break;
                     }
                 }
                 System.out.print("enter 0 to go back to main menu:");
                 System.out.print("enter any key to eit:");
                 l = sc.nextInt();
             } while (l == 0);
             System.out.print("exit successfully");
         }
     }



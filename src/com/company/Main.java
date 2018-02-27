/*
* It is My first java experience :)
*/

package com.company;

import java.awt.*;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        int a;      //I know... but I want check what will happen with 'a' outside loop 'for' :P
        for (a=0; a<10; a++) {
            System.out.println(a);
          }
        System.out.println("Yeah Good :) ");
        System.out.println("Java at now is really close to C++ :P ");
        // ok, I think Java will be good language to learn, when I will boring c++.... maybe ;)
        System.out.println(a);
        System.out.println("I'm interested in about 'a' in previous line...");

        int x = 5, y = 43;

                if (x == y)
                    System.out.println("x = y");
                else if (x < y)
                    System.out.println("x < y");
                else
                    System.out.println("x > y");


                int sw = 101;

                switch (sw)
                {
                    case 10:
                        System.out.println("sw = 10");
                        break;

                    case 20:
                        System.out.println("sw = 20");
                        break;

                    default:
                        System.out.println("sw is equal " + sw +" :)");
                        break;

                }

              // int tab[10]; - not working... c++ dev cry :P

                int[] tab;
                tab = new int[10];

                //hmm... look like C++ pointer :D
        int[] tab1 = new int[10];

        int[] tab2 = {1,2,3,6,4,3};

        System.out.println("tab2 length is " + tab2.length);


        int [][] tab2d = new int [4][4];

        int [][] tab2d1 =
                {
                        {1,2,3,4},
                        {32,23,21,43},
                        {0,0,0,0},
                        {45,32,89,55}
                };










    }
}

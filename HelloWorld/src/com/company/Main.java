package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int firstInt = 4;
        double doubles = 100.3;
        float floatsDude = 1004.0f;
        System.out.print("Hello This is the world " + firstInt + "\r\n");
        //String line = scan.nextLine();
        while(firstInt != 10)
        {
            if(doubles == 101.2)
            {
                System.out.print("doubles = " + doubles+ "\r\n");
            }
            else
            {
                System.out.print("Doubles does not equal 101.2, it equals: " + doubles+ "\r\n");
            }
            firstInt++;
            System.out.print("firstInt: " + firstInt+ "\r\n");
        }

    }
}

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        String age = in.nextLine();

        int b = Integer.parseInt(age);
        int req = 16;
        String legal = (b >= req) ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";


        System.out.print(legal);
        
    }
}

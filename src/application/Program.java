package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.print("Enter the rectangle width: ");
        rec.Width = sc.nextDouble();

        System.out.print("Enter the rectangle height: ");
        rec.Height = sc.nextDouble();

        System.out.println(rec.toString());

        sc.close();
    }
}

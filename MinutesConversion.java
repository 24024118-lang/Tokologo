/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;

/**
 *
 * @author magom
 */
import java.util.Scanner;
public class MinutesConversion {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
long minutes = input.nextLong();

double hours= minutes/60.0;
double days=minutes/1440.0;

System.out.println("Hours: " +hours);
System.out.println("Days: " +days);

 input.close();
    }
}

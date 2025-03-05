/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class tinhtongnsonguyenduongdautien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt() ;
        while(n>0){
            int k = sc.nextInt();
            System.out.println(((long)k*(k+1))/2);
            n--;
        }
    }
}

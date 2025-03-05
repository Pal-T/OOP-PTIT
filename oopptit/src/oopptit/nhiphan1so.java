/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class nhiphan1so {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n: ");
        n = sc.nextInt();
        String nhiPhan = "";
        while(n>0){
            nhiPhan = (n%2) + nhiPhan;           
            n = n/2;
        }
        System.out.println("nhi phan cua n la: " +nhiPhan);
        double mang[];
         
        
    }
}

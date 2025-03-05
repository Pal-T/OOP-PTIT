/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a<= 0 || b <= 0 ){
            System.out.println(0);
        }else{
            System.out.println((a+b)*2 +" "+ (long)a*b);
        }
    }
}

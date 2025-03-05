/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("nhap chuoi: ");
        s = sc.nextLine();
        System.out.println("--------");
        
        //ham length()
        System.out.println(s.length());
        int doDai = s.length();
        //ham charAt(vi tri)
        for(int i=0; i< doDai; i++){
            System.out.println("Vi tri: "+i+"la "+s.charAt(i));
        }
        
    }
    
}

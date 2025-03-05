/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydate;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        int d;
        MyDate md = new MyDate(25, 2, 2029);
        System.out.println(md);
        MyDate md1 = new MyDate(15,5,2025);
        System.out.println("so sanh md va md1: "+ md.equals(md1));
        System.out.println("hascode: "+md.hashCode());
    }
}

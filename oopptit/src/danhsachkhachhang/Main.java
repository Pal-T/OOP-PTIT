/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachkhachhang;

/**
 *
 * @author DELL
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> list = new ArrayList<>();
        while(test-- != 0){
            list.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Customer x : list){
            System.out.println(x);
        }
    }
}

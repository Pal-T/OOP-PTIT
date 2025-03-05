/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadoncafe;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100, 1.5);
        System.out.println("Tong tien:"+hd.tinhTongTien());
        
        System.out.println("kiemtra khoi luong lon hon 2: " +hd.kiemTraKhoiLuongLonHon(1));
        System.out.println("kiem tra tong tien: "+hd.kiemTraTongTien(100));
        
    }
}

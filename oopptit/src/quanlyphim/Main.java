/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyphim;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        Ngay ngay1 = new Ngay(15,5,2021);
        Ngay ngay2 = new Ngay(8,8,2024);

        HangSanXuat hang1 = new HangSanXuat("hang A", "VietNam");
        HangSanXuat hang2 = new HangSanXuat("hang B", "VietNam");

        BoPhim boPhim1 = new BoPhim("phim A", 2023, hang1, 5000, ngay1);
        BoPhim boPhim2 = new BoPhim("phim B", 2024, hang2, 6000, ngay2);
        
        System.out.println("so sanh: "+boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("ten Hang san xuat: "+boPhim1.layTenHangSanXuatPhim());
    }
}

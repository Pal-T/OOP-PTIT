/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadoncafe;

/**
 *
 * @author DELL
 */
public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien;
    private double khoiLuong;
    
    public HoaDonCaPhe(String ten, double gia, double kl){
        this.tenLoaiCaPhe = ten;
        this.giaTien = gia;
        this.khoiLuong = kl;
    }
    
    public double tinhTongTien(){
        return this.giaTien * this.khoiLuong;
    }
    
    public boolean kiemTraKhoiLuongLonHon(double kl){
        return this.khoiLuong > kl;
    }
    
    public boolean kiemTraTongTien(double cost){
        return this.tinhTongTien() > cost;
    }
}

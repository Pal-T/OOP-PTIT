/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhkethua;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        ConNguoi nguoi1 = new ConNguoi("Lap", 2021);
        
        nguoi1.an();
        HocSinh hs = new HocSinh("12", "tc3", "lap", 2021);
        hs.an();
        hs.lamBaiTap();
        
    }
}

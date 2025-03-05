/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1,1,2021);
        Ngay ngay2 = new Ngay(2,3,2023);
        
        TacGia tacGia1 = new TacGia("trinh quoc lap", ngay1);
        TacGia tacGia2 = new TacGia("nguyen vu ", ngay2);
        
        Sach sach1 = new Sach("abc", 5000, 2021, tacGia1);
        Sach sach2 = new Sach("cdf", 300, 2020, tacGia2);
        
        sach1.inTenSach();
        System.out.println("so sanh 2 sach: "+sach1.kiemTraCungNamXuatBan(sach2));
        
        System.out.println("sach1 giam 10%: "+sach1.giaSauKhiGiam(10));
        
    }
}

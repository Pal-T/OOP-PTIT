/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmon;

/**
 *
 * @author DELL
 */
public class Subject {
    private String maMon,tenMon;
    private int tinChi;

    public Subject(String maMon, String tenMon, int tinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    @Override
    public String toString() {
        return maMon + " "+ tenMon+ " "+ tinChi;
    }
    
    
    
}

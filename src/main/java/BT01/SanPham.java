/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT01;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private String maSo;
    private String ten;
    private float gia;

    public SanPham() {
    }
    public SanPham(String maSo, String ten, float gia) {
        this.maSo = maSo;
        this.ten = ten;
        this.gia = gia;
    }
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia (float gia){
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSo='" + maSo + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
}
    

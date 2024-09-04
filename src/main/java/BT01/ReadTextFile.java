/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadTextFile {
    public static void main(String[] args) throws IOException
 {
        List<SanPham> danhSachSanPham = new ArrayList<>();
        try ( 
                BufferedReader reader = new BufferedReader(new FileReader("sanpham.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String maso = parts[0];
                String ten = parts[1];
                float gia = Float.parseFloat(parts[2]);
                SanPham sanPham = new SanPham(maso, ten, gia);
                danhSachSanPham.add(sanPham);
            }
        }
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }
}
    
  
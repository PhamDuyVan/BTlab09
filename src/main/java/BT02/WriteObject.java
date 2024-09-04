/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

/**
 *
 * @author ADMIN
 */
import BT01.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[]args) throws Exception {
       List<SanPham> danhSachSanPham = new ArrayList<>();
       danhSachSanPham.add(new SanPham("SP001", "Bàn phím cơ", 500000));
       danhSachSanPham.add(new SanPham("SP002", "Chuột không dây", 300000));
       danhSachSanPham.add(new SanPham("SP003", "Tai nghe gaming", 800000));
        FileOutputStream fos = new FileOutputStream("sanpham.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(danhSachSanPham);
        }

        System.out.println("Danh sách sản phẩm đã được ghi vào file sanpham.bin");
    }
}

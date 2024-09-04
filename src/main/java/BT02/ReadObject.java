/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT02;

/**
 *
 * @author ADMIN
 */
import BT01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) throws Exception {
        // Đọc danh sách sản phẩm từ file nhị phân
        FileInputStream fis = new FileInputStream("sanpham.bin");
        List<SanPham> danhSachSanPham;
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            danhSachSanPham = (List<SanPham>) ois.readObject();
        }

        // In danh sách sản phẩm ra màn hình
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }
}

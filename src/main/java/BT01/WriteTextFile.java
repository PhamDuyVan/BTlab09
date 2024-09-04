/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteTextFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<SanPham> danhSachSanPham = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1));
            System.out.print("Mã số sản phẩm: ");
            String maso = scanner.nextLine();
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            float gia = scanner.nextFloat();
            scanner.nextLine(); 
            SanPham sanPham = new SanPham(maso, ten, gia);
            danhSachSanPham.add(sanPham);
        }
        try (FileWriter writer = new FileWriter("sanpham.txt")) {
            for (SanPham sanPham : danhSachSanPham) {
                writer.write(sanPham.toString() + "\n");
            }
        }
        System.out.println("Danh sách sản phẩm đã được ghi vào file sanpham.txt");
    }
}

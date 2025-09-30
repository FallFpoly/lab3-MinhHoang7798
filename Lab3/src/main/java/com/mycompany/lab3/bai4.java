/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    
    public static String HocLuc(double diem) {
        if (diem >= 9) {
            return "Xuat Sac";
        } else if (diem >= 7.5) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten[];
        double diem[];
        int n;

        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        sc.nextLine(); // bỏ dòng trống

        // Khởi tạo mảng
        hoten = new String[n];
        diem = new double[n];

        // Nhập dữ liệu
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));
            System.out.print("Ho ten: ");
            hoten[i] = sc.nextLine();
            System.out.print("Diem: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // bỏ enter
        }

        // Sắp xếp tăng dần theo điểm
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (diem[i] < diem[j]) {
                    // đổi điểm
                    double so = diem[i];
                    diem[i] = diem[j];
                    diem[j] = so;

                    // đổi tên tương ứng
                    String ten = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = ten;
                }
            }
        }

        // Xuất dữ liệu
        System.out.println("\n=== Danh sach sinh vien sau khi sap xep ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            System.out.println("Ho ten: " + hoten[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + HocLuc(diem[i]));
            System.out.println("----------------------");
        }
    }
}

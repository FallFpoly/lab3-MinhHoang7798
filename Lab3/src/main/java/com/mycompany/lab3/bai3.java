/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số phần tử mảng
        System.out.println("nhap so phan tu mang = ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.println("nhap a" + i + " = ");
            a[i] = sc.nextInt();
        }

        // sắp xếp mảng
        Arrays.sort(a);

        // xuất mảng sau khi sắp xếp
        System.out.println("mang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // tìm phần tử nhỏ nhất
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("phan tu nho nhat: " + min);

        // tính trung bình cộng các phần tử chia hết cho 3
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }

        if (dem > 0) {
            double tbc = (double) tong / dem;
            System.out.println("TB cong cac phan tu chia het cho 3 = " + tbc);
        } else {
            System.out.println("ko co phan tu nao chia het cho 3");
        }
    }
}


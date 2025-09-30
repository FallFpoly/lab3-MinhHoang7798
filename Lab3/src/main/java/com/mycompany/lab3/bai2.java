/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        // Xuất 9 bảng cửu chương
        for (int i = 1; i <= 9; i++) {          // vòng lặp ngoài cho số từ 1 đến 9
            for (int j = 1; j <= 10; j++) {     // vòng lặp trong cho số từ 1 đến 10
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println(); // xuống dòng sau mỗi bảng
        }
    }
}

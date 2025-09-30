/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen: ");
        int n = sc.nextInt();

        boolean ok = true;

        // vong lap tu 2 den N-1
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
            i++;
        }

        if (ok == true && n > 1) {
            System.out.println(" la so nguyen to");
        } else {
            System.out.println(" khong phai la so nguyen to");
        }
    }
}

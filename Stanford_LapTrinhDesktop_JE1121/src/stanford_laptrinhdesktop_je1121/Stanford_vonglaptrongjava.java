/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanford_laptrinhdesktop_je1121;

import java.util.Scanner;

/**
 *
 * @author khachao
 */
public class Stanford_vonglaptrongjava {

    public static void main(String[] args) {
        /*
        //khai bao bien
        int i = 1;
        System.out.println("Su dung vong lap while :");
        while (i <= 10)//true
        {
            System.out.println("I love you :" + i);
            i++;//tăng i lên 1 đơn vị mỗi lần chạy

        }
        System.out.println("Su dung vong lap while :");
        do {
            System.out.println("giá trị của i = " + i);
            i++;
        } while (i < 20);

        Scanner sc = new Scanner(System.in);

        //kiểm tra người dùng cần phải nhập đúng số gồm 4 chữ số
        int so4ChuSo = 0;

        do {
            System.out.print("nhập số gồm 4 chữ số :");
            so4ChuSo = sc.nextInt();

        } while (so4ChuSo < 1000 || so4ChuSo > 9999);
        System.out.println("số 4 chữ số là :" + so4ChuSo);
         
        Scanner sc = new Scanner(System.in);

        System.out.println("sử dụng vòng lặp for : ");

        for (int i = 80; i <= 90; i += 2)//i = i + 2
        {
            System.out.println(i);

            //Baitap4_p4
            Scanner sc = new Scanner(System.in);
            int N = 0;
            double S1 = 0, S2 = 0;

            System.out.println("nhập giá trị của dãy n :");
            N = sc.nextInt();
            //duyệt vòng lặp đẻ tính toán
            for(int i = 1; i <= N; i++) {
                S1 += i;//S1 = S1 + i

                S2 += i * i;
               
            } 
         */
        Scanner sc = new Scanner(System.in);
        //bai tap 5
        //khai bao bien 
        int tich = 0, tong = 0, chuc = 0, donVi = 0;
        System.out.println("Các số 2 chữ số mà có tích bằng 2 lần tổng: ");
        for (int i = 10; i <= 60; i++) {
            chuc = i / 10;
            donVi = i % 10;
            tich = chuc * donVi;
            tong = chuc + donVi;
            if (tich == 2 * tong)//True
            {
                System.out.println(i);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stanford_CauTrucLapTrinhJava;
import java.util.Scanner;
/**
 *
 * @author khachao
 */

public class p2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    /*
    //Ví dụ 1
    int thang = 0;
        String strThangHienTai = "";
        System.out.print("Nhập thông tin tháng = ");
        thang = sc.nextInt();
        //Kiểm tra tháng
        switch(thang)
        {
            case 1: 
                strThangHienTai = "Tháng một";
                break;
            case 2: 
                strThangHienTai = "Tháng hai";
                break;    
            case 3: 
                strThangHienTai = "Tháng ba";
                break;  
            case 4:
                strThangHienTai = "Tháng tư";
                break;
            case 5:
                strThangHienTai = "Tháng năm";
                break;
            case 6:
                strThangHienTai = "Tháng sáu";
                break;
            case 7:
                strThangHienTai = "Tháng bẩy";
                break;
            case 8:
                strThangHienTai = "Tháng tám";
                break;
            case 9:
                strThangHienTai = "Tháng chín";
                break;
            case 10:
                strThangHienTai = "Tháng mười";
                break;
            case 11:
                strThangHienTai = "Tháng mười một";
                break;
            case 12:
                strThangHienTai = "Tháng mười hai";
                break;
            default:
                strThangHienTai = "Không có tháng này";
                break;
        }//end switch
        //Hiển thị kết quả
        System.out.println("Tháng hiện tại là: " + strThangHienTai);
    */
    //vidu2: nhập vào 2 số thực và phếp toán (+,-,*,/)sau đó tính kq theo phép tính
    //phép tính tương ứng và in ra màn hình.
     //khai báo biến
    double soa = 0,sob = 0,ketQua = 0;
    String phepToan;
    System.out.print("nhap phep toan : ");
    phepToan = sc.nextLine();
    //kiem tra phep toan
    System.out.print("So a = ");
        soa = sc.nextDouble();
        System.out.print("So b = ");
        sob = sc.nextDouble();
        sc.nextLine();
        
        switch(phepToan) {
            case "+":
                ketQua = soa + sob;
                break;
            case "-":
                ketQua = soa - sob;
                break;
            case "*":
                ketQua = soa * sob;
                break;
            case "/":
                if (sob != 0) {
                    ketQua = soa/sob;
                } else {
                    System.out.println("Nhap so b khac 0");
                }
                break;
            default:
                System.out.println("Hay nhap phep toan");
        }
        
        if (sob != 0) {
            System.out.printf("Ket qua %.1f %s %.1f = %.1f", soa, phepToan, sob, ketQua);
        } else {
            System.out.println("");
        }
    
    }
}     
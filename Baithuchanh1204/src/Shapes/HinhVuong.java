package Shapes;

import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    
    //constructor
    public HinhVuong() {
        ten = "Hình Vuông";
    }
    public void nhapCanh() {
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
        sc.close();
    }
}

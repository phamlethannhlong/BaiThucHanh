package Slide77;

public class Hinhhoc {
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;
    
    public static final float PI =3.14F;
    public static final float INCH_CM= 2.54f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INC = 2;
    public static int donVi = DON_VI_CM;

    public static float ChuyenCentimetsangInch(float cm){
        float inch = cm / INCH_CM;
        return inch;
    }
    public static float ChuyenInchsangCentimet(float inch){
        float cm = inch * INCH_CM;
        return cm;
    }
}
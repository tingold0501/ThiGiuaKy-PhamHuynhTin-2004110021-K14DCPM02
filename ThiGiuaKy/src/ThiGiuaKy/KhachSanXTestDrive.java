package ThiGiuaKy;

import java.text.ParseException;


public class KhachSanXTestDrive {
    public static void main(String[] args) throws ParseException {
        KhachSanX kSanX = new HoaDonTheoGioThue();
        KhachSanX kSanX2 = new HoaDonTheoNgay();
        kSanX.nhap();
        System.out.println(kSanX);
        kSanX2.nhap();
        System.out.println(kSanX2);
        
        
    }
}

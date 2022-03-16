package ThiGiuaKy;

import java.util.Date;

public class HoaDonTheoNgay extends KhachSanX {
    private float thanhTien, soNgayThue;
    public HoaDonTheoNgay(){

    }

    public HoaDonTheoNgay(int maHoaDon, int maPhong, Date ngayHoaDon, String tenKhachHang, float donGia,
        float thanhTien, float soNgayThue) {
        super(maHoaDon, maPhong, ngayHoaDon, tenKhachHang, donGia);
        this.thanhTien = thanhTien;
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(float thanhTien, float soNgayThue) {
        this.thanhTien = thanhTien;
        this.soNgayThue = soNgayThue;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public float getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(float soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    @Override
    public String toString() {
        String string = "So Ngay Thue";
        return super.toString() + string + this.soNgayThue;
    }
    @Override
    public void nhap() {
        System.out.println("Nhập Số Ngày Thuê: ");
        this.soNgayThue = sc.nextFloat();
        this.nhapHoaDonTheoGio();
        super.nhap();
    }
}

package ThiGiuaKy;

import java.util.Date;

public class HoaDonTheoGioThue extends KhachSanX {
    private float thanhTien, soGioThue;
    public HoaDonTheoGioThue(){

    }

    public HoaDonTheoGioThue(int maHoaDon, int maPhong, Date ngayHoaDon, String tenKhachHang, float donGia,
        float thanhTien, float soGioThue) {
        super(maHoaDon, maPhong, ngayHoaDon, tenKhachHang, donGia);
        this.thanhTien = thanhTien;
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGioThue(float thanhTien, float soGioThue) {
        this.thanhTien = thanhTien;
        this.soGioThue = soGioThue;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public float getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(float soGioThue) {
        this.soGioThue = soGioThue;
    }
    @Override
    public String toString() {
        String string = "So Gio Thue";
        return super.toString() + string + this.soGioThue;
    }
    @Override
    public void nhap() {
        System.out.println("Nhập Số Giờ Thuê:");
        this.soGioThue = sc.nextFloat();
        super.nhap();
    }
}

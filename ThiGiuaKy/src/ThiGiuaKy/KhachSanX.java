package ThiGiuaKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhachSanX {
    private int maHoaDon, maPhong;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private float donGia;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy");
    public KhachSanX(){

    }
    public int getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(int maHoaDon) {
      
        this.maHoaDon = maHoaDon;
    }
    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public float getDonGia() {
        return donGia;
    }
    public KhachSanX(int maHoaDon, int maPhong, Date ngayHoaDon, String tenKhachHang, float donGia) {
        this.maHoaDon = maHoaDon;
        this.maPhong = maPhong;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.donGia = donGia;
    }
    public void nhapHoaDonTheoGio(){
        System.out.println("Nhập Số Giờ Thuê:");
        float soGioThue = sc.nextFloat();
        this.tinhTienPhongTheoGio(soGioThue);
        System.out.println(soGioThue);

    }
    private float tinhTienPhongTheoGio(float soGioThue){
        float thanhTien = soGioThue * this.donGia;
        if(soGioThue > 24 && soGioThue < 30){
            thanhTien = 24 * this.donGia;
        }
        else if(soGioThue > 30){
            System.out.println("Bill Của Bạn Sẻ Được Tính Sang Bill Ngày");
        }
        return thanhTien;
    }
    // public void nhapHoaDonTheoNgay(){
    //     System.out.println("Nhập Số Ngày Thuê:");
    //     float soNgayThue = sc.nextFloat();
    //     this.tinhTienPhongTheoNgay(soNgayThue);
    // }
    // private float tinhTienPhongTheoNgay(float soNgayThue){
    //     float thanhTien = soNgayThue *donGia;
    //     if(soNgayThue > 7){
            
    //     }
    //     return thanhTien;
    // }
    @Override
    public String toString() {
        return "KhachSanX [donGia=" + donGia + ", maHoaDon=" + maHoaDon + ", maPhong=" + maPhong + ", ngayHoaDon="
                + ngayHoaDon + ", tenKhachHang=" + tenKhachHang + "]";
    }
    public void nhap(){
        System.out.println("Nhập Mã Hoá Đơn: ");
        this.maHoaDon = sc.nextInt();
        System.out.println("Nhập Ngày Hoá Đơn: ");
        try {
            this.ngayHoaDon = sFormat.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Ngày Không Hợp Lệ!!!");
            e.printStackTrace();
        }
        System.out.println("Nhập Tên Khách Hàng: ");
        this.tenKhachHang = sc.nextLine();
        System.out.println("Nhập Mã Phòng: ");
        this.maPhong = sc.nextInt();
        System.out.println("Nhập Đơn Giá: ");
        this.donGia = sc.nextFloat();
    }
}

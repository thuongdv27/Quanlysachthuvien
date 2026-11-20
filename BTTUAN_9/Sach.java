package BTTUAN_9;

 import java.util.Scanner;

public class Sach {
    protected String ma, ngayNhap, nxb;
    protected double donGia;
    protected int soLuong;

    public Sach() {}

    public Sach(String ma, String ngayNhap, double donGia, int soLuong, String nxb) {
        this.ma = ma;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }

    public void nhap(Scanner sc) {
        System.out.print("Ma sach: ");
        ma = sc.nextLine();
        System.out.print("Ngay nhap (dd/mm/yyyy): ");
        ngayNhap = sc.nextLine();
        System.out.print("Don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nha xuat ban: ");
        nxb = sc.nextLine();
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void xuat() {
        System.out.print("Ma: " + ma + " | Ngay: " + ngayNhap + " | Don gia: " + donGia
                + " | SL: " + soLuong + " | NXB: " + nxb);
    }

    
}
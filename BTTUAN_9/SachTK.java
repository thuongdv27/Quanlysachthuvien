package BTTUAN_9;

import java.util.Scanner;

public class SachTK extends Sach {
    private double thue;

    public SachTK() {}

    public SachTK(String ma, String ngayNhap, double donGia, int soLuong, String nxb, double thue) {
        super(ma, ngayNhap, donGia, soLuong, nxb);
        this.thue = thue;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" | Thue: " + thue + " | Thanh tien: " + tinhThanhTien());
    }
}
package BTTUAN_9;

import java.util.Scanner;

public class SachGK extends Sach {
    private String tinhTrang;

    public SachGK() {}

    public SachGK(String ma, String ngayNhap, double donGia, int soLuong, String nxb, String tinhTrang) {
        super(ma, ngayNhap, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Tinh trang (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        }
        return soLuong * donGia * 0.5;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" | Tinh trang: " + tinhTrang + " | Thanh tien: " + tinhThanhTien());
    }
}
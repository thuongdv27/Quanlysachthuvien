package BTTUAN_9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> ds = new ArrayList<>();

        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap sach thu " + (i + 1) + " ---");
            System.out.print("Chon loai (1: Sach giao khoa, 2: Sach tham khao): ");
            int loai = Integer.parseInt(sc.nextLine());

            Sach s = (loai == 1) ? new SachGK() : new SachTK();
            s.nhap(sc);
            ds.add(s);
        }

        System.out.println("\n--- DANH SACH CAC LOAI SACH ---");
        for (Sach s : ds) {
            s.xuat();
        }

        double tongSGK = 0, tongSTK = 0, tongDonGiaTK = 0;
        int demTK = 0;

        for (Sach s : ds) {
            if (s instanceof SachGK) {
                tongSGK += s.tinhThanhTien();
            } else if (s instanceof SachTK) {
                tongSTK += s.tinhThanhTien();
                tongDonGiaTK += s.donGia;
                demTK++;
            }
        }

        System.out.println("\nTong thanh tien Sach giao khoa: " + tongSGK);
        System.out.println("Tong thanh tien Sach tham khao: " + tongSTK);

        if (demTK > 0) {
            System.out.println("Trung binh cong don gia Sach tham khao: " + (tongDonGiaTK / demTK));
        } else {
            System.out.println("Khong co Sach tham khao trong danh sach.");
        }

        System.out.print("\nNhap ten NXB X can tim (Sach giao khoa): ");
        String x = sc.nextLine();
        boolean timThay = false;

        System.out.println("--- SACH GIAO KHOA CUA NXB " + x + " ---");
        for (Sach s : ds) {
            if (s instanceof SachGK && s.nxb.equalsIgnoreCase(x)) {
                s.xuat();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa cua NXB " + x);
        }

        sc.close();
    }
}
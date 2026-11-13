import java.util.ArrayList;

public class BTTUAN_07_08_TEST {
    public static void main(String[] args) {
        
        ArrayList<BTTUAN_07_08_SACH> danhSachSach = new ArrayList<>();

        System.out.println("===== HE THONG QUAN LY SACH (OOP - DONG GOI) =====");
        System.out.println("\n--- 1. KHOI TAO VA KIEM TRA BO LOC LOI ---");
        
      
        BTTUAN_07_08_SACH sach1 = new BTTUAN_07_08_SACH("S01", "Lap Trinh Java Co Ban", "Quoc Tuan", 2024, 15);
        
        
        System.out.println("-> Dang them cuon S02 co du lieu sai...");
        BTTUAN_07_08_SACH sach2 = new BTTUAN_07_08_SACH("S02", "Cau Truc Du Lieu", "Thanh Binh", 2030, -5);

        // Thêm vào danh sách
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);

        System.out.println("\n--- 2. DANH SACH THU VIEN BAN DAU ---");
        for (BTTUAN_07_08_SACH s : danhSachSach) {
            s.hienThiThongTin();
        }

        System.out.println("\n--- 3. SUA LAI DU LIEU CHO DUNG ---");
        
        sach2.setNamXuatBan(2025);
        sach2.setSoLuong(20);
        
        
        for (BTTUAN_07_08_SACH s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}

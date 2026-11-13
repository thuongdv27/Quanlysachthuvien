import java.util.ArrayList;

public class BTTUAN_07_TEST {
    public static void main(String[] args) {
        // Tạo kho chứa sách
        ArrayList<BTTUAN_07_SACH> danhSachSach = new ArrayList<>();

        System.out.println("--- TIEN HANH NHAP DU LIEU SACH ---");
        
        // Cuốn 1: Dữ liệu chuẩn xác
        BTTUAN_07_SACH sach1 = new BTTUAN_07_SACH("S01", "Lap trinh Java co ban", "Nguyen Van A", 2025, 15);
        
        // Cuốn 2: Cố tình nhập sai năm (2030) và sai số lượng (-5) để thử hệ thống lọc lỗi
        BTTUAN_07_SACH sach2 = new BTTUAN_07_SACH("S02", "Cau truc du lieu", "Tran Thi B", 2030, -5);

        // Thêm vào kho
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);

        System.out.println("\n--- DANH SACH THU VIEN KHI VUA THEM ---");
        for (BTTUAN_07_SACH s : danhSachSach) {
            s.hienThiThongTin();
        }

        System.out.println("\n--- SUA LAI DU LIEU CHO DUNG BIEU MAU ---");
        // Dùng Setter để ghi đè lại dữ liệu chuẩn cho cuốn số 2
        sach2.setNamXuatBan(2026);
        sach2.setSoLuong(30);
        
        // In lại cuốn số 2 xem đã cập nhật chưa
        sach2.hienThiThongTin();
    }
}
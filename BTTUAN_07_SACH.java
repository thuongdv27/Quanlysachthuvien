import java.time.Year;

public class BTTUAN_07_SACH {
    // 1. Đóng gói thuộc tính (private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // 2. Constructor: Hàm khởi tạo nhanh có đầy đủ tham số
    public BTTUAN_07_SACH (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        // Bắt buộc đẩy qua Setter để lọc lỗi ngay từ lúc tạo mới
        this.setNamXuatBan(namXuatBan); 
        this.setSoLuong(soLuong);
    }

    // 3. Các hàm Get/Set (Cửa ngõ giao tiếp với bên ngoài)
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    
    // Lọc lỗi: Năm xuất bản không được lớn hơn năm hiện tại
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("[LOI] Nam xuat ban '" + namXuatBan + "' khong hop le!");
        }
    }

    public int getSoLuong() { return soLuong; }
    
    // Lọc lỗi: Số lượng không được là số âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("[LOI] So luong '" + soLuong + "' khong duoc am!");
        }
    }

    // 4. Hàm hiển thị
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach + " | Tieu de: " + tieuDe + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | So luong: " + soLuong);
    }
}

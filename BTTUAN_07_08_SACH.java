import java.time.Year;

public class BTTUAN_07_08_SACH {
    // Yêu cầu 1: Khai báo tất cả thuộc tính với từ khóa private để bảo mật dữ liệu
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Yêu cầu 4: Constructor có đầy đủ tham số để khởi tạo nhanh
    public BTTUAN_07_08_SACH(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        // Đưa dữ liệu qua Setter để tận dụng ngay bộ lọc lỗi bên dưới
        this.setNamXuatBan(namXuatBan); 
        this.setSoLuong(soLuong);
    }

    // Yêu cầu 2: Cung cấp đầy đủ các phương thức Getter (lấy) và Setter (sửa)
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    
    // Yêu cầu 3: Kiểm soát dữ liệu Năm xuất bản (Không lớn hơn năm hiện tại)
    public void setNamXuatBan(int namXuatBan) {
        int namHienTai = Year.now().getValue(); 
        if (namXuatBan > 0 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("[CANH BAO LOI] Nam xuat ban '" + namXuatBan + "' khong hop le. Da tra ve gia tri mac dinh!");
        }
    }

    public int getSoLuong() { return soLuong; }
    
    // Yêu cầu 3: Kiểm soát dữ liệu Số lượng (Không được âm)
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("[CANH BAO LOI] So luong '" + soLuong + "' bi am. Da tra ve gia tri mac dinh!");
        }
    }

    // Phương thức hiển thị
    public void hienThiThongTin() {
        System.out.println(String.format("Ma: %-5s | Tieu de: %-25s | Tac gia: %-15s | Nam XB: %-4d | So luong: %d", 
                           maSach, tieuDe, tacGia, namXuatBan, soLuong));
    }
}
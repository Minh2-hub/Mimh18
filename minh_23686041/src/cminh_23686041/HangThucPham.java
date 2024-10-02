package cminh_23686041;
import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private String nhaCungCap;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaCungCap = nhaCungCap;
        this.ngaySanXuat = ngaySanXuat.isBefore(LocalDate.now()) ? ngaySanXuat : LocalDate.now();
        this.ngayHetHan = ngayHetHan.isAfter(this.ngaySanXuat) ? ngayHetHan : this.ngaySanXuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.05;
    }

    @Override
    public String danhGiaKhoBan() {
        if (soLuongTon > 0 && ngayHetHan.isBefore(LocalDate.now())) {
            return "Khó bán";
        }
        return "Bán được";
    }
}

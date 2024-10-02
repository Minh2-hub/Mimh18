package cminh_23686041;
import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
	    private String nhaSanXuat;
	    private LocalDate ngayNhapKho;

	    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) {
	        super(maHang, tenHang, donGia, soLuongTon);
	        this.nhaSanXuat = nhaSanXuat;
	        this.ngayNhapKho = ngayNhapKho.isBefore(LocalDate.now()) ? ngayNhapKho : LocalDate.now();
	    }

	    @Override
	    public double tinhVAT() {
	        return donGia * 0.10;
	    }

	    @Override
	    public String danhGiaKhoBan() {
	        long daysInStorage = LocalDate.now().toEpochDay() - ngayNhapKho.toEpochDay();
	        return (soLuongTon > 50 && daysInStorage > 10) ? "Bán chậm" : "Không đánh giá";
	    }
	}

}

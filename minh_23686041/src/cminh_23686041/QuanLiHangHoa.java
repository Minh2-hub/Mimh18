package cminh_23686041;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.Optional;

public class QuanLiHangHoa {
	    private HangHoa[] danhSachHang;
	    private int count;

	    public QuanLiHangHoa(int n) {
	        danhSachHang = new HangHoa[n];
	        count = 0;
	    }

	    // Phương thức thêm một hàng hóa vào danh sách
	    public boolean themHangHoa(HangHoa hangHoa) {
	        if (count >= danhSachHang.length) {
	            System.out.println("Danh sách đã đầy.");
	            return false;
	        }
	        // Kiểm tra mã hàng có bị trùng không
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].maHang.equals(hangHoa.maHang)) {
	                System.out.println("Mã hàng đã tồn tại.");
	                return false;
	            }
	        }
	        danhSachHang[count] = hangHoa;
	        count++;
	        return true;
	    }

	    // Phương thức lấy thông tin toàn bộ danh sách hàng hóa
	    public void layThongTinToanBo() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(danhSachHang[i]);
	        }
	    }

	    // Phương thức lấy thông tin từng loại hàng hóa
	    public void layThongTinHangThucPham() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i] instanceof HangThucPham) {
	                System.out.println(danhSachHang[i]);
	            }
	        }
	    }

	    public void layThongTinHangDienMay() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i] instanceof HangDienMay) {
	                System.out.println(danhSachHang[i]);
	            }
	        }
	    }

	    public void layThongTinHangSanhSu() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i] instanceof HangSanhSu) {
	                System.out.println(danhSachHang[i]);
	            }
	        }
	    }

	    // Phương thức tìm kiếm hàng hóa khi biết mã hàng
	    public HangHoa timHangHoa(String maHang) {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].maHang.equals(maHang)) {
	                return danhSachHang[i];
	            }
	        }
	        return null;
	    }

	    // Phương thức sắp xếp hàng hóa theo tên hàng tăng dần
	    public void sapXepTheoTenHang() {
	        Arrays.sort(danhSachHang, 0, count, Comparator.comparing(h -> h.tenHang));
	    }

	    // Phương thức sắp xếp hàng hóa theo số lượng tồn giảm dần
	    public void sapXepTheoSoLuongTon() {
	        Arrays.sort(danhSachHang, 0, count, (h1, h2) -> Integer.compare(h2.soLuongTon, h1.soLuongTon));
	    }

	    // Phương thức lấy thông tin các hàng thực phẩm khó bán
	    public void layThongTinHangThucPhamKhoBan() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i] instanceof HangThucPham) {
	                HangThucPham thucPham = (HangThucPham) danhSachHang[i];
	                if (thucPham.danhGiaKhoBan().equals("Khó bán")) {
	                    System.out.println(thucPham);
	                }
	            }
	        }
	    }

	    // Phương thức xóa hàng hóa khi biết mã hàng
	    public boolean xoaHangHoa

}

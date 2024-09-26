package congminh;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhong;

    public QuanLyPhongHoc() {
        danhSachPhong = new ArrayList<>();
    }

    // Thêm phòng học (kiểm tra trùng)
    public boolean themPhongHoc(PhongHoc phong) {
        for (PhongHoc p : danhSachPhong) {
            if (p.getMaPhong().equals(phong.getMaPhong())) {
                System.out.println("Mã phòng đã tồn tại.");
                return false;
            }
        }
        danhSachPhong.add(phong);
        return true;
    }

    // Tìm phòng học theo mã
    public PhongHoc timPhongHocTheoMa(String maPhong) {
        for (PhongHoc phong : danhSachPhong) {
            if (phong.getMaPhong().equals(maPhong)) {
                return phong;
            }
        }
        return null;
    }

    // Hiển thị tất cả các phòng
    public void hienThiTatCaPhongHoc() {
        for (PhongHoc phong : danhSachPhong) {
            System.out.println(phong);
        }
    }

    // Hiển thị các phòng đạt chuẩn
    public void hienThiPhongHocDatChuan() {
        for (PhongHoc phong : danhSachPhong) {
            if (phong.kiemTraDatChuan()) {
                System.out.println(phong);
            }
        }
    }

    // Sắp xếp phòng theo diện tích
    public void sapXepTheoDienTich() {
        danhSachPhong.sort((p1, p2) -> Double.compare(p1.getDienTich(), p2.getDienTich()));
    }

    // Sắp xếp phòng theo số bóng đèn
    public void sapXepTheoSoBongDen() {
        danhSachPhong.sort((p1, p2) -> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
    }
}

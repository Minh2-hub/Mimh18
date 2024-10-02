package cminh_23686041;


class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh; // tháng
    private double congSuat; // KW

    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.thoiGianBaoHanh = Math.max(thoiGianBaoHanh, 0);
        this.congSuat = Math.max(congSuat, 0);
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10;
    }

    @Override
    public String danhGiaKhoBan() {
        return soLuongTon < 3 ? "Bán được" : "Không đánh giá";
    }
}

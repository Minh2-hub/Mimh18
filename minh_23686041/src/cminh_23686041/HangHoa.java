package cminh_23686041;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang = "xxx";
    protected double donGia;
    protected int soLuongTon;

    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = Math.max(donGia, 0);
        this.soLuongTon = Math.max(soLuongTon, 0);
    }

    public abstract double tinhVAT();
    public abstract String danhGiaKhoBan();
}

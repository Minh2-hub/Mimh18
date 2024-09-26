package congminh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp trừu tượng Phòng học
abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public abstract boolean kiemTraDatChuan();

    public String getMaPhong() {
        return maPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    @Override
    public String toString() {
        return "Mã phòng: " + maPhong + ", Dãy nhà: " + dayNha + ", Diện tích: " + dienTich + "m², Số bóng đèn: " + soBongDen;
    }
}

// Lớp con Phòng lý thuyết
class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    @Override
    public boolean kiemTraDatChuan() {
        return coMayChieu && (soBongDen >= dienTich / 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Có máy chiếu: " + coMayChieu;
    }
}

// Lớp con Phòng máy tính
class PhongMayTinh extends PhongHoc {
    private int soLuongMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soLuongMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soLuongMayTinh = soLuongMayTinh;
    }

    @Override
    public boolean kiemTraDatChuan() {
        return (soLuongMayTinh >= dienTich / 1.5) && (soBongDen >= dienTich / 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Số lượng máy tính: " + soLuongMayTinh;
    }
}

// Lớp con Phòng thí nghiệm
class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    @Override
    public boolean kiemTraDatChuan() {
        return coBonRua && (soBongDen >= dienTich / 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Chuyên ngành: " + chuyenNganh + ", Sức chứa: " + sucChua + ", Có bồn rửa: " + coBonRua;
    }
}


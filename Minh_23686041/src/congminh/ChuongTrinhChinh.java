package congminh;

public class ChuongTronhChinh {
    public static void main(String[] args) {
        QuanLyPhongHoc quanLy = new QuanLyPhongHoc();
        Scanner scanner = new Scanner(System.in);

        // Dữ liệu mẫu
        quanLy.themPhongHoc(new PhongLyThuyet("T01", "A", 30, 4, true));
        quanLy.themPhongHoc(new PhongMayTinh("C01", "B", 45, 6, 30));
        quanLy.themPhongHoc(new PhongThiNghiem("L01", "C", 50, 5, "Hóa học", 40, true));

        int luaChon;

        do {
            System.out.println("\nMenu Quản lý Phòng học:");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm phòng theo mã");
            System.out.println("3. Hiển thị tất cả phòng");
            System.out.println("4. Hiển thị phòng đạt chuẩn");
            System.out.println("5. Sắp xếp phòng theo diện tích");
            System.out.println("6. Sắp xếp phòng theo số bóng đèn");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();  // Nhận Enter

            switch (luaChon) {
                case 1:
                    // Thêm phòng học (chỉ ví dụ cho Phòng lý thuyết)
                    System.out.println("Thêm Phòng lý thuyết:");
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = scanner.nextLine();
                    System.out.print("Nhập diện tích: ");
                    double dienTich = scanner.nextDouble();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = scanner.nextInt();
                    System.out.print("Có máy chiếu (true/false): ");
                    boolean coMayChieu = scanner.nextBoolean();

                    PhongHoc phong = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                    quanLy.themPhongHoc(phong);
                    break;

                case 2:
                    // Tìm phòng theo mã
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maCanTim = scanner.nextLine();
                    PhongHoc phongTim = quanLy.timPhongHocTheoMa(maCanTim);
                    if (phongTim != null) {
                        System.out.println("Phòng tìm thấy: " + phongTim);
                    } else {
                        System.out.println("Không tìm thấy phòng.");
                    }
                    break;

                case 3:
                    // Hiển thị tất cả phòng
                    System.out.println("Danh sách tất cả phòng:");
                    quanLy.hienThiTatCaPhongHoc();
                    break;

                case 4:
                    // Hiển thị phòng đạt chuẩn
                    System.out.println("Danh sách phòng đạt chuẩn:");
                    quanLy.hienThiPhongHocDatChuan();
                    break;

                case 5:
                    // Sắp xếp theo diện tích
                    quanLy.sapXepTheoDienT

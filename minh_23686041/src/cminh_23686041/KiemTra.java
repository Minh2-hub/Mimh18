package cminh_23686041;
	import java.time.LocalDate;
	import java.util.Scanner;

	public class KiemTra {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        QuanLiHangHoa quanLy = new QuanLiHangHoa(100); // Giả sử có tối đa 100 hàng hóa
	        int luaChon;

	        do {
	            System.out.println("=== QUẢN LÝ HÀNG HÓA ===");
	            System.out.println("1. Thêm hàng hóa");
	            System.out.println("2. Lấy thông tin toàn bộ hàng hóa");
	            System.out.println("3. Lấy thông tin hàng thực phẩm");
	            System.out.println("4. Tìm kiếm hàng hóa theo mã hàng");
	            System.out.println("5. Sắp xếp hàng hóa theo tên hàng");
	            System.out.println("6. Sắp xếp hàng hóa theo số lượng tồn");
	            System.out.println("7. Lấy thông tin hàng thực phẩm khó bán");
	            System.out.println("8. Xóa hàng hóa theo mã hàng");
	            System.out.println("9. Sửa thông tin đơn giá của hàng hóa");
	            System.out.println("0. Thoát");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            luaChon = scanner.nextInt();
	            scanner.nextLine(); // Đọc bỏ newline

	            switch (luaChon) {
	                case 1:
	                    // Thêm hàng hóa
	                    System.out.print("Nhập mã hàng: ");
	                    String maHang = scanner.nextLine();
	                    System.out.print("Nhập tên hàng: ");
	                    String tenHang = scanner.nextLine();
	                    System.out.print("Nhập đơn giá: ");
	                    double donGia = scanner.nextDouble();
	                    System.out.print("Nhập số lượng tồn: ");
	                    int soLuongTon = scanner.nextInt();
	                    scanner.nextLine(); // Đọc bỏ newline

	                    // Xác định loại hàng hóa
	                    System.out.println("Chọn loại hàng hóa:");
	                    System.out.println("1. Hàng thực phẩm");
	                    System.out.println("2. Hàng điện máy");
	                    System.out.println("3. Hàng sành sứ");
	                    int loaiHang = scanner.nextInt();
	                    scanner.nextLine(); // Đọc bỏ newline

	                    switch (loaiHang) {
	                        case 1: // Hàng thực phẩm
	                            System.out.print("Nhập nhà cung cấp: ");
	                            String nhaCungCap = scanner.nextLine();
	                            System.out.print("Nhập ngày sản xuất (yyyy-MM-dd): ");
	                            LocalDate ngaySanXuat = LocalDate.parse(scanner.nextLine());
	                            System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
	                            LocalDate ngayHetHan = LocalDate.parse(scanner.nextLine());

	                            HangThucPham thucPham = new HangThucPham(maHang, tenHang, donGia, soLuongTon, nhaCungCap, ngaySanXuat, ngayHetHan);
	                            quanLy.themHangHoa(thucPham);
	                            break;
	                        case 2: // Hàng điện máy
	                            System.out.print("Nhập thời gian bảo hành (tháng): ");
	                            int thoiGianBaoHanh = scanner.nextInt();
	                            System.out.print("Nhập công suất (KW): ");
	                            double congSuat = scanner.nextDouble();
	                            HangDienMay dienMay = new HangDienMay(maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh, congSuat);
	                            quanLy.themHangHoa(dienMay);
	                            break;
	                        case 3: // Hàng sành sứ
	                            System.out.print("Nhập nhà sản xuất: ");
	                            String nhaSanXuat = scanner.nextLine();
	                            System.out.print("Nhập ngày nhập kho (yyyy-MM-dd): ");
	                            LocalDate ngayNhapKho = LocalDate.parse(scanner.nextLine());
	                            HangSanhSu sanhSu = new HangSanhSu(maHang, tenHang, donGia, soLuongTon, nhaSanXuat, ngayNhapKho);
	                            quanLy.themHangHoa(sanhSu);
	                            break;
	                        default:
	                            System.out.println("Loại hàng không hợp lệ.");
	                    }
	                    break;

	                case 2:
	                    // Lấy thông tin toàn bộ hàng hóa
	                    System.out.println("Danh sách toàn bộ hàng hóa:");
	                    quanLy.layThongTinToanBo();
	                    break;

	                case 3:
	                    // Lấy thông tin hàng thực phẩm
	                    System.out.println("Danh sách hàng thực phẩm:");
	                    quanLy.layThongTinHangThucPham();
	                    break;

	                case 4:
	                    // Tìm kiếm hàng hóa theo mã hàng
	                    System.out.print("Nhập mã hàng cần tìm: ");
	                    String maHangTim = scanner.nextLine();
	                    HangHoa hangTimThay = quanLy.timHangHoa(maHangTim);
	                    if (hangTimThay != null) {
	                        System.out.println("Thông tin hàng hóa tìm thấy:");
	                        System.out.println(hangTimThay);
	                    } else {
	                        System.out.println("Không tìm thấy hàng hóa với mã hàng này.");
	                    }
	                    break;

	                case 5:
	                    // Sắp xếp hàng hóa theo tên hàng
	                    quanLy.sapXepTheoTenHang();
	                    System.out.println("Đã sắp xếp hàng hóa theo tên.");
	                    break;

	                case 6:
	                    // Sắp xếp hàng hóa theo số lượng tồn
	                    quanLy.sapXepTheoSoLuongTon();
	                    System.out.println("Đã sắp xếp hàng hóa theo số lượng tồn.");
	                    break;

	                case 7:
	                    // Lấy thông tin hàng thực phẩm khó bán
	                    System.out.println("Danh sách hàng thực phẩm khó bán:");
	                    quanLy.layThongTinHangThucPhamKhoBan();
	                    break;

	                case 8:
	                    // Xóa hàng hóa theo mã hàng
	                    System.out.print("Nhập mã hàng cần xóa: ");
	                    String maHangXoa = scanner.nextLine();
	                    if (quanLy.xoaHangHoa(maHangXoa)) {
	                        System.out.println("Đã xóa hàng hóa với mã hàng: " + maHangXoa);
	                    } else {
	                        System.out.println("Không tìm thấy hàng hóa với mã hàng này.");
	                    }
	                    break;

	                case 9:
	                    // Sửa thông tin đơn giá của hàng hóa
	                    System.out.print("Nhập mã hàng cần sửa: ");
	                    String maHangSua = scanner.nextLine();
	                    System.out.print("Nhập đơn giá mới: ");
	                    double donGiaMoi = scanner.nextDouble();
	                    if (quanLy.suaDonGia(maHangSua, donGiaMoi)) {
	                        System.out.println("Đã sửa đơn giá của hàng hóa với mã hàng: " + maHangSua);
	                    } else {
	                        System.out.println("Không tìm thấy hàng hóa với mã hàng này.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Thoát chương trình.");
	                    break;

	                default:
	                    System.out.println("Lựa chọn không hợp lệ.");
	            }

	            System.out.println();
	        } while (luaChon != 0);

	        scanner.close();
	    }
	}



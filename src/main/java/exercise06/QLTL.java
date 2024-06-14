package exercise06;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLTL {
    private Scanner scanner = new Scanner(System.in);
    private List<TaiLieu> taiLieuList = new LinkedList<>();

    private String nhapMaTaiLieu() {
        System.out.println("Nhap ma tai lieu : ");
        return scanner.nextLine();
    }

    private String nhapTenNhaSanXuat() {
        System.out.println("Nhap ten nha san xuat");
        return scanner.nextLine();
    }

    private int nhapSoBanPhatHanh() {
        System.out.println("Nhap so ban phat hanh");
        return Integer.parseInt(scanner.nextLine());
    }

    private void themTailieu() {
        System.out.println("1. Sach ");
        System.out.println("2. Tap chi ");
        System.out.println("3. Bao ");
        System.out.println("Chon menu ");
        int menu = Integer.parseInt(scanner.nextLine());
        if (menu < 1 || menu > 3) return;
        String maTaiLieu = nhapMaTaiLieu();
        String tenNhaSanXuat = nhapTenNhaSanXuat();
        int soBanPhatHanh = nhapSoBanPhatHanh();
        if (menu == 1) {
            System.out.println("Nhap vao ten tac gia : ");
            String tenTacGia = scanner.nextLine();
            System.out.println("Nhap vao so trang : ");
            int soTrang = Integer.parseInt(scanner.nextLine());
            Sach sach = new Sach(maTaiLieu, tenNhaSanXuat, soBanPhatHanh, tenTacGia, soTrang);
            taiLieuList.add(sach);
        } else if (menu == 2) {
            System.out.println("Nhap vao so phat hanh : ");
            int soPhatHanh = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap vao thang phat hanh : ");
            int thangPhatHanh = Integer.parseInt(scanner.nextLine());
            TapChi tapChi = new TapChi(maTaiLieu, tenNhaSanXuat, soBanPhatHanh, soPhatHanh, thangPhatHanh);
            taiLieuList.add(tapChi);
        } else {
            System.out.println("Nhap ngay phat hanh : ");
            int ngayPhatHanh = Integer.parseInt(scanner.nextLine());
            Bao bao = new Bao(maTaiLieu, tenNhaSanXuat, soBanPhatHanh, ngayPhatHanh);
        }
    }

    private void xoaMaTaiLieu() {
        System.out.println("Nhập vào ma tai lieu:");
        String ma = scanner.nextLine();
        Predicate<TaiLieu> predicate = new Predicate<TaiLieu>() {
            @Override
            public boolean test(TaiLieu taiLieu) {
                int lastIndexOf = taiLieu.maTaiLieu.lastIndexOf(' ');
                String maTaiLieu = taiLieu.maTaiLieu.substring(lastIndexOf + 1);
                return maTaiLieu.equals(ma);
            }
        };
        taiLieuList.removeIf(predicate);
    }
    private void hienThiTTTl(){
        for (TaiLieu taiLieu : taiLieuList){
            System.out.println(taiLieu);
        }

    }
    private void timKiemTaiLieu(){
        String maTailieu = nhapMaTaiLieu();
        for (TaiLieu taiLieu : taiLieuList) {
            if (taiLieu.maTaiLieu.equals(maTailieu)) {
                System.out.println(taiLieu);
            }
        }
    }
    public void showMenu() {
        while (true) {
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Tìm kiếm tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin tài liệu");
            System.out.println("4. Xóa mã tài liẹu");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                themTailieu();
            } else if (menu == 2) {
                timKiemTaiLieu();
            } else if (menu == 3) {
                hienThiTTTl();
            } else if (menu == 4) {
                xoaMaTaiLieu();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }

}

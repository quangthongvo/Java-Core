package exercise05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private Scanner scanner = new Scanner(System.in);
    private List<CanBo> canBoList = new LinkedList<>();
    private void themCanBo(){
        System.out.println(" 1. CongNhan");
        System.out.println(" 2. KySu");
        System.out.println(" 3. NhanVien");
        System.out.println(" Chon menu");
        String menu = scanner.nextLine();
        if (menu.equals("1")){
            System.out.println("Nhap vao ho ten : ");
            String hoTen = scanner.nextLine();
            System.out.println("Nhap vao tuoi : ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Chon gioi tinh : ");
            System.out.println("1. NAM ");
            System.out.println("2. NU ");
            System.out.println("3. KHAC ");
            GioiTinh gioiTinh;
            System.out.println("Nhap vao dia chi : ");
            String diaChi = scanner.nextLine();
            System.out.println("Nhap vao bac");
            int bac = Integer.parseInt(scanner.nextLine());
            CongNhan congNhan = new CongNhan(hoTen , tuoi , gioiTinh , bac , diaChi );
            canBoList.add(congNhan);
        } else if (menu.equals("2")) {
            System.out.println("Nhap vao ho ten : ");
            String hoTen = scanner.nextLine();
            System.out.println("Nhap vao tuoi : ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Chon gioi tinh : ");
            System.out.println("1. NAM ");
            System.out.println("2. NU ");
            System.out.println("3. KHAC ");
            GioiTinh gioiTinh;
            System.out.println("Nhap vao dia chi : ");
            String diaChi = scanner.nextLine();
            System.out.println("Nhap vao nganh dao tao");
            String nganhDaoTao = scanner.nextLine();
            KySu kySu = new KySu(hoTen , tuoi , gioiTinh , nganhDaoTao , diaChi );
            canBoList.add(kySu);
        }else {
            System.out.println("Nhap vao ho ten : ");
            String hoTen = scanner.nextLine();
            System.out.println("Nhap vao tuoi : ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Chon gioi tinh : ");
            System.out.println("1. NAM ");
            System.out.println("2. NU ");
            System.out.println("3. KHAC ");
            GioiTinh gioiTinh;
            System.out.println("Nhap vao dia chi : ");
            String diaChi = scanner.nextLine();
            System.out.println("Nhap vao congViec ");
            String congViec = scanner.nextLine();
            NhanVien nhanVien= new NhanVien(hoTen , tuoi , gioiTinh , congViec , diaChi );
            canBoList.add(nhanVien);
        }
    }

}

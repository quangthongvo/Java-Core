package exercise01;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien){
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String momThi() {
        return "toan, ly, hoa";
    }
}

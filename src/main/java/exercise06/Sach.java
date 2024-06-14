package exercise06;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;
public Sach(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, String tenTacGia, int soTrang){
    super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
    this.tenTacGia = tenTacGia;
    this.soTrang = soTrang;
}

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTaiLieu=" + maTaiLieu +
                ", tenNhaSanXuat='" + tenNhaSanXuat + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}

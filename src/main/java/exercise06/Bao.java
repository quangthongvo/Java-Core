package exercise06;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;
    public Bao(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int ngayPhatHanh){
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTaiLieu=" + maTaiLieu +
                ", tenNhaSanXuat='" + tenNhaSanXuat + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}

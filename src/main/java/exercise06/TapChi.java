package exercise06;

import java.time.LocalDate;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhathanh;
    public TapChi(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int thangPhathanh, int soPhatHanh){
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhathanh = thangPhathanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhathanh=" + thangPhathanh +
                ", maTaiLieu=" + maTaiLieu +
                ", tenNhaSanXuat='" + tenNhaSanXuat + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}

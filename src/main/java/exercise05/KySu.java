package exercise05;

public class KySu extends CanBo{

    private String nganhDaoTao;
    public KySu (String hoTen,int tuoi , GioiTinh gioiTinh , String diaChi , String nganhDaoTao) {
        super(hoTen , tuoi , gioiTinh ,diaChi);
        this.nganhDaoTao = nganhDaoTao;

    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}

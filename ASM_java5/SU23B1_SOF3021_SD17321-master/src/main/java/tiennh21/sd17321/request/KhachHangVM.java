package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.KhachHang;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class KhachHangVM {
    private UUID id;
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")

    private String ho;
    @NotBlank(message = "Không được để trống")

    private String tenDem;
    @NotBlank(message = "Không được để trống")

    private String ten;
    @NotBlank(message = "Không được để trống")

    private String ngaySinh;
    @NotBlank(message = "Không được để trống")

    private String sdt;
    @NotBlank(message = "Không được để trống")

    private String diaChi;

    private String thanhPho;

    private String quocGia;
    @NotBlank(message = "Không được để trống")

    private String matKhau;

    public void loadFromEntityKH(KhachHang kh){
        this.setMa( kh.getMa() );
        this.setHo( kh.getHo() );
        this.setTenDem( kh.getTenDem() );
        this.setTen( kh.getTen() );
        this.setNgaySinh( kh.getNgaySinh() );
        this.setSdt( kh.getSdt() );
        this.setDiaChi( kh.getDiaChi() );
        this.setThanhPho( kh.getThanhPho() );
        this.setQuocGia( kh.getQuocGia() );
        this.setMatKhau( kh.getMatKhau() );
    }
}

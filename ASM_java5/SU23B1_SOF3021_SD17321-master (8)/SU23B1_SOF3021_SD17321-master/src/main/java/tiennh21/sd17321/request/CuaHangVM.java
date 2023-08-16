package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.CuaHang;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CuaHangVM {
    private UUID id;
    @NotBlank(message = "Không được để trống")

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

//    @NotBlank(message = "Không được để trống")
//    private String diaChi;
//
//    @NotBlank(message = "Không được để trống")
//    private String thanhPho;
//
//    @NotBlank(message = "Không được để trống")
//    private String quocGia;

    public void loadFromEntity(CuaHang ch)
    {
//        this.setId( ch.getId() );
        this.setMa( ch.getMa() );
        this.setTen( ch.getTen() );
//        this.setThanhPho( ch.getThanhPho() );
//        this.setQuocGia( ch.getQuocGia() );
//        this.setDiaChi( ch.getDiaChi() );
    }}

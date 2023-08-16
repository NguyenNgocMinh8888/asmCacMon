package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.SanPham;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SanPhamVM {
    private UUID id;
    @NotBlank(message = "Không được để trống")

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

    public void loadFromEntitySP(SanPham sanPham)
    {
        this.setMa( sanPham.getMa() );
        this.setTen( sanPham.getTen() );
    }
}

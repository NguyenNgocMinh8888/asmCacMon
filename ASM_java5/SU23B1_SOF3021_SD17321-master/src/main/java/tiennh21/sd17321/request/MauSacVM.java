package tiennh21.sd17321.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import tiennh21.sd17321.entities.MauSac;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MauSacVM {
    private UUID id;
    @NotBlank(message = "Không được để trống")

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

    public void loadFromEntityMS(MauSac ms)
    {
        this.setMa( ms.getMa() );
        this.setTen( ms.getTen() );
    }
}

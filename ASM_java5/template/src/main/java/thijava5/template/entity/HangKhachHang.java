package thijava5.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="HangKhachHang")
@Table(name="HangKhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HangKhachHang {
        @Id
        @Column(name = "MaHang")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String maHang;

        @Column(name = "TenHang")
        private String tenHang;

}

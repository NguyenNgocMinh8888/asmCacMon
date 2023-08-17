package com.example.demo.Enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HangKhachHang")
public class HangKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHang")
    private Long maHang;
    @Column(name = "TenHang")
    private String TenHang;
//    @ManyToOne()
//    @JoinColumn(name="MaHang")
//    private KhachHang khachHang;
}

package com.example.demo.controllers.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ChucVu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy =GenerationType.UUID)
   private UUID id;

    @Column(name = "Ma")
   private String ma;

    @Column(name = "Ten")
    private String ten;
}

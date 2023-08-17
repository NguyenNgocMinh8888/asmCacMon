package com.example.demo.Services;

import com.example.demo.Enitity.HangKhachHang;
import com.example.demo.Repostory.HangKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HangKhachHangService {
    @Autowired
    private HangKhachHangRepository hangKhachHangRepository;
    public List<HangKhachHang> getAllHKH(){
        return hangKhachHangRepository.findAll();
    }
}
